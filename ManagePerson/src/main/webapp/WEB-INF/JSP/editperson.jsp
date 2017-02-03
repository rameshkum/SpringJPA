<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="updated" method="post">
<table>
<tr>
<td>PID: </td>
<td><f:input  path="pId" value="${pid }" readonly="true"/></td>
</tr>
<tr>
<td>Name:</td>
<td><f:input path="pName"/></td></tr>
<tr>
<td>Country</td>
<td><f:input path="pCountry"/></td></tr>
<tr>
<td colspan="2" align="center"> <input type="submit"/> </td>
<td></td></tr>
</table>
</f:form>

<h2>Person Data:</h2>
	<br>

	<table border="1">
		<tr>
			<th>PID</th>
			<th>Name</th>
			<th>Country</th>

		</tr>

		<c:forEach items="${pd}" var="person">
			<tr>
				<td><c:out value="${person.getPId()}" /></td>
				<td><c:out value="${person.getPName()}" /></td>
				<td><c:out value="${person.getPCountry()}" /></td>
				<td>
				<c:url var="url" value="/edit">
						<c:param name="editid" value="${person.getPId() }" />
					</c:url> <a href="${url}">Edit</a>
					
					</td>
				
				<td><c:url var="url" value="/remove">
						<c:param name="id" value="${person.getPId() }" />
					</c:url> <a href="${url}">Delete</a></td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>