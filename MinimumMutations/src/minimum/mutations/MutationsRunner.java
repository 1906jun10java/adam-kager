package minimum.mutations;

public class MutationsRunner {

	public static void main(String[] args) {
		startProgram();
		System.out.println("This program is currently under construction.");
		System.out.println("Known issues:");
		System.out.println("1.  Scanner holds previous input for less than 8 letters check, \n"
				+ "then inputs that answer");
		System.out.println("2.  Checker logic is not implemented correctly, yet.  \n"
				+ "time limit reached before correct testing");
		System.out.println("\n Programmers Note:  I spent too much time trying to understand \n"
				+ "Sanner issues, "
				+ "\n...lesson learned");
		
		startProgram();
		GeneCode.geneStepFinder(Structure.mutationBankBuilder());
		endProgram();
	}
	
	public static void startProgram() {
		System.out.println("----------------\nMutation Finder\n----------------\n");
	}
	
	public static void endProgram() {
		System.out.println("\n\n----------------\nEnd of Line\n----------------");
	}

}
