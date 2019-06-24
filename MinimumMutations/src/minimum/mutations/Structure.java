package minimum.mutations;

import java.util.ArrayList;
import java.util.Scanner;

public class Structure {
	public static ArrayList mutationBankBuilder() {
		ArrayList mutationSequence = new ArrayList();
		int userExit = 1;
		int addedToSequence = 0;
		while (userExit == 1) {
			String gene = geneSelector();
			if (gene.equals("EXIT")) {
				// TODO set last index to END
				userExit = 0;
				printSequence(mutationSequence);
				return mutationSequence;
			} else if (gene.length() != 8) {
				System.out.println("Please enter a valid length of 8 letters");
				geneSelector();
			} 
			mutationSequence.add(gene);
			System.out.println("Added " + mutationSequence.get(addedToSequence));
			addedToSequence = addedToSequence + 1;
		}
		printSequence(mutationSequence);
		return mutationSequence;
		
	}

	public static String geneSelector() {
		Scanner geneScanner = new Scanner(System.in);
		System.out.println(
				"Please enter a gene sequence of 8 letters of ACGT,\n or " + "type \"exit\" to compare your selection");
		String gene = geneScanner.next();
		gene = gene.toUpperCase();
		// TODO Fix edgecase selector

//		} else {
//			String cSet = "AGCT";
//			for(int i = 0; i < 8; i++) {
//				if(gene.charAt(i) != cSet.charAt(0) & gene.charAt(i) != cSet.charAt(1) 
//						& gene.charAt(i) != cSet.charAt(2) & gene.charAt(i) != cSet.charAt(3)) {
//					System.out.println("Please enter a valid set of letters containing A,C,G, or T");
//					geneSelector();
//				}
//			}
		return gene;

		}

	public static void printSequence(ArrayList mutationSequence) {
		int i = 0;
		System.out.println("\nThis is your list:\n");
		while (i < mutationSequence.size()) {
			System.out.println(mutationSequence.get(i));
			i++;
		}
	}
	
}
