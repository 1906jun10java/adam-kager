package com.revature.service;

import com.revature.beans.Credentials;
import com.revature.beans.User;
import com.revature.dao.UserDaoImpl;

public class AuthenticationService {
	
	public AuthenticationService() {
		
	}
	
	//If the user is valid, we will return a user object, otherwise return null
	public User authenticateUser(Credentials creds) {
		System.out.println("3 - running authenticateUser from AuthenticateUser");
		UserService us = new UserService();
		
		User user = null;
		System.out.println("checking for match");
		//TODO Try catch each value for NullPointerException
		// one of these arguments point to null and needs to be checked
		System.out.println("Matching " + creds.getUsername() + " and " + us.getUserByUsername(creds.getUsername()).getUsername());

		if(creds.getUsername().equals(us.getUserByUsername(creds.getUsername()).getUsername()) | creds.getPassword().equals("aPassword")) {
//		if(us.UsersIndex.contains(creds.getUsername()) | creds.getPassword().equals("aPassword")) {
//			user = new User(creds.getUsername(), creds.getPassword(), user.getFirstname(), 
//					user.getLastname(), user.getManager(), user.getEmployeelevel());
//			user = new User();
//			user.setUsername(creds.getUsername());
//			user.setPassword(creds.getPassword());
			
			user = us.getUserByUsername(creds.getUsername());
			
		}

		return user;
	}

}
