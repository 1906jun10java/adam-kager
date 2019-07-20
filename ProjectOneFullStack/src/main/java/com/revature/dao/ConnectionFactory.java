package com.revature.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	private static ConnectionFactory cf = new ConnectionFactory();

	private ConnectionFactory() {
		super();
	}

	public static synchronized ConnectionFactory getInstance() {
		if (cf == null) { 
			cf = new ConnectionFactory(); 
		}
		return cf;
	}

	// attempts a connection with a sql database
	public Connection getConnection() {
			System.out.println("! Connecting to Database");

			Connection conn = null;	

			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			Properties prop = new Properties();	

			try {
				String cp = "database.properties";
				System.out.println("C Factory line 37");
				InputStream stream = loader.getResourceAsStream(cp);
				System.out.println(cp);
				System.out.println("C Factory line 39");
				prop.load(stream);
//				InputStream stream = this.getClass().getResourceAsStream("../resources/connection.properties"); 
//				prop.load(stream);

				System.out.println("C Factory line 44");
				Class.forName(prop.getProperty("driver"));
				System.out.println("C Factory line 46");
				conn = DriverManager.getConnection(prop.getProperty("Earl"), prop.getProperty("past"),prop.getProperty("time"));

				System.out.println("C Factory line 49");
//				conn = DriverManager.getConnection("awsURL",
//						"username", "password");
				
				
				//Wrong way of calling this
//				Class.forName("oracle.jdbc.driver.OracleDriver");
//				System.out.println("C Factory line 56");
//				conn = DriverManager.getConnection("awsUrl",
//						"username", "password");
				
			} catch (FileNotFoundException e) {	
				e.printStackTrace();
			} catch (IOException e) {	
				e.printStackTrace();
			} catch (SQLException e) {		
				e.printStackTrace();	
			} catch (ClassNotFoundException e) {	
				e.printStackTrace();
			}catch (Exception e) {
				System.out.println("Problems... Connection problems...");
				e.printStackTrace();
			}

			return conn;

		}

}