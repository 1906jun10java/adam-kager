
public class Thursday {

	public static void main(String[] args) {
		
		String mainString = "This is a hard coded block of text.  "
				+ "to find if a word is in the block.  The scanner could also "
				+ "collect the search text";
		String searchPass = "a word is in the block";
		String searchFail = "a word is not in the block";
		int numberRows = 0;
		
		
		containsSubstring(mainString, searchPass);
		containsSubstring(mainString, searchFail);
		
		
		System.out.println(triangle(numberRows));
	}
	
	public static boolean containsSubstring(String x, String y) {
		
		return false;
	}
	
	public static int triangle(int n) {
		//Base case
		if (n == 1 || n == 0) {
			return n;
		}
		
		return n + triangle((n - 1));
	}

}
