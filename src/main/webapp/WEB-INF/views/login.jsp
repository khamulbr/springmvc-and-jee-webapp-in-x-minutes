<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahoo from JSP</title>
</head>
<body>
	<form action="/spring-mvc/login" method="POST">
		<p><font color="red">${errorMessage}</font></p>
		Enter your name <input type="text" name="name"> <br/>
		Enter your password <input type="password" name="password"> <br/>
		<input type="submit" value="Login">
	</form>
</body>
</html>