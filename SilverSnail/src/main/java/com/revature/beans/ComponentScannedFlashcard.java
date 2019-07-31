package com.revature.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class ComponentScannedFlashcard extends Flashcard {

	private Author author;

	public ComponentScannedFlashcard() {
		super();

	}

	public ComponentScannedFlashcard(String question, String answer, FlashcardTopic topic, int id) {
		super(question, answer, topic, id);

	}

	public Author getAuthor() {
		return author;
	}
	
	@Autowired 
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

