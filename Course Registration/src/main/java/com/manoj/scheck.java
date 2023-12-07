package com.manoj;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class scheck
 */
public class scheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public scheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("sname");
		String password=request.getParameter("spassword");
		PrintWriter out=response.getWriter();
		signindao s1=new signindao();
		if(s1.checkStudent(name, password))
		{
			HttpSession s=request.getSession();
        	s.setAttribute("stdname",name);
        	response.sendRedirect("studentpage.jsp");
		}
		else
        {
        	 out.println("<br>");
        	out.println("<h1 align='center'>Enter Correct Credentials </h1>");
         RequestDispatcher rd = request.getRequestDispatcher("/Slogin.jsp"); 
         rd.include(request, response);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
