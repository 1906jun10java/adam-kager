package com.revature.driver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {

	public static void main(String[] args) {
		tableCreateQuestion();
		printTables();

	}

	private static void printTables(Connection con, String myDB) {
		// TODO This does not seem right... yet
		
//		throws SQLException {
//			Statement stmt = null;
//			String queryTest = ("SELECT EMPLOYEE_ID"
//					+ "FROM " + myDB + ".Employee");
//					
//		try {
//			stmt = con.createStatement();
//			ResultSet resultSet = stmt.exicuteQuery(queryTest);
//			while (resultSet.next()) {
//				String empID = resultSet("EMPLOYEE_ID");
//				System.out.println(empID);
//			
//			}
//		} catch (SQLException e) {
//			printSQLException(e);
//			
//		} finally {
//			if(stmt != null) {
//			stmt.close();
//			}
//		}
//		
		
	}

	private static void tableCreateQuestion(Connection con, String myDB) {
		// TODO This will set up the fist set of tables, 
		// will only need to be ran once

	}

}
