<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<form action="Register" method="post">
		Name : <input type="text" name="name" /></br> Mobile : <input type="text"
			name="mobile" /></br> City : <input type="text" name="city" /></br> Country :
		<input type="text" name="country" /></br> <input type="submit"
			value="Register">
	</form>
	<a href="Login.jsp">Login</a>
	<a href="Admin result.jsp">Admin</a>
</body>
</html>