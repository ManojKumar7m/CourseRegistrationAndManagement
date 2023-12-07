<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
    
    table {
        margin: 20px auto;
    }

    td {
        padding: 10px;
    }

    
</style>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
    <h1 align="center">Admin Login</h1>
    <form action="admcheck" method="get">
        <table align="center">
            <tr>
                <td>Username</td>
                <td><input type="text" name="aname"></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="apasword"></td>
            </tr>
            <tr>
                <td><input class="submit" type="submit" value="Submit"></td>
                <td><input class="submit" type="reset" value="Reset"></td>
            </tr>
        </table>
    </form>
    <form action="welcome.html">
        <p align="center"><input class="submit" type="submit" value="Go Back"></p>
    </form>
</body>
</html>
