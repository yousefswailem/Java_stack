<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p> location:<c:out value="${city_name}"/> </p>
<p>Language:<c:out value="${game}"/></p>
<p>name:<c:out value="${name}"/></p>

</body>
</html>