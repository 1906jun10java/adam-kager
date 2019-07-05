package com.revature.lamb.duh;

public class StudentBean {
	private int studenID;
	private String label;
	private double gpa;
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentBean(int studenID, String label, double gpa) {
		super();
		this.studenID = studenID;
		this.label = label;
		this.gpa = gpa;
	}
	public int getStudenID() {
		return studenID;
	}
	public void setStudenID(int studenID) {
		this.studenID = studenID;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "StudentBean [studenID=" + studenID + ", label=" + label + ", gpa=" + gpa + "]";
	}
	
	
	
}
