package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//did not see
import javax.servlet.http.HttpServlet;
// this looks nothing like what was presented
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.beans.Credentials;
import com.revature.beans.User;
import com.revature.service.AuthenticationService;

public class LoginServlet extends HttpServlet {

	private AuthenticationService authService = new AuthenticationService();
	
	@Override
	public void init() {
	    ServletContext context = getServletContext();
	    System.out.println("init Servlet");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// write a message to the response body with PrintWriter
		// resp.getWriter().write("hello from Login Servlet");

		req.getRequestDispatcher("Login.html").forward(req, resp);
	}

	/*
	 * doPost will handle all post requests these can be auto-generated
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.getWriter().write(req.toString());
		// this returns "org.apache.catalina.connector.RequestFacade@3aac926a" in the
		// browser
		Credentials creds = new Credentials(req.getParameter("username"), req.getParameter("password"));
		User user = authService.authenticateUser(creds);
		if (user != null) {
			// redirect to a profile page
			// RequestDispacher is used to perform a 'forward' - passing request to 
			// another resource without the client's awarness

			resp.sendRedirect("profile");
			resp.getWriter().write("welcome " + user.getFirstname());
		} else {
			// Message
//			resp.getWriter().write("Invalid !!! EXTERMINATE EXERMINATE");
			// or!
			// redirect to login page but can go anywhere
//			resp.sendRedirect("login");
			// or! Options 3:
			resp.sendError(417, "invalid credentials");
			// Just a demo of getContextPath()
//			ServletContext servcont = req.getServletContext(); //inherited method
//			ServletConfig config = getServletConfig();  //Also inherited
//			resp.getWriter().write(servcont.getContextPath()+" <---THIS IS THE ROOT THROUGH getContextPath  "+
//					" ServletClass: "+config.getClass());
			

		}

	}
}
