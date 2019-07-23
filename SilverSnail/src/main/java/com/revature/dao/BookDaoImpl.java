package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.beans.Book;
import com.revature.util.ConnectionUtil;

public class BookDaoImpl implements BookDao{
	
	//getting session factory!
	private SessionFactory sf = ConnectionUtil.getSessionFactory();

	@Override
	public Book getBookById(int id) {
		System.out.println("running getBookById(int id) in BookDaoImple");
		Book b = null;
		
		//try with resources!
		try (Session s = sf.openSession()) {
			// Transaction tx = s.beginTransaction();
			// UpCasting because book.class is the class it self
			b = (Book) s.get(Book.class, id);
			//tx.close();
//		} catch (Exception
		} catch (Exception e) {
			System.out.println("Catch used, though not needed because try with resources pattern");
			System.out.println("Null returned by getBookById");
		}
		return b;
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> bookList = new ArrayList<>();
		// Using Query because of limitations of Session... you can get ONE THING
		try (Session s = sf.openSession()) {
			//THIS IS HQL REFERING TO THE JAVA CLASS
			// this is like result list
			bookList = s.createQuery("from Book").getResultList();
		}
		return bookList;
	}

	@Override
	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

}
