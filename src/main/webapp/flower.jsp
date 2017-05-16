<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Flowers</title>
</head>
<body>
<div style="text-align: center; margin-top: 15%">

	<form action="newFlower" metod="post">
	
	<input type="text" name="flowerName" placeholder="Enter Flower">
	<br>
	<input type="text"	name="flowerColor" placeholder="Enter color flower">
	<br>
	<input type="number" name="price" placeholder="Enter flower price">
	<br>	
	<button>save Flowers</button>
	
	</form>



</div>

</body>
</html>