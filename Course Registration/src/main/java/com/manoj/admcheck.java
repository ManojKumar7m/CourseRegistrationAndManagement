package com.manoj;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class admcheck
 */
public class admcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public admcheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("aname");
		String password=request.getParameter("apasword");
		PrintWriter out=response.getWriter();
		ServletConfig config=getServletConfig();
		   String adminname=config.getInitParameter("adminname");
	        String adminpass=config.getInitParameter("password"); 
	        if(name.equals(adminname) && password.equals(adminpass))
	        {
	        	HttpSession s=request.getSession();
	        	s.setAttribute("adminname", adminname);
	        	response.sendRedirect("menu.jsp");
	        }
	        else
	        {
	        	 out.println("<br>");
	        	out.println("<h1 align='center'>Enter Correct Credentials </h1>");
	         RequestDispatcher rd = request.getRequestDispatcher("/Alogin.jsp"); 
	         rd.include(request, response);
	        }
	}

	

}
