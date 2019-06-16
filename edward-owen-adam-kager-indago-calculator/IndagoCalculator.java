package com.revature.weekACalc;

public class IndagoCalculator {
	int operator;
	double a, b, result;

	public IndagoCalculator() {
		super();
	}

	public IndagoCalculator(double a, double b, int operator) {
		this.a = a;
		this.b = b;
		this.operator = operator;

	}

	public double perform() {
		switch (operator) {
		case 1:
			return a + b;
		case 2:
			return a - b;
		case 3:
			return a * b;
		case 4:
			return a / b;
		default:
			System.out.println("\n\n\nYou are clllever!");
			return 999.999d;
		}
	}

}
