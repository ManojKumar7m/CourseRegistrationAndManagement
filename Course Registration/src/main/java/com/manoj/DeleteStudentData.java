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
 * Servlet implementation class DeleteStudentData
 */
public class DeleteStudentData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteStudentData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		if(request.getParameter("gmail")==null)
		{
			out.println("<h1 align='center'>null values are not entertained</h1>");
			 RequestDispatcher rd=request.getRequestDispatcher("/DeleteEmployee.jsp");
			 rd.include(request, response);
		}else if(request.getParameter("gmail")==null)
		{
			out.println("<h1 align='center'>empty values are not entertained</h1>");
			 RequestDispatcher rd=request.getRequestDispatcher("/DeleteEmployee.jsp");
			 rd.include(request, response);
		}
		else {
		try {
		String gmail=request.getParameter("gmail");	
		signindao s1=new signindao();
		int r=s1.deleteStudent(gmail);
			 if(r==0)
			 {  
			out.println("<h1 align='center'>"+gmail+" this student does not exist</h1>");
			 RequestDispatcher rd=request.getRequestDispatcher("/DeleteEmployee.jsp");
				 rd.include(request, response);
			 }
			 else
			 {  out.println("<h1 align='center'>Deleted Successfully</h1>");
				 RequestDispatcher rd=request.getRequestDispatcher("/DeleteStudent.jsp");
				 rd.include(request, response);
			 }
		}
		catch(Exception e){
			out.println("<h1 align='center'>Error occured</h1>");
			 RequestDispatcher rd=request.getRequestDispatcher("/DeleteStudent.jsp");
			 rd.include(request, response);
		}}
	}

	

	
}
