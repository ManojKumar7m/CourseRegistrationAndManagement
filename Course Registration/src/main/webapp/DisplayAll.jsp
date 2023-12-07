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
<h1 align="center">Students data</h1>
<br>
<form action="menu.jsp">
<h3><input class="submit" type="submit" value="Back"></h3>
</form>
<%
      ResultSet rs=null;
      Connection con=null;
       try{
    	   Class.forName("com.mysql.cj.jdbc.Driver");
   		String server="jdbc:mysql://localhost:3306/sam";
   			String password="Ms@1234";
   			 con=DriverManager.getConnection(server,"root",password);
   			String query="select * from student";
   			Statement st=con.createStatement();
   			rs=st.executeQuery(query);
   			
       }
catch(Exception e)
{  
	out.println("<h1 align='center'> Error occured</h1>");
		RequestDispatcher r=request.getRequestDispatcher("/options.jsp");
		r.include(request, response);
}     
%>
<table align="center" border="1">
<tr>
<th>Name</th>
<th>UserName</th>
<th>Email</th>
<th>password</th>
<th>rollno</th>
<th>place</th>
<th>Courses</th>
</tr>
<% if(rs!=null)
{
	while(rs.next())
	{  
%>
<tr>
<td><%=rs.getString("name") %></td>
<td><%=rs.getString("username") %></td>
<td><%=rs.getString("mail") %></td>
<td><%=rs.getString("password") %></td>
<td><%=rs.getString("rollno") %></td>
<td><%=rs.getString("place") %></td>
<td><%=rs.getString("courses") %></td>
</tr>
<% 
	} rs.close();}
if(con!=null)
{con.close();}
%>
</table>
</body>
</html>