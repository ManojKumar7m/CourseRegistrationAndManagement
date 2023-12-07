<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*,jakarta.servlet.RequestDispatcher" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Update a specific student</h1>
<h1 align="center">Update your data</h1>
<br>
<h2 align="center">Fill all the columns</h2>
<br>
<form action="UpdateStudentData" method="post">
<table align="center">
<tr>
<td>Name : </td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>Username: </td>
<td><input type="text" name="username"></td>
</tr>
<tr>
<td>Password : </td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td> Previous gmail :</td>
<td><input type="text" name="pgmail"></td>
</tr>
<tr>
<td> New gmail :</td>
<td><input type="text" name="ngmail"></td>
</tr>
<tr>
<td>College :</td>
<td><input type="text" name="clg"></td>
</tr>
<tr><td>Select a course:</td><td>: <select name="course" multiple>
    <%
      ResultSet rs=null;
      Connection con=null;
       try{
    	   Class.forName("com.mysql.cj.jdbc.Driver");
   		String server="jdbc:mysql://localhost:3306/sam";
   			String password="Ms@1234";
   			 con=DriverManager.getConnection(server,"root",password);
   			String query="select * from acourses";
   			Statement st=con.createStatement();
   			rs=st.executeQuery(query);
   			
       }
catch(Exception e)
{  
	out.println("<h1 align='center'> Error occured</h1>");
		RequestDispatcher r=request.getRequestDispatcher("/options.jsp");
		r.include(request, response);
}    
       
       if(rs!=null)
       {
       	while(rs.next())
       	{ 
%>
    <option value=<%=rs.getString("cname") %>><%=rs.getString("cname") %></option>
    <%
       	}
       }
    %>
  </select></td></tr>

<br>
<tr><td><input  class="submit" type="submit" value="add"></td></tr>
</table>
</form>
<br>
<form action="menu.jsp">
<p align="center"><input class="submit"  type="submit" value="click to go back"></p>
</form>
</body>
</html>