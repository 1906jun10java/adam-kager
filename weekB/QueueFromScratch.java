
public class QueueFromScratch {

	public static void main(String[] args) {
		// declared values
		int[] aRay =  {1,2,3,4,5};
		int pushNum = 6;
		
		// Hard coded operations
		int[] bRay = pushQueue(aRay, pushNum);
		queuePrint(bRay);
		System.out.println(" ");
		int[] cRay = popQueue(bRay);
		queuePrint(cRay);
		System.out.println(" ");
		peekQueue(cRay);
	}
	
	// This just prints out the Queue
	public static void queuePrint(int[] tempArray) {
		for(int i = 0; i < tempArray.length; i++) {
			System.out.print(tempArray[i] + ", ");
		}
		
	}
	
	// "pops" a number from the queue and removes it from the queue
	public static int[] popQueue(int[] bRay) {
		int pop = bRay[0];
		System.out.println("Oldest Element:  " + pop);
		int[] tempArray = new int[bRay.length - 1];
		for(int i = 0; i < tempArray.length; i++) {
			tempArray[i] = bRay[i+1];
		}
		bRay = tempArray;
		return bRay;
	}
	
	// "pushes" a number to the queue in the 'newest' spot
	public static int[] pushQueue(int[] aRay, int pushNum) {
		int[] tempArray = new int[aRay.length + 1];
		for(int i = 0; i < tempArray.length -1; i++) {
			tempArray[i] = aRay[i];
		}
		tempArray[tempArray.length - 1] = pushNum;
		return tempArray;
	}
	
	// "peeks" at the top or next element in the queue
	public static void peekQueue(int[] cRay) {
		System.out.println("Next Element " + cRay[0]);
	}
	
	
}
