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
 * Servlet implementation class UpdateStudentData
 */
public class UpdateStudentData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStudentData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		    if(request.getParameter("name")==null || request.getParameter("username")==null || request.getParameter("password")==null
		   || request.getParameter("pgmail")==null ||request.getParameter("ngmail")==null ||request.getParameter("clg")==null ||request.getParameter("course")==null)
		    {  PrintWriter out=response.getWriter();
		   	out.println("<h1 align='center'>No empty coulums are allowed</h1>");
		    	RequestDispatcher rd=request.getRequestDispatcher("/UpdateStudent.jsp");
		    	rd.include(request, response);
		    }
		    else if(request.getParameter("name").length()==0 || request.getParameter("username").length()==0 || request.getParameter("password").length()==0
		 		   || request.getParameter("pgmail").length()==0 ||request.getParameter("clg").length()==0 ||request.getParameter("course").length()==0
		 		   ||request.getParameter("ngmail").length()==0)
		 		    {  PrintWriter out=response.getWriter();
		 		   	out.println("<h1 align='center'>No empty coulums are allowed</h1>");
		 		    	RequestDispatcher rd=request.getRequestDispatcher("/UpdateStudent.jsp");
		 		    	rd.include(request, response);
		 		    }
		    else
		    {
		    	
		    	
	    	String Name=""+request.getParameter("name");
		    	String userName=""+request.getParameter("username");
		    	String pgmail=request.getParameter("pgmail");
		    	String ngmail=request.getParameter("ngmail");
		    	String password1=""+request.getParameter("password");
		    	String college=request.getParameter("clg");
		    	String[] cr=request.getParameterValues("course");
		    	String course=String.join(",", cr);
		    	//System.out.println(course);
                signindao s1=new signindao();
                s1.updateStudent(Name, userName, pgmail, ngmail, password1, college, course);
                PrintWriter out=response.getWriter();
               out.println("<h1 align='center'>"+Name+"("+userName+") with gmail "+ngmail+" updated successfully</h1>");
   		    	RequestDispatcher rd=request.getRequestDispatcher("/UpdateStudent.jsp");
   		    	rd.include(request, response);
		    }
		   		}
		catch(Exception e)
		{  PrintWriter out=response.getWriter();
		out.println("<h1 align='center'> Error occured</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("/UpdateStudent.jsp");
			rd.include(request, response);
   System.out.println(e);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


	

}
