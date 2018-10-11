<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:if test="${!listObj.isEmpty()}">
<c:forEach items="${listObj}" var="abc">
	
	${abc.getName()}
	${abc.getAge()}<br>
	
</c:forEach>

</c:if>

<c:if test="${listObj.isEmpty()}">

<h1>Data Not Found</h1>

</c:if>


</body>
</html>