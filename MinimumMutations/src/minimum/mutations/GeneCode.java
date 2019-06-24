package minimum.mutations;

import java.util.ArrayList;

public class GeneCode {
	public static int geneStepFinder(ArrayList s) {
		if(s.get(0).equals(s.get(s.size() - 1))) {
			System.out.println("System Out:  0");
			return 0;
		}
		//TODO Fix logic and messaging
		for(int i = 1; i < (s.size()); i++) {
			String gOne = (String) s.get(i - 1);
			String gTwo = (String) s.get(i);
			int mutationStep = 0;
			int matchCount = 0;
			while(matchCount > 1) {
				for(int j = 0; j < 9; j++) {
					if(gOne.charAt(j) != gTwo.charAt(j)) {
						matchCount++;
					}
				}
				if(matchCount == 1) {
					mutationStep++;
				}
			}
			System.out.println("CURRENTLY BROKEN - You have " + mutationStep + " mutations");
		}
			
		
		
		
		System.out.println("System Out: 99");
		return 99;
	}

}
