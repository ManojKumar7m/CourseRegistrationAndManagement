<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,jakarta.servlet.RequestDispatcher,java.io.PrintWriter" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Add new course into the list </h1>
<form  action="Newcourse" align="center">
<h2 align="center">Enter name of new Course to be added</h2>
<table align="center">
<tr>
<td>Name of course</td><td><input type="text" name="newcrs"></td>
</tr>
<tr>
<td>Fee</td><td><input type="text" name="fee"></td>
</tr>
</table>
<input type="submit" value="Add Course">
</form>

</body>
</html>