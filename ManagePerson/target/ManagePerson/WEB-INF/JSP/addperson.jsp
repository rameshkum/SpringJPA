<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" import="com.cyb.bean.Person, java.util.*"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	
	
	<h2>Person Data:</h2><br>
	<%-- ${ pd.getPName() } --%>
	
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
                        <td><c:out value="${person.getPCountry()}"/></td>
                        <td> <a href="">Edit</a></td>
                        <td>  <a href="<c:url var="deleteperson" value="/delete"/>">DELETE</a> 
                        <form id="${person.getPId()}" method="POST">
                    <input id="person" name="person" type="hidden" value="${person.getPId()}"/>
                </form>
                         </td>
                        </tr>
                </c:forEach>

            </table>  
	<a href="/delete/${person.getPId()}">Delete</a>
</body>
</html>