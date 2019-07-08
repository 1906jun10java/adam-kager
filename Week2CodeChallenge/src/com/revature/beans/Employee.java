package com.revature.beans;

public class Employee {
	String deptId;
	String deptName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Employee [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
}
