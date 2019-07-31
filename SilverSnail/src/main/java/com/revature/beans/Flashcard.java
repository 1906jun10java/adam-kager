package com.revature.beans;


public class Flashcard {
	
	protected String question;
	protected String answer;
	protected FlashcardTopic topic;
	protected int id;
	public Flashcard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flashcard(String question, String answer, FlashcardTopic topic, int id) {
		super();
		this.question = question;
		this.answer = answer;
		this.topic = topic;
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public FlashcardTopic getTopic() {
		return topic;
	}
	public void setTopic(FlashcardTopic topic) {
		this.topic = topic;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}