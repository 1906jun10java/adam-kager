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
		//Getting data from server
		UserDaoImpl udi = new UserDaoImpl();
		ArrayList<User> currentUsers = udi.getUsers();
		System.out.println("checking if entry: " + creds.getUsername() + " is in database (not checking password right now)");
		if(UserService.UsersIndex.contains(creds.getUsername()) && creds.getPassword().equals(
				UserService.Users.get(creds.getUsername()).getPassword())) {
//		if(us.UsersIndex.contains(creds.getUsername()) | creds.getPassword().equals("aPassword")) {
//			user = new User(creds.getUsername(), creds.getPassword(), user.getFirstname(), 
//					user.getLastname(), user.getManager(), user.getEmployeelevel());
//			user = new User();
//			user.setUsername(creds.getUsername());
//			user.setPassword(creds.getPassword());
			System.out.println(creds.getUsername() + " is in the database!!!!!!");
			user = UserService.Users.get(creds.getUsername());
			
		} else {
			System.out.println(creds.getUsername() + " was not found!!!!!!");
		}
		return user;
	}

}
