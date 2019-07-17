package com.revature.service;

import com.revature.beans.Credentials;
import com.revature.beans.User;

public class AuthenticationService {
	
	public AuthenticationService() {
		
	}
	
	//If the user is valid, we will return a user object, otherwise return null
	public User authenticateUser(Credentials creds) {
		User user = null;
		if(creds.getUsername().equals("merlin") && creds.getPassword().equals("cat")) {
			user = new User(6, "Merling", "Higgins", creds.getUsername(), "merlin@aemailplace.com");
		}
		return user;
	}

}
