<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Employee</h1>
	<f:form action="success" method="post">
		<table>

			<tr>
				<td>Name:</td>
				<td><f:input path="pName" /></td>
			</tr>


			<tr>
				<td>Country:</td>
				<td><f:input path="pCountry" /></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit" value="Add" />
				</td>
			</tr>

		</table>

	</f:form>
</body>
</html>