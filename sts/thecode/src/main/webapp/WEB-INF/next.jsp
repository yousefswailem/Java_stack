<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <ul style="margin: 0 auto;">
        <li>This</li>
        <li>is</li>
        <li>secret</li>
        <li>info</li>
        <li>for</li>
        <li>me</li>
    </ul>
    
    <c:out value="${th_code}"></c:out>

</body>
</html>