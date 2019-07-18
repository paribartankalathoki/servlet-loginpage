package com.texas.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {        
		
		response.setContentType("text/html");
	    PrintWriter pw=response.getWriter();
		pw.println("We are from BIT");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (username.equals(password)) {
//			response.sendRedirect("SuccessServlet");
			RequestDispatcher rd = request.getRequestDispatcher("SuccessServlet");
			rd.forward(request, response);
			rd.include(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/FailedServlet");
//		RequestDispatcher always use doPost method
			rd.forward(request, response);
		}
		
//		if (username.equals(password)) {
//			response.sendRedirect("./SuccessServlet");
//		} else {
//			response.sendRedirect("./FailedServlet");
////			response.sendRedirect always use doGet method
//		}
	}

}
