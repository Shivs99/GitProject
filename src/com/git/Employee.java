package com.git;

public class Employee {

	private String empName;
	private int empId;
	private int empSal;
	
	public Employee() {}

	public Employee(String empName, int empId, int empSal) {
		this.empName = empName;
		this.empId = empId;
		this.empSal = empSal;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	
	
	
	
	
}
