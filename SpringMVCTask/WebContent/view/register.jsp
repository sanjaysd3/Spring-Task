<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<form:form action="registeruser.do" modelAttribute="userObj">
		Name:<form:input path="name" /><br><br>
		Age:<form:input path="age" /><br><br>
		Mail:<form:input path="mail"/><br><br>
		Mobile:<form:input path="mobile"/><br><br>
		<input type="submit" value="Register"/>
		</form:form> 
</body>
</html>