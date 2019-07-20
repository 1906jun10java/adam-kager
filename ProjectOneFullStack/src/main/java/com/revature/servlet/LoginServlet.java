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
import javax.servlet.http.HttpSession;

import com.revature.beans.Credentials;
import com.revature.beans.User;
import com.revature.service.AuthenticationService;

public class LoginServlet extends HttpServlet {

	private AuthenticationService authService = new AuthenticationService();
	
	@Override
	public void init() {
		System.out.println("1 - init from LoginServlet");
	    ServletContext context = getServletContext();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("2 - doGet from LoginServlet");
		// write a message to the response body with PrintWriter
		 resp.getWriter().write("hello from Login Servlet");

		req.getRequestDispatcher("Login.html").forward(req, resp);
	}

	/*
	 * doPost will handle all post requests these can be auto-generated
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("2 - doPost from LoginServlet");
		//vvvvvv create a new session vvvvvv
		// overloaded version takes a boolean parameter, if false returns null 
		//when no session exists for the incoming request
		//This uses HttpSession
		HttpSession session = req.getSession();
		
		
//		resp.getWriter().write(req.toString());
		// this returns "org.apache.catalina.connector.RequestFacade@3aac926a" in the
		// browser
		Credentials creds = new Credentials(req.getParameter("username"), req.getParameter("password"));
		User user = authService.authenticateUser(creds);
		if (user != null) {
			System.out.println("user != null");
			//vvvvvv session vvvvvv
			// set user information as session attributes (not request attributes
			session.setAttribute("username", user.getUsername());
			session.setAttribute("password", user.getPassword());
			session.setAttribute("firstname", user.getFirstname());
			session.setAttribute("lastname", user.getLastname());
			session.setAttribute("manager", user.getManager());
			session.setAttribute("Employeelevel", user.getEmployeelevel());
			
			
			// redirect to a profile page
			// RequestDispacher is used to perform a 'forward' - passing request to 
			// another resource without the client's awarness
			resp.sendRedirect("profile");
			resp.getWriter().write("welcome " + user.getFirstname());
			
			//vvvvvv create a new session vvvvvv
			
			
			
		} else {
			session.setAttribute("problems", "invalid credentials problems...");
			// Message
//			resp.getWriter().write("Invalid !!! EXTERMINATE EXERMINATE");
			// or!
			// redirect to login page but can go anywhere
//			resp.sendRedirect("login");
			// or! Options 3:
			resp.sendError(417, "invalid credentials problems... My expectations have been failed");
			// Just a demo of getContextPath()
//			ServletContext servcont = req.getServletContext(); //inherited method
//			ServletConfig config = getServletConfig();  //Also inherited
//			resp.getWriter().write(servcont.getContextPath()+" <---THIS IS THE ROOT THROUGH getContextPath  "+
//					" ServletClass: "+config.getClass());
		}
	}
}
