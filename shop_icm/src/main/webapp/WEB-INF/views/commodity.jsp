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
	var query = {};
	search(url, null, tname, colname, defaultDisplay);
	
	
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
				<!-- 数据容器 -->
				<div id="data-context" style="min-height: 600px;margin:15px 0;">
					
				</div>
				<!-- 翻页插件 -->
				<div id="page-context">
					<ul class="uk-pagination"></ul>
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