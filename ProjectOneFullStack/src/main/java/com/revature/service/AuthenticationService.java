package com.revature.service;

import java.util.ArrayList;

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
		System.out.println("trying to getUsers from UserDaoImpl");
		UserDaoImpl udi = new UserDaoImpl();
		ArrayList<User> currentUsers = udi.getUsers();
		System.out.println("checking if entry: " + creds.getUsername() + " is in database (not checking password right now)");
		if(UserService.UsersIndex.contains(creds.getUsername()) && creds.getPassword().equals(
				UserService.Users.get(creds.getUsername()).getPassword())) {

			System.out.println(creds.getUsername() + " is in the database and password matches!!!!!!");
			user = UserService.Users.get(creds.getUsername());
			
		} else {
			System.out.println(creds.getUsername() + " was not found!!!!!!");
		}
		return user;
	}

}
