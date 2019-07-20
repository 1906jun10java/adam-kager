package com.revature.service;

import com.revature.beans.Credentials;
import com.revature.beans.User;

public class AuthenticationService {
	
	public AuthenticationService() {
		
	}
	
	//If the user is valid, we will return a user object, otherwise return null
	public User authenticateUser(Credentials creds) {
		User user = null;
		if(creds.getUsername().equals("aUsername") && creds.getPassword().equals("aPassword")) {
			user = new User(creds.getUsername(), user.getPassword(), user.getFirstname(), 
					user.getLastname(), user.getManager(), user.getEmployeelevel());
		}
		return user;
	}

}
