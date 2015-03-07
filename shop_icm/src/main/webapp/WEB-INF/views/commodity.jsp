<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="UTF-8">
<title>超市进存销管理系统</title>

<link rel="stylesheet" type="text/css"
	href="${contextPath }/css/uikit.css">
<link rel="stylesheet" type="text/css"
	href="${contextPath }/css/custom.css">

<script src="${contextPath }/js/jquery-1.11.1.js"></script>
<script src="${contextPath }/js/jquery.scrollTo.js"></script>
<script src="${contextPath }/js/uikit.js"></script>
<script src="${contextPath }/js/components/pagination.js"></script>
<script src="${contextPath }/js/components/notify.js"></script>
<script src="${contextPath }/js/myjs.js"></script>

<!-- filling data -->
<script type="text/javascript">

    $(function(){
        dataProcessUtil.url =  "${contextPath }${path}/json/"
        dataProcessUtil.pSize = 15;
        dataProcessUtil.pIndex = 1;
        dataProcessUtil.pageLocation = "#page-context";
        dataProcessUtil.location = "#data-context";
        dataProcessUtil.colname = {"ccodes":"CCodes","sales_price":"单价(￥)","num":"库存(个/kg)","state":"状态"};
        dataProcessUtil.tname = "cname";
        dataProcessUtil.defaultDisplay = dataProcessUtil.fillingDataWith_UK_Panel;
        dataProcessUtil.getData();

        //以下方法没有重用性
        //查询
        $("form#search").submit(function(){
            var cname = $("form#search input[name=cname]").val();
            var query = {};
            query.cname = cname;
            dataProcessUtil.search(query)
            return false;
        });
        //插入
        $("form#insert_form").submit(function(){
//            var insert = $("#insert_form").serializeJson();
            //不要重用的自己封装
            var flag = true;
            var insert = {};
            var cname = $("form#insert_form input[name=cname]").val();
            var sales_price = $("form#insert_form input[name=sales_price]").val();
            var state = $("form#insert_form input[name=state][type=radio][checked=checked]").val();
            var num = $("form#insert_form input[name=num]").val();
            flag = /^\d+(\.\d+)?$/.test(num)&& /^\d+(\.\d+)?$/.test(sales_price)
            &&""!=cname&&""!=sales_price&&""!=state&&""!=num?flag:false;
            if(flag){
                insert.cname=cname;
                insert.sales_price=sales_price;
                insert.state=state;
                insert.num=num;
                dataProcessUtil.commitSimpleObj("add",insert);
            }else {
                $.UIkit.notify({
                    message: "<i class='uk-icon-close'></i> 数据有误,请修改",
                    timeout: 2000,
                    pos: 'top-center',
                    status: 'danger'
                });
            }
            return false;
        });
        //修改
        $("form#update_form").submit(function(){
            var flag = true;
            var update = {};
            var cid = $("form#update_form input[name=cid]").val();
            var cname = $("form#update_form input[name=cname]").val();
            var sales_price = $("form#update_form input[name=sales_price]").val();
            var state = $("form#update_form input[name=state][type=radio][checked=checked]").val();
            var num = $("form#update_form input[name=num]").val();
            flag = /^\d+(\.\d+)?$/.test(num)&& /^\d+(\.\d+)?$/.test(sales_price)
            &&""!=cname&&""!=sales_price&&""!=state&&""!=num?flag:false;
            if(flag){
                update.cid=cid;
                update.cname=cname;
                update.sales_price=sales_price;
                update.state=state;
                update.num=num;
                console.log(update);
                dataProcessUtil.commitSimpleObj("update",update);
            }else {
                $.UIkit.notify({
                    message: "<i class='uk-icon-close'></i> 数据有误,请修改",
                    timeout: 2000,
                    pos: 'top-center',
                    status: 'danger'
                });
            }
            return false;
        });
    });
</script>

