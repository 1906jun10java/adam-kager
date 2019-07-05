package com.revature.funfactory;

public class Driver {
	private static HondaFactory hf = new HondaFactory();

	public static void main(String[] args) {
		Car c1 = hf.getCar("CRV", "Blue/Green");
		Car c2 = hf.getCar("Civic", "Championship White");
		Car c3 = hf.getCar("F-150", "Black");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
