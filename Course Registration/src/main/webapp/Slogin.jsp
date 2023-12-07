<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
  

    table {
        margin: 20px auto;
    }

    td {
    text-align:center;
        padding: 10px;
    }

    
</style>
<meta charset="ISO-8859-1">
<title>Student Login</title>
</head>
<body>
    <h1 align="center">Student Login</h1>
    <form action="scheck">
        <table align="center">
            <tr>
                <td>Username</td>
                <td><input type="text" name="sname"></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="spassword"></td>
            </tr>
            <tr>
                <td><input class="submit" type="submit" value="Submit"></td>
                <td><input class="submit" type="reset" value="Reset"></td>
            </tr>
            <tr>
                <td colspan="2">New User</td>
            </tr>
            <tr>
                <td colspan="2"><a href="sregister.jsp">Register here</a></td>
            </tr>
        </table>
    </form>
    <form action="welcome.html">
        <p align="center"><input class="submit" type="submit" value="Go Back"></p>
    </form>
</body>
</html>
