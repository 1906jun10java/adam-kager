package com.revature.beans;

//Name for JPA - for Java Persistence 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="BOOK")

public class Book {
	@Id  //@Id persistent identity is the PRIMARY KEY
	//if you are expecting to use all ORM, set it up here
	@GeneratedValue(strategy=GenerationType.AUTO, generator="bookSequence")
	//Defaults to 50 defaults to 1
	@SequenceGenerator(allocationSize=1, name="bookSequence", sequenceName="SQ_BOOK_PK")
	@Column(name="BOOK_ID")
	private int id;
	@Column(name="BOOK_TITLE")
	private String title;
	@Column(name="BOOK_GENRE")
	private String genre;
	@Column(name="BOOK_FIRSTNAME")
	private String autherFirstName;
	@Column(name="BOOK_LASTNAME")
	private String authorLastName;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String title, String genre, String autherFirstName, String authorLastName) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.autherFirstName = autherFirstName;
		this.authorLastName = authorLastName;
	}
	//constructor without ID!!!!
	public Book(String title, String genre, String autherFirstName, String authorLastName) {
		super();
		
		this.title = title;
		this.genre = genre;
		this.autherFirstName = autherFirstName;
		this.authorLastName = authorLastName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAutherFirstName() {
		return autherFirstName;
	}
	public void setAutherFirstName(String autherFirstName) {
		this.autherFirstName = autherFirstName;
	}
	public String getAuthorLastName() {
		return authorLastName;
	}
	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autherFirstName == null) ? 0 : autherFirstName.hashCode());
		result = prime * result + ((authorLastName == null) ? 0 : authorLastName.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + id;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (autherFirstName == null) {
			if (other.autherFirstName != null)
				return false;
		} else if (!autherFirstName.equals(other.autherFirstName))
			return false;
		if (authorLastName == null) {
			if (other.authorLastName != null)
				return false;
		} else if (!authorLastName.equals(other.authorLastName))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (id != other.id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", genre=" + genre + ", autherFirstName=" + autherFirstName
				+ ", authorLastName=" + authorLastName + "]";
	}
	
	
	
}
