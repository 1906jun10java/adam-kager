

public class FizzBuzz {

	public FizzBuzz() {
		int start = 1;
		int finish = 100;
		fizzBuzzBasic(start, finish);
	}

	public void fizzBuzzBasic(int start, int finish) {
		int i = start;
		System.out.println("Starting at " + i);
		while(i <= finish) {
			//TODO look up later to see how to do a cleaner version of this in Java
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if(i % 3 == 0) {
				System.out.println("Fizz");
			} else if(i % 5 == 0) {
				System.out.println("FizzBuzz");
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

}
