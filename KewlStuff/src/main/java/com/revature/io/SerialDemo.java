package com.revature.io;

import com.revature.funfactory.Car;
import com.revature.funfactory.HondaFactory;

public class SerialDemo {
	private static HondaFactory hf = new HondaFactory();
	
	public static void main(String[] args) {
		IO io = new IO();
//		String a = "Zelda";
//		io.writeOutputStreamContents("Trevor likes to play " + a);
		
//		System.out.println(io.readInputStreamContents());
		
		//vvvvvv This is how you output to file vvvvvv
//		Car c1 = hf.getCar("CRV", "Blue/Green");
//		Car c2 = hf.getCar("Civic", "Championship White");
//		Car c3 = hf.getCar("F-150", "Black");
//		IOWithCollections.carList.add(c1);
//		IOWithCollections.carList.add(c2);
//		IOWithCollections.carList.add(c3);
//		IOWithCollections.writeCarFile();
		//^^^^^   ^^^^^^
		
		// this will give us the array list
		IOWithCollections.readCarFile();
		System.out.println(IOWithCollections.carList.toString());
		
	}

}
