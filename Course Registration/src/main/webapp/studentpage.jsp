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
<h1>Hello</h1><br>
<h2>Welcome  ${stdname} !!!</h2><br><br>
<%
      ResultSet rs=null;
      Connection cn=null;
      try{
    	   Class.forName("com.mysql.cj.jdbc.Driver");
   		String server="jdbc:mysql://localhost:3306/sam";
   			String password="Ms@1234";
   			 cn=DriverManager.getConnection(server,"root",password);
   			String qr="select * from acourses where username=?";
   			PreparedStatement st=cn.prepareStatement(qr);
   			st.setString(1,stdname);
   			rs=st.executeQuery(qr);
   			
   			
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
    <h1> </h1>
    <%
       	}
       }
    %>

</h1>
</body>
</html>