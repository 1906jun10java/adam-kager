package com.revature.driver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Driver {

	public static void main(String[] args) {
//		tableCreateQuestion();
//		printTables();
		System.out.println(
				"Currently, I have not practieced SQL at all as " 
				+ "I have focused on core JAVA for Project0.");

		System.out.println(
				"\nOverall, I was unable to implement much of the challenge");

		System.out.println(
				"\nHowever, I did not give up and tried "
				+ "to setup a connection");
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

	// TODO After viewing notes, still do not know exactly
	// what pieces are doing what.
	public Connection getConnection() {
		Connection com = null;
		Properties prop = new Properties();
		try {
			prop.load(new FileReader("database.properties"));
			Class.forName(prop.getProperty("driver"));
			com = DriverManager.getConnection("url", 
					prop.getProperty("usr"), 
					prop.getProperty("password"));
					
		// I do not think I need both the FileNotFoundException
		// or the IOException
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Class.forName(prop.getProperty("usr"));
		Class.forName(prop.getProperty("password"));
		Class.forName(prop.getProperty("other propertiy"));
		//though driver manager
		com = DriverManager.getConnection(url, user, password)
		
		return com;
	}

}
