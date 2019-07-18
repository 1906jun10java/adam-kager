package com.revatrue.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revatrue.beans.Author;
import com.revatrue.beans.Book;

public class BookServlet extends HttpServlet {
private BookServlet authServlet = new BookServlet();
	
	@Override
	public void init() {
		// unknown reason for having a ServletContext object here
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
//		resp.getWriter().write(req.toString());
		// this returns "org.apache.catalina.connector.RequestFacade@3aac926a" in the
		// browser
		Book book = new Book(req.getParameter("title"), req.getParameter("author"),req.getParameter("999"));
//		Author author = new Author(req.getParameter("author"),req.getParameter("genre"));
		if (book != null) {
			resp.sendRedirect("from resp.sendRedirect");
			resp.getWriter().write("Your Book " + book.getTitle() + " is here!");
		} else {

			resp.sendError(417, "... disapointment");


		}

	}
}


