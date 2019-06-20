import java.util.Arrays;
import java.util.Queue;

public class QueueFromScratch {

	public static void main(String[] args) {
	
//		Queue<Integer> q = (Queue<Integer>) new Arrays();
		
		int[] aRay =  {1,2,3,4,5};
		int pushNum = 6;
		
		
		int[] bRay = pushQueue(aRay, pushNum);
		queuePrint(bRay);

	}
	
//	public static void queueBuilder(int[] ray) {
//		
//		for (int i=0; )		
//	}
	

	public static void queuePrint(int[] tempArray) {
		for(int i = 0; i < tempArray.length; i++) {
			System.out.print(tempArray[i] + ", ");
		}
		
	}
	
	// "pops" a number from the queue and removes it from the queue
	public static int popQueue() {
		return 0;
	}
	
	public static int[] pushQueue(int[] aRay, int pushNum) {
		int[] tempArray = new int[aRay.length + 1];
		for(int i = 0; i < tempArray.length -1; i++) {
			tempArray[i] = aRay[i];
		}
		tempArray[tempArray.length - 1] = pushNum;
		return tempArray;
	}
}
