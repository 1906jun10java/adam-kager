package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;


@WebServlet("/requests")
public class RequestsServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8196266680511604953L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet from ProfileServlet");
		req.getRequestDispatcher("Profile.html").forward(req, resp);	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost from ProfileServlet");
		doGet(req, resp);
	}
}