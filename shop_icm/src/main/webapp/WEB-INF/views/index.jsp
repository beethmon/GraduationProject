<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="UTF-8">
<title>超市进存销管理系统</title>

<link rel="stylesheet" type="text/css" href="css/uikit.css">
<link rel="stylesheet" type="text/css" href="css/custom.css">

<script src="js/jquery-1.11.1.js"></script>
<script src="js/uikit.js"></script>
<script src="js/myjs.js"></script>

<!-- filling data -->
<script src="js/filling/index.js"></script>

<!-- myjs -->
</head>
<body class="tm-body">
	<div class="tm-sidebar">
		<nav class="uk-navbar tm-sidebar-nav">
			<i class="tm-toggle-icon uk-icon-navicon" style="margin: 30px 15px"></i>
			<ul class="uk-navbar-nav">
				<li class="uk-active"><a href=""><i class="uk-icon-home"></i>首页</a>
				</li>
				<li class="uk-parent" data-uk-dropdown>
					<a href="commodity"><i class="uk-icon-archive"></i>商品</a>
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
					<a href=""><img src="image/logo.png" alt="shop_logo"></a>
				</div>
			</div>
			<div class="tm-context">
				<div class="uk-grid uk-grid-match" data-uk-grid-margin>
					<div class="uk-width-medium-1-2 uk-width-small-1-1">
						<div class="uk-panel uk-panel-box uk-flex tm-pb">
							<a href="commodity">
								<div class="tm-pb-pic">
									<i class="uk-icon-archive"></i>
									<div>商 品</div>
								</div>
							</a>
							<div class="tm-pb-text">
								<h3 class="uk-panel-title">库存少的商品:</h3>
								<table class="uk-table">
									<c:forEach var="stock" items="${stocks}" begin="0" end="2">
										<tr>
											<td><c:out value="${stock.comm.cname}"></c:out></td>
											<td><c:out value="${stock.num}"></c:out>(个/瓶/kg)</td>
										</tr>
									</c:forEach>
								</table>
							</div>
						</div>
					</div>
					<div class="uk-width-medium-1-2 uk-width-small-1-1">
						<div class="uk-panel uk-panel-box uk-flex tm-pb">
							<a href="">
								<div class="tm-pb-pic">
									<i class="uk-icon-truck"></i>
									<div>订 单</div>
								</div>
							</a>
							<div class="tm-pb-text">
								<h3 class="uk-panel-title">最近进货:</h3>
								<c:forEach var="poi" items="${pPurchaseOrderItems}" begin="0"
										end="3">
										<tr>
											<td><c:out value="${poi.comm.cname}"></c:out></td>
											<td><c:out value="${poi.num}"></c:out>(个/瓶/kg)</td>
											<td><c:out value="${poi.sum}"></c:out>元</td>
										</tr>
									</c:forEach>
							</div>
						</div>
					</div>
				</div>
				<div class="uk-grid uk-grid-match" data-uk-grid-margin>
					<div class="uk-width-medium-1-2 uk-width-small-1-1">
						<div class="uk-panel uk-panel-box uk-flex tm-pb">
							<a href="">
								<div class="tm-pb-pic">
									<i class="uk-icon-shopping-cart"></i>
									<div>销 售</div>
								</div>
							</a>
							<div class="tm-pb-text">
								<h3 class="uk-panel-title">本日热销商品:</h3>
								<table class="uk-table">
									<c:forEach var="salesView" items="${salesView}" begin="0"
										end="3">
										<tr>
											<td><c:out value="${salesView.commodity.cname}"></c:out></td>
											<td><c:out value="${salesView.num}"></c:out>(个/瓶/kg)</td>
											<td><c:out value="${salesView.sum}"></c:out>元</td>
										</tr>
									</c:forEach>
								</table>
							</div>
						</div>
					</div>
					<div class="uk-width-medium-1-2 uk-width-small-1-1">
						<div class="uk-panel uk-panel-box uk-flex tm-pb">
							<a href="">
								<div class="tm-pb-pic">
									<i class="uk-icon-group"></i>
									<div>雇 员</div>
								</div>
							</a>
							<div class="tm-pb-text"></div>
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