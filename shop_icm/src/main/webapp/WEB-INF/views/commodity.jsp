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
<script src="${contextPath }/js/myjs.js"></script>

<!-- filling data -->
<script type="text/javascript">
	var json;
	var url = "${contextPath}${path}/json/15/";
	var colname = {"ccodes":"CCodes","sales_price":"单价(￥)","num":"库存(个/kg)","state":"状态"};
	var defaultDisplay = fillingDataWith_UK_Panel;
	var tname = "cname";
	var gquery = {};
	$(function(){
		search(url, null, tname, colname, defaultDisplay);
        // 绑定搜索的表单事件
		$("#search").submit(function(){
			var query = $(this).serializeJson();
			gquery = query;
			search(url, query, tname, colname, defaultDisplay);
			return false;
		});
        // 新增/修改窗体打开与关闭事件事件
        $('#insert').on({
            'show.uk.modal': function(e){
                console.log("Modal is visible.");
                console.log(e);
            },
            'hide.uk.modal': function(){
                console.log("Element is not visible.");
                $("#insert_form input[type='reset']").click();
            }
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
                            <form id="search" action="" class="uk-form uk-form-horizontal">
                                <div class="uk-form-row">
                                    <input type="text" id="search_cname" class="uk-width-3-4" name="cname" placeholder="Commodity name">
                                    <button class="uk-button">Search</button>
                                </div>
                            </form>
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
                                    <label class="uk-form-label" for="">状态</label>
                                    <div class="uk-form-controls">
                                        <input type="radio" id="form-s-r1" name="radio" value="1">
                                        <label for="form-s-r1">在售</label>
                                        <label><input type="radio" name="radio" value="-1">下架</label>
                                    </div>
                                </div>
                                <div class="uk-form-row">
                                    <label class="uk-form-label" for="stock">库存</label>
                                    <div class="uk-form-controls">
                                        <input type="number" id="stock" name="Num" placeholder="0.000">
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
                <div id="update" class="uk-modal">
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
                                <label class="uk-form-label" for="">状态</label>
                                <div class="uk-form-controls">
                                    <input type="radio" id="form-s-r1" name="radio" value="1">
                                    <label for="form-s-r1">在售</label>
                                    <label><input type="radio" name="radio" value="-1">下架</label>
                                </div>
                            </div>
                            <div class="uk-form-row">
                                <label class="uk-form-label" for="stock">库存</label>
                                <div class="uk-form-controls">
                                    <input type="number" id="stock" name="Num" placeholder="0.000">
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