/**
 * 
 */
package com.texas.servlet;
/**
 * @author Paribartan
 *
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SuccessServlet")
public class SuccessServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 
		 String username = request.getParameter("username");
		 String password = request.getParameter("password");
		 
		PrintWriter out = response.getWriter();
		out.print("<h1>Login Success</h1>");
		out.print("<h2>username: " + username + "</h2>");
	}


}

