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
		//short and many, not long and few
		BookDao bd = new BookDaoImpl();	
		Book b = bd.getBookById(1);
		System.out.println(b.getTitle());
		
		List<Book> bookList = bd.getAllBooks();
		for(Book ba : bookList) {
			System.out.println(ba.getTitle());
		}

//		s.close();
		
	}

}
