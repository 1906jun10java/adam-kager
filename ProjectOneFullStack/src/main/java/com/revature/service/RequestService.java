package com.revature.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.revature.beans.Request;
import com.revature.beans.User;
import com.revature.dao.RequestDao;
import com.revature.dao.RequestDaoImpl;
import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;

public class RequestService {
	public static HashMap<Integer, Request> Requests = new HashMap<>();
	public static ArrayList<Integer> RequestsIndex = new ArrayList<>();
	
	private RequestDao forEveryServiceOneDaoObject = new RequestDaoImpl();
			
	public RequestService() {
	}
	
	public List<Request> getUsers() {
		System.out.println("running getRequests as a List<> from RequestService");
		return forEveryServiceOneDaoObject.getRequests();
	}

	public List<Request> getRequestsByUsername(String username) {
		System.out.println("5 - running getRequestsByUsername from RequestService");
		return forEveryServiceOneDaoObject.getRequestsByUsername(username);
	}

	public boolean createRequest(Request request) {
		System.out.println("running createUser from UserService");
		return forEveryServiceOneDaoObject.createRequest(request);
	}

}
