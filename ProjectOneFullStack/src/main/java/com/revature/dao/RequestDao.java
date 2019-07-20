package com.revature.dao;

import java.util.List;

import com.revature.beans.Request;


public interface RequestDao {

	public interface UserDao {
		public List<Request> getRequests();
		public Request getRequestById(int id);
		public boolean createRequest(Request request);
		public void updateRequest(Request request);
		public void deleteRequest(Request request);
	}
}
