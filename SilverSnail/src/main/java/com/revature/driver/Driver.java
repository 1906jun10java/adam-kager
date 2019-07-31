package com.revature.driver;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.Author;
import com.revature.beans.Book;
import com.revature.beans.Flashcard;
import com.revature.beans.FlashcardTopic;
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
//		BookDao bd = new BookDaoImpl();	
//		bd.updateAllAuthorsByAuthorLastname("D.", "Smith");
//		Book b = bd.getBookById(1);
//		System.out.println(b.getTitle());
//		bd.getAllBooks();
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
		
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		// this getBean uses the mapped name from the xml
		Author a = (Author) ac.getBean("author");
		System.out.println(a);
		Flashcard f = (Flashcard) (ac).getBean("componentScannedFlashcard");
		f.setAnswer("42");
		f.setQuestion("What is the meaning");
		f.setId(6);
		f.setTopic(FlashcardTopic.THE_BEATLES);
		System.out.println(f);
		
		ac.close();
		
		
		
	}

}
