<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Page</title>
</head>
<body>
<form action="updateRecord" method="POST">
		Name : <input type="text" name="name" value="${editrecord.name}" ><br>
		 Mobile : <input type="text" name="mobile" value="${editrecord.mobile}" readonly="readonly"><br>
		 City : <input type="text" name="city" value="${editrecord.city}"><br>
			  Country :
		<input type="text" name="country" value="${editrecord.country}"><br>
		 <input type="submit"
			value="Update">
	</form>

</body>
</html>