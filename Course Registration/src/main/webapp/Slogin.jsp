<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
    body {
        font-family: 'Arial', sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f8f9fa;
        color: #333;
    }

    h1 {
        text-align: center;
        margin-top: 50px;
        color: #007bff;
    }

    table {
        margin: 20px auto;
    }

    td {
        padding: 10px;
    }

    input[type="text"],
    input[type="password"],
    input[type="submit"],
    input[type="reset"] {
        width: 100%;
        padding: 10px;
        margin: 5px 0;
        border: 1px solid #28a745;
        border-radius: 5px;
        box-sizing: border-box;
    }

    input[type="submit"],
    input[type="reset"],
    a {
        background-color: #28a745;
        color: white;
        text-decoration: none;
        padding: 10px 20px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }

    input[type="submit"]:hover,
    input[type="reset"]:hover,
    a:hover {
        background-color: #218838;
    }

    @media screen and (max-width: 600px) {
        h1 {
            font-size: 24px;
        }

        input[type="text"],
        input[type="password"],
        input[type="submit"],
        input[type="reset"],
        a {
            width: 50%;
        }
    }
</style>
<meta charset="ISO-8859-1">
<title>Student Login</title>
</head>
<body>
    <h1>Student Login</h1>
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
