package com.revature.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionUtil {
	//treated as a singlton
	
	//private because it is a singlton
	private ConnectionUtil() {
		super();
	}
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		System.out.println("running getSessionFactory in ConnectionUtil");
		if (sessionFactory == null) {
			//Configuration is a class GET IT FROM HIBERNATE!
			Configuration c = new Configuration();
			c.setProperty("hibernate.connection.username", System.getenv("DEMO_DB_USERNAME"));
			c.setProperty("hibernate.connection.password", System.getenv("DEMO_DB_PASSWORD"));
			c.setProperty("hibernate.connection.url", System.getenv("DEMO_DB_URL"));
			//
			c.configure();
			sessionFactory = c.buildSessionFactory();
		}
		return sessionFactory;
	}
}
