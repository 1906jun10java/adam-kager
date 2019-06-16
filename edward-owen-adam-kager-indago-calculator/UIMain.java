package com.revature.weekACalc;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class UIMain {
	static double a;
	static double b;
	static double result;
	static int userSelector = 0;
	static boolean gettingOperator = false;
	//TODO Menu 1 adds, 2 subtracts, 3 multiplies, 4 divides, 5 calculation reset, 6 exits program
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		startProgram();
		userMenu(s);
		endProgram(s);
		
	}
	
	public static void userMenu(Scanner s) {
		System.out.println("Hello user: please enter a number to start");
		a = getDouble(s);
		System.out.println("Enter the operator: \n 1:add  2:subtract 3:multiply 4:divide");
		userSelector = (int) getDouble(s);
		while(userSelector < 1 || userSelector > 6) {
			System.out.println("Please type a valid input. \n 1:add  2:subtract 3:multiply 4:divide");
			userSelector = (int) getDouble(s);
		}
		System.out.println("Enter second number.");
		b = getDouble(s);
		IndagoCalculator calc = new IndagoCalculator(a, b, userSelector);
		result = calc.perform();
		System.out.println("\nResult is: ");
		System.out.println("Drum Roll please.");
		System.out.println("...");
		java.awt.Toolkit.getDefaultToolkit().beep();
		try {
			TimeUnit.MILLISECONDS.sleep(900);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
	}
	
	public static double getDouble(Scanner s) {
		
		while(!s.hasNextDouble()) {
			System.out.println("Type a number:");
			
			s.next();
		}
		return s.nextDouble();
	}
	
	
	
	
	
	

	private static void endProgram(Scanner s) {
		System.out.print("\n\n----------------End of Line----------------");
		s.close();
	}

	private static void startProgram() {
		//close the scanner
		System.out.print("\n----------------Starting IndigoScanner----------------\n\n");
		
	}
	
}
