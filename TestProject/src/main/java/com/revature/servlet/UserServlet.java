package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.revature.beans.User;
import com.revature.service.UserServiceTest;

@WebServlet("/User") // alternet way to register a map servlets... pick this or web.xml, not both
public class UserServlet extends HttpServlet {
	//this is our service class whose methods we will call
	private UserServiceTest userServiceTest;

	// You do not want to maintain states, but will need some stuff
	
	// this is used to convert Java objects to JSON- formatted data to include in response bodies
	private ObjectMapper om;
	
	public UserServlet() {
		userServiceTest = new UserServiceTest();
		om = new ObjectMapper();
		om.registerModule(new JavaTimeModule());
		// either a enum value or a constangte
		om.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false);
		
	}
	
	
	// Return all users as JSON text
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// check if there is an id provided in the query string
		String usernameFromQueryString = req.getParameter("username");
		if(usernameFromQueryString != null) {
			// try to find the desired users
			try {
				// using an int wrapper class
//				String idString = req.getParameter("id");
				//Because I have a String, I can just pass the String
				String username = usernameFromQueryString;
				String userJSON = om.writeValueAsString(userServiceTest.getUserByUsername(username));
				// if ObjectMapper gets a null value, it will be converted to a string "nul"
				if(userJSON.equals("null")) {
					resp.getWriter().write(userJSON);
				} else {
					resp.sendError(417);
				}
			} catch(Exception e) {
				// if the string is impossible to parse... send an error, NOT A STACKTRACE
				resp.sendError(400);
				
			}
		} else { 
			
		}
		resp.getWriter().write(om.writeValueAsString(userServiceTest.getUsers()));
	}
	
	@Override
	//using PostMan!
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// resd request body and convet to a JSON file
		if (userServiceTest.createUser(om.readValue(req.getReader(), User.class))) {
			resp.setStatus(200);
		} else {
			resp.setStatus(400);
		}
 	}

}











