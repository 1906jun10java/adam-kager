package com.revature.beans;

public class FlashcardWithSetter extends Flashcard{
	
	// this flashcard will need an author as a dependency 
	// not in the constructor
	
	private Author author;

	public FlashcardWithSetter() {
		super();

	}

	public FlashcardWithSetter(String question, String answer, FlashcardTopic topic, int id) {
		super(question, answer, topic, id);

	}

	public Author getAuthor() {
		return author;
	}
	// this is where the Author will be setter injection
	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "FlashcardWithSetter [author=" + author + ", question=" + question + ", answer=" + answer + ", topic="
				+ topic + ", id=" + id + ", getAuthor()=" + getAuthor() + ", getQuestion()=" + getQuestion()
				+ ", getAnswer()=" + getAnswer() + ", getTopic()=" + getTopic() + ", getId()=" + getId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}



}
