<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Only admins have access to the data</h1>
<h3 align='center'>
<form  action="adminops" method="get" ><input class="submit" type="submit" value="Add Courses" name='check'></form>
<p></p>
<form action="adminops" method="get"><input class="submit" type="submit" value="Add student" name='check'></form>
<p></p>
<form action="adminops" method="get"><input class="submit" type="submit" value="Delete student" name='check'></form>
<p></p>
<form  action="adminops" method="get"><input class="submit" type="submit" value="Update student" name='check'></form>
<p></p>
<form  action="adminops" method="get" ><input class="submit" type="submit" value="Display student" name='check'></form>
<p></p>
<form  action="adminops" method="get" ><input class="submit" type="submit" value="Display all student details" name='check'></form>
<p></p>
<form  action="adminops" method="get" ><input class="submit" type="submit" value="Logout" name='check'></form>

</h3>
</body>
</html>