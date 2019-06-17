
public class FizzBuzzRunner {

	public static void main(String[] args) {
		int start = 1;
		int finish = 100;		
		int[] aRay = {1, 3, 5, 7, 9, 11, 13, 15};
		String[] bRay = {"Something", "Fizz", "Else", "Buzz", "Here"};
		String userName = "Your Name Here";
		FizzBuzz fOne = new FizzBuzz();
		
		
		fOne.startProgram();
//		fOne.fizzBuzzBasic(start, finish);
		fOne.fizzBuzzAdvanced(start, finish, aRay, bRay);		
		fOne.endProgram(userName);

	}

}
