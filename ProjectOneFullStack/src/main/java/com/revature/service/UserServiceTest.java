package com.revature.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.revature.beans.User;
import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;

public class UserServiceTest {
	public static HashMap<String, User> Users = new HashMap<>();
	public static ArrayList<String> UsersIndex = new ArrayList<>();
	
	
	private UserDao forEveryServiceOneDaoObject = new UserDaoImpl();
			
	
	
	
	public UserServiceTest() {
	}
	
	public List<User> getUsers() {
		return forEveryServiceOneDaoObject.getUsers();
	}

	public User getUserByUsername(String username) {

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
