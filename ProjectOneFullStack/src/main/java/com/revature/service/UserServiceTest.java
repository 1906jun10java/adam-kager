package com.revature.service;

import java.util.List;

import com.revatuer.dao.UserDao;
import com.revatuer.dao.UserDaoImpl;
import com.revature.beans.User;

public class UserServiceTest {
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
