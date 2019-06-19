
public class Wednesday {
	
	public static void main(String[] args) {
		String str = "racefcar";
		String strTwo = "Racecar";
		int n = 5;
		reverseString(str);
		isPalindrone(str);
		isPalindrone(strTwo);
		System.out.println("");
		System.out.println("Calculated Factorial " + n + " is:  " + calculateFactorial(n));
		
		if (isPalindroneRec(stringConvertor(str)) == true) {
			System.out.println("Is " + str + " a palindrone?");
			System.out.println("HELLO USER.  THIS CURRENTLY DOES NOT WORK AND HAS A PLACE HOLDER  -MasterControl");
			System.out.println("You have a palindrone!  "
					+ "-This message is brought to you by recursion. "
					+ "\n\n'Recursion, can you believe it!  Recursion, can you believe it!'");
		}
		isPalindroneRec(stringConvertor(str));
		
	}
	
	public static void reverseString(String str) {
		char[] charArray = str.toCharArray();
		System.out.println("Original String:  ");
		printArray(charArray);
		//TODO Check if palindrome
		int j = (charArray.length - 1);
		for(int i = 0; i < charArray.length/2; i++) {
			//swapper go swapping
			char aHold = charArray[i];
			char bHold = charArray[j];
			charArray[i] = bHold;
			charArray[j] = aHold;
			j--;
		}
		System.out.println("");
		System.out.println("\nReversed String:  \n");
		printArray(charArray);		
	}
	
	public static void isPalindrone(String str) {
		//This is messy... but works!
		System.out.println("\n\nIs '" + str + "' a palindrone");
		str = str.toLowerCase();
		char[] charArray = str.toCharArray();
		int i = 0;
		int j = charArray.length - 1;
		while(i < charArray.length/2) {
			if(charArray[i] == charArray[j]) {
				i++;
				j--;
				if(i >= j) {
					System.out.println("Yep!");
				}
			} else {
				System.out.println("...nope...");
				break;
			}
		}
	}
	
	public static boolean isPalindroneRec(char[] charArray) {
		int i = 0;
		int j = charArray.length - 1;
		
		return true;
	}
	
	public static char[] stringConvertor(String str) {
		str = str.toLowerCase();
		char[] charArray = str.toCharArray();
		return charArray;
	}
	
//	n! = n(n-1)(n-2)(n-3)...   
//	5! = 5 * 4!
//	n! = n * (n-1)!
//	thus base case is: if(n = 0 || n = 1) return
	public static int calculateFactorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return (n * calculateFactorial(n-1));
	}
	
	
	public static void printArray(int[] singleArray) { 
		for(int i = 0; i < singleArray.length; i++) {
			if(i < singleArray.length - 1) {
				System.out.print(singleArray[i] + ", ");
			} else { 
				System.out.print(singleArray[i]);
			}
		}
	}
	
	public static void printArray(char[] singleArray) { 
		for(int i = 0; i < singleArray.length; i++) {
			if(i < singleArray.length - 1) {
				System.out.print(singleArray[i] + ", ");
			} else { 
				System.out.print(singleArray[i]);
			}
		}
	}

}
