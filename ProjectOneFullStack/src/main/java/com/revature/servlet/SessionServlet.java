package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.User;

// return a JSON representation of the currently authenticated user for this JSESSIONID

@WebServlet("/session")
public class SessionServlet extends HttpServlet {
	//is there a session, does it match the stuff
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		// check if it is there
		if (session != null && session.getAttribute("username") != null) {
			try {
				//If Integer, use a wrapper class Integer to parseInt
//				int userId = Integer.parseInt(session.getAttribute("userId").toString());
				String username = session.getAttribute("username").toString();
				String firstname = session.getAttribute("firstname").toString();
				String lastname = session.getAttribute("lastname").toString();
				String manager = session.getAttribute("manager").toString();
				String employeelevel = session.getAttribute("employeelevel").toString();
				User user = new User(username, "hidden password", firstname, lastname, manager, employeelevel);
				resp.getWriter().write((new ObjectMapper()).writeValueAsString(user));
				
				
				
				
				// all the other stuff
			} catch (Exception e) {
				//normally log the Exception
				e.printStackTrace();
				resp.getWriter().write("{\"session\":null}");
				
			}
			
		} else {
			resp.getWriter().write("{\"session\":null}");
		}
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
