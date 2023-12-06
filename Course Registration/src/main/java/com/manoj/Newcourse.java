package com.manoj;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class Newcourse
 */
public class Newcourse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Newcourse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String server="jdbc:mysql://localhost:3306/sam";
		String password="Ms@1234";
		Connection con=DriverManager.getConnection(server,"root",password);    	
	    String cname=request.getParameter("newcrs");
	    int fee=Integer.parseInt(request.getParameter("fee"));
	    
	    String query="insert into acourses values(?,?)";
        PreparedStatement p = con.prepareStatement(query);
        p.setString(1,cname);
        p.setInt(2,fee);
        int r=p.executeUpdate();
        PrintWriter out=response.getWriter();
       out.println("<h1 align='center'>"+cname+" with fee "+fee+" added successfully</h1>");
	    	RequestDispatcher rd=request.getRequestDispatcher("/AddCourse.jsp");
	    	rd.include(request, response);
        con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

	

}
