package com.revature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.revature.beans.Request;
import com.revature.service.RequestService;



public class RequestDaoImpl implements RequestDao {
	public static ConnectionFactory cFS = ConnectionFactory.getInstance();
	
	Request request = new Request();
	private ArrayList<Request> allRequests = new ArrayList<>();
	
	@Override
	public List<Request> getRequests() {
		System.out.println("? - running getRequests in RequestDaoImpl");
		Connection connection = cFS.getConnection();
		Statement statement = null;

		String query = "SELECT * FROM REQUESTS";

		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				Request request = new Request();
				request.setRequestId(rs.getInt(1));
				request.setRequestAmount(rs.getDouble(2));
				request.setRequestEmployee(rs.getString(3));
				request.setApproveManager(rs.getString(4));
				request.setReceiveDateCode(rs.getInt(5));
				request.setApproveDateCode(rs.getInt(6));
				allRequests.add(request);
				RequestService.Requests.put(request.getRequestId(), request);
				System.out.println("Found " + request.getRequestId());
				RequestService.RequestsIndex.add(request.getRequestId());
			}

		} catch (SQLException e) {
			System.out.println("This is a SQL problem\n" + e);
		} finally {
			if (statement != null) {
//				statement.close();
			}
		}
		return allRequests;
	}


	@Override
	public List<Request> getRequestsByUsername(String username) {

		return null;
	}
	
	@Override
	public Request getRequestById(int id) {
		return null;
	}

	@Override
	public boolean createRequest(Request request) {
		return false;
	}

	@Override
	public void updateRequest(Request request) {
		
	}

	@Override
	public void deleteRequest(Request request) {
		
	}

	

}
