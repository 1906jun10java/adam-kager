package com.revature.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
//did not see
import javax.servlet.http.HttpServlet;
// this looks nothing like what was presented
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//write a message to the response body with PrintWriter
		//resp.getWriter().write("hello from Login Servlet");
		
		req.getRequestDispatcher("Login.html").forward(req,resp);
	}
}
