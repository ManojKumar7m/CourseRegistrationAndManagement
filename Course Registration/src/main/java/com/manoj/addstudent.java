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
 * Servlet implementation class addstudent
 */
public class addstudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addstudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		    if(request.getParameter("name")==null || request.getParameter("email")==null || request.getParameter("username")==null
		   || request.getParameter("clg")==null ||request.getParameter("rn")==null ||request.getParameter("pls")==null ||request.getParameter("ps1")==null ||request.getParameter("ps2")==null  )
		    {  PrintWriter out=response.getWriter();
		   	out.println("<h1 align='center'>No empty coulums are allowed</h1>");
		    	RequestDispatcher rd=request.getRequestDispatcher("/AddEmployee.jsp");
		    	rd.include(request, response);
		    }
		    else if(request.getParameter("name").length()==0 || request.getParameter("email").length()==0 || request.getParameter("username").length()==0
		 		   || request.getParameter("clg").length()==0 ||request.getParameter("rn").length()==0 ||request.getParameter("pls").length()==0 ||request.getParameter("ps1").length()==0 ||request.getParameter("ps2").length()==0)
		 		    {  PrintWriter out=response.getWriter();
		 		   	out.println("<h1 align='center'>No empty coulums are allowed</h1>");
		 		    	RequestDispatcher rd=request.getRequestDispatcher("/AddEmployee.jsp");
		 		    	rd.include(request, response);
		 		    }
		    else
		    {/*
		    	Class.forName("com.mysql.cj.jdbc.Driver");
		String server="jdbc:mysql://localhost:3306/sam";
			String password="Ms@1234";
			Connection con=DriverManager.getConnection(server,"root",password);
			
		    	
	    	String name=""+request.getParameter("name");
		    	String email=""+request.getParameter("email");
		    	String username=request.getParameter("username");
		    	String college=""+request.getParameter("clg");
		    	String rollno=""+request.getParameter("rn");
		    	String place=request.getParameter("pls");
		    	String password1=""+request.getParameter("ps1");
		    	String cps=""+request.getParameter("ps2");
		    	String[] course=request.getParameterValues("course");
		    	String cr=String.join(",", course);
		    	System.out.println(course);
                String query="insert into student(name,mail,username,college,rollno,place,password,courses)values(?,?,?,?,?,?,?,?)";
                PreparedStatement p = con.prepareStatement(query);
                p.setString(1,name);
                p.setString(2,email);
                p.setString(3,username);
                p.setString(4,college);
                p.setString(5,rollno);
                p.setString(6,place);
                p.setString(7,password1);
                p.setString(8, cr);
                        
                
                
                int r=p.executeUpdate();
                */
		    	String name=""+request.getParameter("name");
		    	String email=""+request.getParameter("email");
		    	String username=request.getParameter("username");
		    	String college=""+request.getParameter("clg");
		    	String rollno=""+request.getParameter("rn");
		    	String place=request.getParameter("pls");
		    	String password1=""+request.getParameter("ps1");
		    	String cps=""+request.getParameter("ps2");
		    	String[] course=request.getParameterValues("course");
		    	String cr=String.join(",", course);
		    	signindao s1=new signindao();
		    	try {
		    	s1.addStudent(name, email, username, college, rollno, place, password1, cr);
		    	}
		    	catch (Exception e)
		    	{
		    		System.out.println(e);
		    	}
                PrintWriter out=response.getWriter();
               out.println("<h1 align='center'>"+name+"( "+username+") with gmail "+email+" added successfully</h1>");
   		    	RequestDispatcher rd=request.getRequestDispatcher("/sregister.jsp");
   		    	rd.include(request, response);
          
		    }
		   		}
		catch(Exception e)
		{  PrintWriter out=response.getWriter();
		System.out.println(e);
		out.println("<h1 align='center'> Error occured</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("/sregister.jsp");
			rd.include(request, response);
		}
	}

	

}
