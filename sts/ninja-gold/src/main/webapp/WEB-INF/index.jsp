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
<h1>Your Gold: <c:out value="${amount}"/></h1>
    <form action="/farm" method="POST">
        <h2>Farm</h2>
        <p>(earns 10-20 gold)</p>
        <a href="/farm" style="border:solid;background-color:red;color:black;">Find Gold!</a>
    </form>
    <form action="/cave" method="POST">
        <h2>Cave</h2>
        <p>(earns 5-10 gold)</p>
        <a href="/cave" style="border:solid;background-color:red;color:black;">Find Gold!</a>
    </form>
     <form action="/house" method="POST">
        <h2>House</h2>
        <p>(earns 2-5 gold)</p>
        <a href="/house" style="border:solid;background-color:red;color:black;">Find Gold!</a>
    </form>
     <form action="/casino" method="POST">
        <h2>Casino</h2>
        <p>(earns/Takes 0-50 gold)</p>
        <a href="/casino" style="border:solid;background-color:red;color:black;">Find Gold!</a>
    </form>
</body>
</html>