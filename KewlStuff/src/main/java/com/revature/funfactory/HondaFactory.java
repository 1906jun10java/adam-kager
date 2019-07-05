package com.revature.funfactory;
	//Factories create an object without exposing the object creation to the client
public class HondaFactory {
	/*
	 * us a "factory" method to retrun a Car Model besed on 
	 * what String is gien
	 * if the method is given a parameter of something besides
	 * crv or civic, it will return null
	 */
	
	// limiting the selection
	public Car getCar(String whatCar, String color) {
		if("Civic".contentEquals(whatCar)) {
			return new Car("Honda", 2019, "Civic", color);
		} else if ("CRV".contentEquals(whatCar)) {
			return new Car("Honda", 2019, "CRV", color);
		}
		System.out.println("You Choose Poorly");
		return null;
	}
}
