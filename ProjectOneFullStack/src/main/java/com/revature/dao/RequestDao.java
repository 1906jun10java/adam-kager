package com.revature.dao;

import java.util.List;

import com.revature.beans.Request;

public interface RequestDao {
	public List<Request> getRequests();
	public List<Request> getRequestsByUsername(String username);
	public Request getRequestById(int id);
	public boolean createRequest(Request request);
	public void updateRequest(Request request);
	public void deleteRequest(Request request);

}
