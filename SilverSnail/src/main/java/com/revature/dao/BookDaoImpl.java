package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.revature.beans.Book;
import com.revature.util.ConnectionUtil;

public class BookDaoImpl implements BookDao {

	// getting session factory!
	private SessionFactory sf = ConnectionUtil.getSessionFactory();

	@Override
	public Book getBookById(int id) {
		System.out.println("running getBookById(int id) in BookDaoImple");
		Book b = null;

		// try with resources!
		try (Session s = sf.openSession()) {
			// Transaction tx = s.beginTransaction();
			// UpCasting because book.class is the class it self
			b = (Book) s.get(Book.class, id);
			// tx.close();
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
			// THIS IS HQL REFERING TO THE JAVA CLASS
			// this is like result list
			bookList = s.createQuery("from Book").getResultList();
		}
		return bookList;
	}

	@Override
	public boolean addBook(Book book) {
		boolean added = false;
		try (Session s = sf.openSession()) {
			// transactions are just units of work in a database, watch for Transaction
			// Propagation
			// wrap in a transaction to make a commit to the database
			Transaction tx = s.beginTransaction();
			s.persist(book); // Alternative to "save"
			tx.commit();
			added = true;
		}
		return added;
	}

	@Override
	public boolean updateBook(Book book) {
		boolean updated = false;
		try (Session s = sf.openSession()) {
			// transactions are just units of work in a database, watch for Transaction
			// Propagation
			Transaction tx = s.beginTransaction();
			s.saveOrUpdate(book); // Alternative to "save"
			tx.commit();
			updated = true;
		}
		return updated;
	}

	@Override
	public boolean deleteBook(Book book) {
		boolean deleted = false;
		try (Session s = sf.openSession()) {
			// transactions are just units of work in a database, watch for Transaction
			// Propagation
			Transaction tx = s.beginTransaction();
			s.delete(book);
			tx.commit();
			deleted = true;
		}
		return deleted;
	}

	@Override
	public boolean updateAllAuthorsByAuthorLastname(String authorLastname, String newAuthorLastname) {
		boolean updated = false;
		try (Session s = sf.openSession()) {
			System.out.println("This does not work");
			
		}

		return false;
	}

}
