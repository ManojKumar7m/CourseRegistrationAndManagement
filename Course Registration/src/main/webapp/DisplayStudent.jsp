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
<%
ResultSet rs=null;
Connection con=null;
 try{
	 String gmail=request.getParameter("gmail");
	   Class.forName("com.mysql.cj.jdbc.Driver");
		String server="jdbc:mysql://localhost:3306/sam";
			String password="Ms@1234";
			 con=DriverManager.getConnection(server,"root",password);
			String query="select * from student where mail='"+gmail+"';";
			Statement st=con.createStatement();
			rs=st.executeQuery(query);
 }
catch(Exception e)
{  
out.println("<h1 align='center'> Error occured</h1>");
	RequestDispatcher r=request.getRequestDispatcher("/menu.jsp");
	r.include(request, response);
}   
%>
<%  try{
	rs.next();
  String g=rs.getString("name");
%>
<h1 align="center">Student details</h1>
<br>
<table align="center">
<tr>
<td>Name :</td>
<td><%=g%></td>
</tr>
<tr>
<td>UserName :</td>
<td><%=rs.getString("username")%></td>
</tr>
<tr>
<td>Gmail :</td>
<td><%=rs.getString("mail")%></td>
</tr>
<tr>
<td>password :</td>
<td><%=rs.getString("password")%></td>
</tr>
<tr>
<td>College :</td>
<td><%=rs.getString("college")%></td>
</tr>
<tr>
<td>Place:</td>
<td><%=rs.getString("place")%></td>
</tr>
<tr>
<td>Courses:</td>
<td><%=rs.getString("Courses")%></td>
</tr>
</table>
<form action="Std.jsp">
<p align="center"><input type="submit" value="click to go back"></p>
</form>
<%con.close();
 rs.close();
%>
<% }
catch(Exception e)
{
	con.close();
	 rs.close();
	 out.println("<h1 align='center'> invalid student email</h1>");
	 RequestDispatcher rdd=request.getRequestDispatcher("/sdt.jsp");
	 rdd.include(request,response);
}
%>
</body>
</html>