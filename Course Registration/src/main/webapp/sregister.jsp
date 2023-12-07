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
<h2 style="color:red;text-align:center;">Fill all the Details</h2>
<form action="addstudent">
<table align="center" style="">
<tr><td>Name </td><td>: <input type="text" name="name"></td></tr>
<tr><td>Email</td><td>: <input type="text" name="email"><br><br></td></tr>
<tr><td>Username </td><td>: <input type="text" name="username"><br><br></td></tr>
<tr><td>College </td><td>: <input type="text" name="clg"><br><br></td></tr>
<tr><td>Rollnumber</td><td>: <input type="text" name="rn"><br><br></td></tr>
<tr><td>Place</td><td>: <input type="text" name="pls"><br><br></td></tr>
<tr><td>Password </td><td>: <input type="password" name="ps1"><br><br></td></tr>
<tr><td>Confirm  </td><td>: <input type="password" name="ps2"><br><br></td></tr>
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
  <tr ><td ><input type="submit" value="create account" ></td>
  <td><a href=Slogin.jsp> <input   type="button" value="Exit"></a></td></tr>
</table>
<br>


</form>
</body>
</html>