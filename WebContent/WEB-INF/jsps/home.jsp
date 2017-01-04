<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Suguru's HP</title>
<style>
body {
	background-color: dodgerblue;
	color: white;
	font-family: arial;
}

h1 {
	text-align: center;
}

pre {
	font-family: arial;
	word-wrap: break-word;
}

.error {
	font-size: small;
	color: red;
	margin-left: 10px;
}
</style>
</head>
<body>
	<%-- Session:
	<%=session.getAttribute("name")%><p />

	Request:
	<%=request.getAttribute("name")%><p /> --%>

	<%-- 	Request (Using EL): ${name}
	<p />

	<c:out value="${name }"></c:out> --%>

	<sf:form method="post"
		action="${pageContext.request.contextPath}/response"
		commandName="profile">

		<table>

			<tr>
				<td>Name:</td>
				<td><sf:input path="name" name="name" type="text" /><br /> <sf:errors
						path="name" cssClass="error" /></td>
			</tr>
			<tr>
				<td>ID:</td>
				<td><sf:input path="id" name="id" type="text" /><br /> <sf:errors
						path="id" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><sf:input path="email" name="email" type="text" /><br />
					<sf:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Age:</td>

				<td><sf:input path="age" name="age" type="text" /> <br /> <sf:errors
						path="age" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Street address:</td>
				<td><sf:input path="street" name="street" type="text" /> <br />
					<sf:errors path="street" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><sf:input path="city" name="city" type="text" /> <br /> <sf:errors
						path="city" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td>State:</td>
				<td><sf:input path="state" name="state" type="text" /> <br />
					<sf:errors path="state" cssClass="error"></sf:errors></td>
			</tr>

			<tr>
				<td></td>
				<td><input value="Submit" type="submit" /></td>
			</tr>

		</table>

	</sf:form>

</body>
</html>