<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<html>
<head>
<title>Home</title>

</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>

	<form action="/shop_icm/test" method="post" name="commodity">
		<table>
			<tr>
				<td>cid:</td>
				<td><input name="cid" type="number" /></td>
			</tr>
			<tr>
				<td>cname:</td>
				<td><input name="cname" type="text" /></td>
			</tr>
			<tr>
				<td>state:</td>
				<td>
					全部<input name="state" type="radio" value="0" checked="checked">
					在售<input name="state" type="radio" value="1">
					下架<input name="state" type="radio" value="-1">
				</td>
			</tr>
			<tr>
				<td>sales_price:</td>
				<td><input name="sales_price" type="text" /></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
				<td><input type="reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>
