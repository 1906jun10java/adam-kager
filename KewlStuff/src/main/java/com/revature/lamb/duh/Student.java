package com.revature.lamb.duh;

public abstract class Student implements Comparable<Student>{
	private int studentID;
	private String label;
	private double gpa;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentID, String label, double gpa) {
		super();
		this.studentID = studentID;
		this.label = label;
		this.gpa = gpa;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studenID) {
		this.studentID = studenID;
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
		return "StudentBean [studenID=" + studentID + ", label=" + label + ", gpa=" + gpa + "]";
	}
//	@Override
//	public int compareTo(Student arg0) {
//		
//		return this.getStudentID() - arg0.getStudentID();
//	}
	
	
	
}
