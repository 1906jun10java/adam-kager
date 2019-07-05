package com.revature.threadz;

public class ThreadDemo {

	public static void main(String[] args) {
		// this is a thread because it extends thread class
		Thread extendThread = new ExtendThread();
		
		// making a new thread, but passing a new object that implements Tread
		Thread implementThread = new Thread(new ImplementRunnable());
		// this implementThread is not 
		
		//^^^^^^Above threads are in "NEW" state^^^^^^
		
		extendThread.start();
		implementThread.start();
		//println is synchronized, so results are different each time
		
		implementThread.setPriority(10);
		extendThread.setPriority(1);
		for(int i = 0; i < 10; i++) {
			System.out.println("ello from ThreadDemo (Driver)");
			}

		

	}

}
