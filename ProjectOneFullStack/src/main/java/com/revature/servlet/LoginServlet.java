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

	/**
	 * 
	 */
	private static final long serialVersionUID = 2347918532073186867L;
	private AuthenticationService authService = new AuthenticationService();
	
	@Override
	public void init() {
		System.out.println("1 - init from LoginServlet");
	    ServletContext context = getServletContext();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("2 - doGet from LoginServlet");
		resp.getWriter().write("hello from Login Servlet");

		req.getRequestDispatcher("Login.html").forward(req, resp);
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("2 - doPost from LoginServlet");
		HttpSession session = req.getSession();
		Credentials creds = new Credentials(req.getParameter("username"), req.getParameter("password"));
		User user = authService.authenticateUser(creds);
		if (user != null) {
			System.out.println("user != null");
			session.setAttribute("username", user.getUsername());
			session.setAttribute("password", user.getPassword());
			session.setAttribute("firstname", user.getFirstname());
			session.setAttribute("lastname", user.getLastname());
			session.setAttribute("manager", user.getManager());
			session.setAttribute("Employeelevel", user.getEmployeelevel());
			
			
			System.out.println("THIS IS YOUR SESSION !!!!!!!" + session.getAttribute("username")); 

			if (session.getAttribute("Employeelevel").equals("2")) {
				resp.sendRedirect("managerprofile");
			} else {
				resp.sendRedirect("profile");
			}
			resp.getWriter().write("welcome " + user.getFirstname());
			

		
			
			
		} else {
			session.setAttribute("problems", "invalid credentials problems...");
			resp.sendRedirect("login");

		}
	}
}
