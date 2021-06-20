<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/form" method="POST">
    <input type="text" name="name" placeholder="Your Name">
<br><br>
    <label for="city">Dojo Location</label>
    <select id="city" name="loc" style="width:150px;">
        <option value="San Jose">San Jose</option>
        <option value="New York">New York</option>
        <option value="Washington">Washington</option>
      </select>
      <br>
      <br>
      <label for="game">Favorite language:</label>
      <select id="game" name="lang" style="width:150px;">
        <option value="python">python</option>
        <option value="c">c</option>
        <option value="java">java</option>
      </select>
       <button type="submit" >Button</button>
    </form>
</body>
</html>