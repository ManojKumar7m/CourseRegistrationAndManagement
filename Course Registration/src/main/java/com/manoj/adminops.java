package com.manoj;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class adminops
 */
public class adminops extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminops() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Object o=request.getParameter("check");
		if(o==null)
		{
			System.out.println("<h1 align='center'>login to admin first</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("/Alogin.jsp");
			rd.forward(request,response);
		}
		String check=request.getParameter("check");
		if(check.equals("Add student"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/sregister.jsp");
			rd.forward(request,response);
		}
		else if(check.equals("Add Courses"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/AddCourse.jsp");
			rd.forward(request,response);	
		}
		else if(check.equals("Delete student"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/DeleteStudent.jsp");
			rd.forward(request,response);	
		}
		else if(check.equals("Update student"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/UpdateStudent.jsp");
			rd.forward(request,response);
		}
		else if(check.equals("Display student"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/Std.jsp");
			rd.forward(request,response);	
		}
		else if(check.equals("Display all student details"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/DisplayAll.jsp");
			rd.forward(request,response);	
		}
		else if(check.equals("Logout"))
		{
			HttpSession session=request.getSession();
			session.invalidate();
		    response.sendRedirect("Alogin.jsp");
		}
	}

	

}
