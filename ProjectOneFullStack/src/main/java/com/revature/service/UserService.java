package com.revature.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.revature.beans.User;
import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;

public class UserService {
	public static HashMap<String, User> Users = new HashMap<>();
	public static ArrayList<String> UsersIndex = new ArrayList<>();
	
	private UserDao forEveryServiceOneDaoObject = new UserDaoImpl();
			
	public UserService() {
	}
	
	public List<User> getUsers() {
		System.out.println("running getUsers from UserService");
		return forEveryServiceOneDaoObject.getUsers();
	}

	public User getUserByUsername(String username) {
		System.out.println("5 - running getUserByUsername from UserService");
		return forEveryServiceOneDaoObject.getUserByUsername(username);
	}

	public boolean createUser(User user) {
		return forEveryServiceOneDaoObject.createUser(user);
	}
	
	
	
//	public List<User> getUsers() {
//		ArrayList<User> users = ArrayList<>();
//		User user = new User();
//		users.add()
//	}
}
