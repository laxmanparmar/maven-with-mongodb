<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Home Page</title>


</head>
<body>
<spring:url value="/user/add" var="addUrl"/>

<a href="${addUrl}">Add</a>

<h1>User List</h1>
<br>

<table border="1">
	<thead>
	<tr>
	<th>Name</th>
	<th colspan="2">
	Action
	</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${listUser }" var="user">
	<tr>
	<td>${user.name}</td>
	<td>
	<spring:url value="/user/update/${user.id }" var="updateUrl"/>
	<a href="${updateUrl}" >Update</a>
	<spring:url value="/user/delete/${user.id }" var="deleteUrl"/>
	<a href="${deleteUrl}">Delete</a>
	</td>
	</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>