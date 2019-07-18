package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.beans.User;

public class UserServlet {

	public class BookServlet extends HttpServlet {
	private BookServlet authService = new BookServlet();
		
		@Override
		public void init() {
		    ServletContext context = getServletContext();
		    System.out.println("init Servlet");
		}

		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			// write a message to the response body with PrintWriter
			// resp.getWriter().write("hello from Login Servlet");

			req.getRequestDispatcher("CallBookButton.html").forward(req, resp);
		}

		/*
		 * doPost will handle all post requests these can be auto-generated
		 */
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//			resp.getWriter().write(req.toString());
			// this returns "org.apache.catalina.connector.RequestFacade@3aac926a" in the
			// browser
			Book book = new Book(req.getParameter("title"), req.getParameter("author"),req.getParameter("999"));
			Author author = new Author(req.getParameter("author"),req.getParameter("genre"));
			if (book != null) {
				// redirect to a profile page
				// RequestDispacher is used to preform a 'forward' - passing request to 
				// another resource without the client's awarness

				resp.sendRedirect("profile");
				resp.getWriter().write("welcome " + book.getTitle());
			} else {

				resp.sendError(417, "invalid credentials");


			}

		}
	}
