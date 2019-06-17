
import java.util.Scanner;

public class FizzBuzzRunner {

	public static void main(String[] args) {
		String userName = getUserName();
		
		int start = 1;
		int finish = 100;		
//		int start = aquireStarter();
//		int finish = aquireFinisher();		
		int[] aRay = {1, 3, 5, 7, 9, 11, 13, 15};
		String[] bRay = {"Something", "Fizz", "Else", "Buzz", "Here"};
		FizzBuzz fOne = new FizzBuzz();
		
		
		fOne.startProgram();
//		fOne.fizzBuzzBasic(start, finish);
		fOne.fizzBuzzAdvanced(start, finish, aRay, bRay);	
		fOne.endProgram(userName);


	}
	
	public static String getUserName() {
		Scanner s = new Scanner(System.in);
		System.out.println("Hello, User.  May I have your name?");
		String userName = s.next();	
		s.close();
		return userName;
	}
	//TODO find out why this throws java.util.NoSuchElementException
//	public static int aquireStarter() {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Please input your starting integer:  -If you wish to exit the "
//				+ "program, please type something other than an integer");
//		//TODO ~it is not a bug, it is a feature!  Figure out how to test if input is an integer  ...again
//		int start = s.nextInt();	
//		s.close();
//		return start;
//	}
//	
//	public static int aquireFinisher() {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Please input your ending integer:  -If you wish to exit the "
//				+ "program, please type something other than an integer");
//		int finish = s.nextInt();	
//		s.close();
//		return finish;
//	}
}