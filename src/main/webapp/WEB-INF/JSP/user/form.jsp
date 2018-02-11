<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>User</title>


</head>
<body>
<spring:url value="/user/save" var="saveUrl"/>

<form:form action="${saveUrl}" modelAttribute="userForm" method="POST">
	<form:hidden path="id"/>
	<label>Name :</label>
	<form:input path="name"/><br>
	<button type="submit"> Save</button>

</form:form>

</body>
</html>