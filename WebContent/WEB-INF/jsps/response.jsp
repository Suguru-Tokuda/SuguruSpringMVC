<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Response</title>
<style>
body {
	background-color: dodgerBlue;
	color: white;
	font-family: arial;
	font-size: small;
	font-weight: normal;
}
</style>
</head>
<body>
	<form method="get" action="${pageContext.request.contextPath}/home">
		<h3>${response}</h3>
		<br />
		<input type="submit" value="Back" />
	</form>
</body>
</html>