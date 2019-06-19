
public class Wednesday {
	
	public static void main(String[] args) {
		String str = "ipaddapi";
		reverseString(str);
		isPalindrome(str);
	}
	
	public static void reverseString(String str) {
		char[] charArray = str.toCharArray();
		printArray(charArray);
		//TODO Check if palindrome
		int j = (charArray.length - 1);
		for(int i = 0; i < charArray.length/2; i++) {
			//swapper go swapping
			char aHold = charArray[i];
			char bHold = charArray[j];
			System.out.println(bHold);
			charArray[i] = bHold;
			charArray[j] = aHold;
			j--;
		}
		System.out.println("");
		printArray(charArray);		
	}
	
	public static boolean isPalindrome(String str) {
		char[] charArray = str.toCharArray();
		char[] testArray = str.toCharArray();
		//TODO Check if palindrome
		
		//silly way
//		int j = (charArray.length - 1);
//		for(int i = 0; i < charArray.length/2; i++) {
//			//swapper go swapping
//			char aHold = charArray[i];
//			char bHold = charArray[j];
//			System.out.println(bHold);
//			testArray[i] = bHold;
//			testArray[j] = aHold;
//			j--;
//		}
//		System.out.println("");
//		printArray(charArray);
//		printArray(testArray);
//		if(testArray.equals(charArray)) {
//			System.out.println("you have a palindrone");
//			return true;
//		}
//		
		return false;
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
