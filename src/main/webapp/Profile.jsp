<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	function deleteUser(mobile) {
		alert('triggred Delete button ' + mobile);
		document.forms[0].action = "${pageContext.request.contextPath}/deleterecord?mobile="+ mobile;
		document.forms[0].method = "post";
		document.forms[0].submit();
		//submit to deleteUser action from here 
	}

	function editUser(mobile) {
		
		alert('triggered Edit button ' + mobile);
		document.forms[0].action = "${pageContext.request.contextPath}/editrecord?mobile="+ mobile;
		document.forms[0].method = "post";
		document.forms[0].submit(); 
	} 
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile Page</title>
</head>
<body>
<%-- ${allusers} --%>
<form action="">
	<!-- Need to writh for each in jsp to iterate userList -->
	<table border="3">
		<tr>
		 	<th bgcolor="#FF000">Name</th>
		 	<th bgcolor="#FF000">Mobile</th>
		 	<th bgcolor="#FF000">City</th>
		 	<th bgcolor="#FF000">Country</th>
		</tr>
		<core:forEach  var="userObject" items="${allusers}">
			<tr>
				<td>${userObject.name}</td>
				<td>${userObject.mobile}</td>
				<td>${userObject.city}</td>
				<td>${userObject.country}</td>
				<td><input type="button" onclick="editUser('${userObject.mobile}')" value="Edit"></td>
				<td><input type="button" onclick="deleteUser('${userObject.mobile}')" value="Delete"></td>
			</tr>
		</core:forEach>
	</table>
	</form>


</body>
</html>