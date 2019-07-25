package com.revature.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.Request;
import com.revature.beans.User;
import com.revature.dao.RequestDao;
import com.revature.dao.RequestDaoImpl;

@WebServlet("/requests")
public class RequestsServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8196266680511604953L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet from RequestServlet");
		HttpSession session = req.getSession(false);
		RequestDao rd = new RequestDaoImpl();
		List<Request> requestList = rd.getRequests();
		System.out.println(requestList);
		if (session == null) {
			System.out.println("current session is null... but why!?");
		}
		// check if it is there
			if (session != null && session.getAttribute("username") != null) {
				try {
//
//					int requestId = requestList.get(i).getRequestId();
//					double requestAmount = requestList.get(i).getRequestAmount();
//					String requestEmployee = requestList.get(i).getRequestEmployee();
//					String approveManager = requestList.get(i).getApproveManager();
//
//					// parsing
////				int requestId = Integer.parseInt(session.getAttribute("requestId").toString());
//				System.out.println(requestId);
////				double requestAmount = Double.parseDouble(session.getAttribute("reqeustAmoung").toString());
//				System.out.println(requestAmount);
////				String requestEmployee = session.getAttribute("requestEmployee").toString();
//				System.out.println(requestEmployee);
////				String approveManager = session.getAttribute("approveManager").toString();
//				System.out.println(approveManager);
//					Request request = new Request(requestId, requestAmount, requestEmployee, approveManager);
//					System.out.println(request);
					
					resp.getWriter().write((new ObjectMapper()).writeValueAsString(requestList));
					System.out.println(new ObjectMapper().writeValueAsString(requestList));
				}

				// all the other stuff
				catch (Exception e) {
					// normally log the Exception
					e.printStackTrace();
					resp.getWriter().write("{\"session\":null}");

				}

			} else {
				resp.getWriter().write("{\"session\":null}");
			}
		
		// for now just sending a request

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost from SessionServlet");
		doGet(req, resp);
	}

}