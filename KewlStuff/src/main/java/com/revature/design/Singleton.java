package com.revature.design;

public class Singleton {
	
	private static Singleton instance;
	private Singleton() {
		
	}
	
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			//calls the private constructor
			instance = new Singleton();
		}
		//otherwise it returns the one instance of it
		return instance;
	}

}