<!-- myjs -->
</head>
<body class="tm-body">
	<div class="tm-sidebar">
		<nav class="uk-navbar tm-sidebar-nav">
			<i class="tm-toggle-icon uk-icon-navicon" style="margin: 30px 15px"></i>
			<ul class="uk-navbar-nav">
				<li class=""><a href="${contextPath}"><i class="uk-icon-home"></i>首页</a>
				</li>
				<li class="uk-parent uk-active" data-uk-dropdown>
					<a href="${contextPath}/commodity"><i class="uk-icon-archive"></i>商品</a>
				</li>
				<li class="uk-parent" data-uk-dropdown>
					<a href=""><i class="uk-icon-truck"></i>进货</a>
					<div class="uk-dropdown uk-dropdown-navbar">
						<ul class="uk-nav uk-nav-navbar">
							<li><a href="">信息统计</a></li>
							<li><a href="">订单管理</a></li>
							<li><a href="">进货</a></li>
						</ul>
					</div>
				</li>
				<li class="uk-parent" data-uk-dropdown>
					<a href=""><i class="uk-icon-shopping-cart"></i>售货</a>
					<div class="uk-dropdown uk-dropdown-navbar">
						<ul class="uk-nav uk-nav-navbar">
							<li><a href="">信息统计</a></li>
							<li><a href="">销售管理</a></li>
							<li><a href="">销售</a></li>
						</ul>
					</div>
				</li>
				<li class="uk-parent"><a href=""><i class="uk-icon-group"></i>雇员</a>
				</li>
				<li class="uk-parent"><a href=""><i class="uk-icon-user"></i>登入</a>
				</li>
			</ul>
		</nav>
	</div>
	<div class="tm-page">
		<div class="uk-container uk-container-center">
			<div class="uk-grid tm-brand">
				<div class="uk-width-medium-1-4 uk-width-small-1-2">
					<a href="${contextPath}">
						<img src="${contextPath }/image/logo.png" alt="shop_logo">
					</a>
				</div>
			</div>
			<div class="tm-context">
				<!-- search -->
				<div class="uk-grid">
					<div class="uk-width-1-2 uk-container-center">
                        <form id="search" method="post" class="uk-form uk-form-horizontal">
                            <div class="uk-form-row">
                                <input type="text" id="search_cname" class="uk-width-3-4" name="cname" placeholder="Commodity name">
                                <button class="uk-button">Search</button>
                            </div>
                        </form>
                    </div>
				</div>
                <div class="uk-grid">
                    <div class="uk-width-1-1 uk-text-right">
                        <i class="uk-icon-button uk-icon-th-large" onclick="dataProcessUtil.change(dataProcessUtil.fillingDataWith_UK_Panel)"></i>
                        <i class="uk-icon-button uk-icon-th-list" onclick="dataProcessUtil.change(dataProcessUtil.fillingDataWithTable)"></i>
                    </div>
                </div>
				<!-- 数据容器 -->
				<div id="data-context" style="min-height: 550px;margin:15px 0;">
					
				</div>
				<!-- 翻页插件 -->
				<div id="page-context">
					<ul class="uk-pagination"></ul>
				</div>
				<div>
					<i class="uk-icon-button uk-icon-large uk-icon-plus-circle" style="color:#ea4a61;position:fixed;bottom:70px;right:70px;" data-uk-modal="{target:'#insert'}"></i>
				</div>
                <div class="tm-plugin">
                    <div id="insert" class="uk-modal">
                        <div class="uk-modal-dialog">
                            <a class="uk-modal-close uk-close" href=""></a>
                            <h1>新增</h1>
                            <form id="insert_form" type="ajax" action="" class="uk-form uk-form-horizontal">
                                <div class="uk-form-row">
                                    <label class="uk-form-label" for="cname">商品名</label>
                                    <div class="uk-form-controls">
                                        <input type="text" id="cname" name="cname" placeholder="Commodity name">
                                    </div>
                                </div>
                                <div class="uk-form-row">
                                    <label class="uk-form-label" for="sales_price">价格</label>
                                    <div class="uk-form-controls">
                                        <input type="text" id="sales_price" name="sales_price" placeholder="Sales price">
                                    </div>
                                </div>
                                <div class="uk-form-row">
                                    <label class="uk-form-label">状态</label>
                                    <div class="uk-form-controls">
                                        <input type="radio" id="form-s-r1" name="state" value="1" checked="checked">
                                        <label for="form-s-r1">在售</label>
                                        <label><input type="radio" name="state" value="-1">下架</label>
                                    </div>
                                </div>
                                <div class="uk-form-row">
                                    <label class="uk-form-label" for="stock">库存</label>
                                    <div class="uk-form-controls">
                                        <input type="number" id="stock" name="num" placeholder="0.000"  value="0">
                                    </div>
                                </div>
                                <div class="uk-form-row">
                                    <div class="uk-form-controls">
                                        <button class="uk-button uk-button-success">Submit</button>
                                        <input type="reset" class="uk-button" value="Reset"/>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <div id="update_info" class="uk-modal">
                    <div class="uk-modal-dialog">
                        <a class="uk-modal-close uk-close" href=""></a>
                        <h1>修改</h1>
                        <form id="update_form" method="post" action="" class="uk-form uk-form-horizontal">
                            <input type="hidden" name="cid">
                            <div class="uk-form-row">
                                <label class="uk-form-label" for="cname">商品名</label>
                                <div class="uk-form-controls">
                                    <input type="text" name="cname" placeholder="Commodity name">
                                </div>
                            </div>
                            <div class="uk-form-row">
                                <label class="uk-form-label" for="sales_price">价格</label>
                                <div class="uk-form-controls">
                                    <input type="text"  name="sales_price" placeholder="Sales price">
                                </div>
                            </div>
                            <div class="uk-form-row">
                                <label class="uk-form-label">状态</label>
                                <div class="uk-form-controls">
                                    <input type="radio"  name="state" value="1">
                                    <label for="form-s-r1">在售</label>
                                    <label><input type="radio" name="state" value="-1">下架</label>
                                </div>
                            </div>
                            <div class="uk-form-row">
                                <label class="uk-form-label" for="stock">库存</label>
                                <div class="uk-form-controls">
                                    <input type="number"  name="num" placeholder="0.000" value="0">
                                </div>
                            </div>
                            <div class="uk-form-row">
                                <div class="uk-form-controls">
                                    <button class="uk-button uk-button-success">Submit</button>
                                    <input type="reset" class="uk-button" value="Reset"/>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="tm-footer uk-grid">
                <div class="uk-width-1-1">
                    <hr />
                </div>
                <br />
                <p>
                    Made by gw.<br />used uikit
                </p>
            </div>
		</div>
	</div>
</body>
</html>