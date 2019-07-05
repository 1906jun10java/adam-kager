package com.revature.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ComFactory {
//Singleton Factory
	private static ComFactory cf = new ComFactory();

	// constructor
	private ComFactory() {
		super();
	}

	// a method to call the constructor FOR only one at a time with synchronized
	public static synchronized ComFactory getInstance() {
		// do we have one, if not create, otherwise return the one we have already
		if (cf == null) {
			cf = new ComFactory();
		}

		return cf;
	}

	public Connection getConnection() {
		Connection com = null;
		Properties prop = new Properties();
		try {
			prop.load(new FileReader("database.properties"));
			Class.forName(prop.getProperty("driver"));
			com = DriverManager.getConnection("url", 
					prop.getProperty("usr"), 
					prop.getProperty("password"));
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

//		Class.forName(prop.getProperty("usr"));
//		Class.forName(prop.getProperty("password"));
//		Class.forName(prop.getProperty("other propertiy"));
		//though driver manager
//		com = DriverManager.getConnection(url, user, password)
		
		return com;

	}
}
