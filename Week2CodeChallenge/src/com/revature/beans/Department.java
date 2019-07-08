package com.revature.beans;

public class Department {
	String empId;
	String empFirst;
	String empLast;
	Double salary;
	String empEmail;
	String deptId;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String empId, String empFirst, String empLast, Double salary, String empEmail, String deptId) {
		super();
		this.empId = empId;
		this.empFirst = empFirst;
		this.empLast = empLast;
		this.salary = salary;
		this.empEmail = empEmail;
		this.deptId = deptId;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpFirst() {
		return empFirst;
	}
	public void setEmpFirst(String empFirst) {
		this.empFirst = empFirst;
	}
	public String getEmpLast() {
		return empLast;
	}
	public void setEmpLast(String empLast) {
		this.empLast = empLast;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "Department [empId=" + empId + ", empFirst=" + empFirst + ", empLast=" + empLast + ", salary=" + salary
				+ ", empEmail=" + empEmail + ", deptId=" + deptId + "]";
	}

}
