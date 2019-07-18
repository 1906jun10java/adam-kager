package com.revatrue.service;

import com.revatrue.beans.Book;
import com.revatrue.beans.Author;

public class BookCheck {
	//this class currently just holds methods I want to execute
	
	
	public BookCheck() {
		
	}
	
	//If the user is valid, we will return a user object, otherwise return null
	public Book bookFinder(Book aBook) {
		Book bbook = null;
		if(aBook.getTitle().equals("Testbook")) {
			bbook = new Book(aBook.getTitle(), "FIND THE AUTHOR OF THIS CORRECT BOOK!", 
					"FIND THE CORRECT PAGE COUNT!");
		}
		return bbook;
	}

}