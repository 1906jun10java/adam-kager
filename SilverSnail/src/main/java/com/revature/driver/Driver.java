package com.revature.driver;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.beans.Book;
import com.revature.dao.BookDao;
import com.revature.dao.BookDaoImpl;
import com.revature.util.ConnectionUtil;

public class Driver {
	public static void main(String[] args) {
		//Session Get!  This will do a lot of the work!
//		SessionFactory sf = ConnectionUtil.getSessionFactory();
//		//other stuff
//		System.out.println("trying to .openSession");
//		Session s = sf.openSession();
//		
//		System.out.println(s.getStatistics());
//		
//		//save!
//		Transaction tx = s.beginTransaction();
//		s.save(new Book("Percy Jackson and the Lighting Thief", "Fantacy", "Ric", "Riordan"));
//		tx.commit();
//		
//		
//		
//		System.out.println("Closing Session to release the connection");
//		//short and many, not long and few
		BookDao bd = new BookDaoImpl();	
		bd.updateAllAuthorsByAuthorLastname("D.", "Smith");
//		Book b = bd.getBookById(1);
//		System.out.println(b.getTitle());
		bd.getAllBooks();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Additional testing
//		bd.addBook(new Book("Eric and Tim", "Comedy", "Alex", "D."));
//		List<Book> bookList = bd.getAllBooks();
//		for(Book ba : bookList) {
//			System.out.println(ba.getTitle());
//		}
//		bd.addBook(new Book("THIS IS A BOOK TITLE!!!!", "boring genre", "Alex", "D."));
//		List<Book> bookList2 = bd.getAllBooks();
//		for(Book ba : bookList2) {
//			System.out.println(ba.getTitle());
//		}
//		bd.addBook(new Book("IT", "Scarry", "Alex", "D."));
//		List<Book> bookList3 = bd.getAllBooks();
//		for(Book ba : bookList3) {
//			System.out.println(ba.getTitle());
//		}
		// adds a book
		// updates
//		b.setTitle("The Count");
//		bd.updateBook(b);
//		List<Book> bookList2 = bd.getAllBooks();
//		for(Book ba : bookList2) {
//			System.out.println(ba.getTitle());
//		}

//		s.close();
		
	}

}
