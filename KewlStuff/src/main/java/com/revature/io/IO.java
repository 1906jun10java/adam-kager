package com.revature.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO {
	private static final String outFile = "output.txt";
	private static final String inFile = "input.txt";
	public void writeOutputStreamContents(String contents) {
		OutputStream os = null;
		File file = new File(outFile);
		
		
		try {
			os = new FileOutputStream(file, false);
			os.write(contents.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(os != null) {
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//read a string from a file
	public String readInputStreamContents() {
		InputStream is = null;
		File file = new File(inFile);
		StringBuilder s = new StringBuilder();
		
		try {
			is = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// use this to read in our bytes
		int b = 0;
		// the -1 means it is at the end of the Stream
		try {
			while((b = is.read()) != -1) {
//				System.out.println(b);
				//parse (cast) the int as a char
				char c = (char)b;
//				System.out.println(c);
				s.append(c);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(is != null) {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return s.toString();
	}
}





















