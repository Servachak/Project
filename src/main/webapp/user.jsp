<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User to DB</title>
</head>
<body>
<div style="text-align: center; margin-top: 10%">

	<form action="newUser" method="post">
	
		<input type="text" name="userName" placeholder="User name">
		<br>
		<input type="email" name="userEmail" placeholder="User Email">
		<br>
		<input type="password" name="userPassword" placeholder="User Password">
		<br>
		<input type="text" name="userSex"placeholder="User Sex">
		<br>
		<button>save user</button>
		
	</form>

</div>
</body>
</html>