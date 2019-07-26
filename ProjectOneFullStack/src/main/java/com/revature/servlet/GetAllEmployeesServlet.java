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
import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;

@WebServlet("/getallemployees")
public class GetAllEmployeesServlet  extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6620593149740120872L;

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet from GetAllEmployeesServlet");
		HttpSession session = req.getSession(false);
		UserDao rd = new UserDaoImpl();
		List<User> requestList = rd.getUsers();
		System.out.println(requestList);
		if (session == null) {
			System.out.println("current session is null... but why!?");
		}
			if (session != null && session.getAttribute("username") != null) {
				try {
					resp.getWriter().write((new ObjectMapper()).writeValueAsString(requestList));
					System.out.println(new ObjectMapper().writeValueAsString(requestList));
				}

				catch (Exception e) {
					e.printStackTrace();
					resp.getWriter().write("{\"session\":null}");

				}

			} else {
				resp.getWriter().write("{\"session\":null}");
			}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost from GetAllEmployeesServlet");
		doGet(req, resp);
	}

}


