
import java.util.Arrays;

public class FizzBuzz {
	private int start;
	private int finish;
	private String userName = "User";
	private int[] aRay = {9, 15};


	private String[] bRay = {"Place", "Holder"};

	public FizzBuzz() {
		this.start = start;
		this.finish = finish;
		this.userName = userName;
		this.aRay = aRay;
		this.bRay = bRay;
	}

	public void fizzBuzzBasic(int start, int finish) {
		System.out.println("\n\n----------------\nRunning fizzBuzzBasic\n---------------\n");
		int i = start;
		System.out.println("Starting at " + i);
		while(i <= finish) {
			//TODO look up later to see how to do a cleaner version of this in Java
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if(i % 3 == 0) {
				System.out.println("Fizz");
			} else if(i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
						
			//TODO learn how to do a switch case for this
//			switch (i) {
//				case 1: (i % 3 == 0 && i % 5 == 0);
//				case 2: (0 == i % 3);
//					System.out.println("Fizz");
//				case 3: i % 5 == 0;
//					System.out.println("Buzz");
			
			//TODO remove the iterator after making the while condition nicer
			i = i + 1;
		}
	}
	public void fizzBuzzAdvanced(int start, int finish, int[] aRay, String[] bRay) {
		System.out.println("\n\n----------------\nRunning fizzBuzzAdvanced\n---------------\n");
		int i = start;
		String m = "Fizz";
		String n = "Buzz";
		fizzBuzzBasic(start, finish);
		fizzBuzzArray(aRay);
		fizzBuzzArray(bRay);

	}
	
	public void fizzBuzzArray(int[] aRay) {
		System.out.println("\nTesting for Integers");
		int f = aRay.length;
		int i = 0;
		while(i < f) {
			if(aRay[i] % 3 == 0 && aRay[i] % 5 == 0) {
				System.out.println("You have a FizzBuzz");
			} else if (aRay[i] == 3) {
				System.out.println("Fizz");
			} else if (aRay[i] == 5) {
				System.out.println("Buzz");
			} else {
				System.out.println(aRay[i]);
			}
		i = i + 1;
		}
	}
	
	public void fizzBuzzArray(String[] bRay) {
		System.out.println("\nTesting for Strings");
		int f = bRay.length;
		int i = 0;
//		while(i < f) {
//			//TODO Figure out the .equals and how it works actually
//			if(.equals(bRay[i], "Fizz") && aRay[i] == 5) {
//				System.out.println("You have a FizzBuzz");
//			} else if (equals(bRay[i], "Fizz")) {
//				System.out.println("Fizz");
//			} else if (aRay[i] == 5) {
//				System.out.println("Buzz");
//			}
//		i = i + 1;
		
		while(i < f) {
			//TODO Figure out the .equals and how it works actually
			if(bRay[i] != null && bRay[i] == "FizzBuzz") {
				System.out.println("You have a FizzBuzz");
			} else if (bRay[i] != null && bRay[i] == "Fizz") {
				System.out.println("You have a Fizz");
			} else if (bRay[i] != null && bRay[i] == "Buzz") {
				System.out.println("You have a Buzz");
			} else {
				System.out.println(bRay[i]);
			}
		i = i + 1;
		}
	}
	

	public void startProgram() {
		System.out.println("\n\n----------------\nFIZZBUZZ\n---------------\n");
	}
	
	public void endProgram() {
		System.out.println("\n----------------\nEnd of Line\n---------------\n");
	}
	
	public void endProgram(String userName) {
		System.out.println("\nGoodBye, " + userName + ".  I always love our chats.");
		System.out.println("----------------\nEnd of Line\n---------------");
	}
	
	
	//Getters and setters
	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getFinish() {
		return finish;
	}

	public void setFinish(int finish) {
		this.finish = finish;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int[] getaRay() {
		return aRay;
	}

	public void setaRay(int[] aRay) {
		this.aRay = aRay;
	}

	public String[] getbRay() {
		return bRay;
	}

	public void setbRay(String[] bRay) {
		this.bRay = bRay;
	}

}
