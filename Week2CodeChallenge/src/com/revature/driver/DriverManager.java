package com.revature.driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DriverManager {

	// TODO This currently does not make since as I do not know
	// 		what is some of the elements called like 'this.dbms'
//	public Connection getConneciton() throws SQLException {
//		Connection conn = null;
//		Properties connectionProperties = new Properties();
//		connectionProperties.put("USER", this.userName);
//		connectionProperties.put("password", this.password);
//		
//		if(this.dbms.equals("mysql")) {
//			conn = DriverManager.getConnection(
//					"jdbc:" + this.dbms + "://" 
//					+ this.serverName
//					+ ":" + this.portNumber
//					+ "/", connectionProperties);
//		}
//		
//		System.out.println("Connected");
//		return conn;
//	}

}
