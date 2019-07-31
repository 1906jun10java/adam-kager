package com.revature.beans;

public class Author {
	private int id = 0;
	private String firstname = "firstname";
	private String lastname = "lastname";
	private String state = "state";
	
	
	public Author(int id, String firstname, String lastname, String state) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.state = state;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", state=" + state + "]";
	}
	

}
