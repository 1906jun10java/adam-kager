package com.revature.dao;

import java.util.List;

import com.revature.beans.Author;



public interface AuthorDao {
	public Author getBookById(String lastname);
	public List<Author> getAllAuthors();
	public boolean addAuthor(Author author);
	public boolean updateAuthor(Author author);
	public boolean deleteAuthor(Author author);


}
