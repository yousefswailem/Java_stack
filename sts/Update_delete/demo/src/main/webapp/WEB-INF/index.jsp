<%@ page language="java" contentType="text/html; charset=ISO-8859-1"spageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    
<h1>All Books</h1>
<table>
    <thead>
        <tr>
            <th>Title</th>
            <th>Description</th>
            <th>Language</th>
            <th>Number of Pages</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${books}" var="book">
        <tr>
            <td><c:out value="${book.title}"/></td>
            <td><c:out value="${book.description}"/></td>
            <td><c:out value="${book.language}"/></td>
            <td><c:out value="${book.numberOfPages}"/></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
<a href="/books/new">New Book</a>
<h1><c:out value="${book.title}"/></h1>
<p>Description: <c:out value="${book.description}"/></p>
<p>Language: <c:out value="${book.language}"/></p>
<p>Number of pages: <c:out value="${book.numberOfPages}"/></p>
<a href="/books/${book.id}/edit">Edit Book</a>
<form action="/books/${book.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>

</body>
</html>