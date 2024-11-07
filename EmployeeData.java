package com.Employee;

import java.util.ArrayList;

public final class EmployeeData {
	
	private int empID;
	private String empName;
	private int age;
	private double salary;
	private String designation;
	private long contactNo;
	
//	public EmployeeData() {
//		
//	}
	
	public EmployeeData(int empID, String empName, int age, double salary, String designation, long contactNo) {
        this.empID = empID;
        this.empName = empName;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
        this.contactNo = contactNo;
    }

	public int getEmpID() {
		return empID;
	}

//	public void setEmpID(int empID) {
//		this.empID = empID;
//	}

	public String getEmpName() {
		return empName;
	}

//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}

	public int getage() {
		return age;
	}

//	public void setage(int age) {
//		this.age = age;
//	}

	public double getSalary() {
		return salary;
	}

//	public void setSalary(double salary) {
//		this.salary = salary;
//	}

	public String getDesignation() {
		return designation;
	}

//	public void setDesignation(String designation) {
//		this.designation = designation;
//	}

	public long getContactNo() {
		return contactNo;
	}

//	public void setContactNo(long contactNo) {
//		this.contactNo = contactNo;
//	}

	@Override
	public String toString() {
		return "[empID = " + empID + ", empName = " + empName + ", age = " + age + ", salary = " + salary
				+ ", designation = " + designation + ", contactNo = " + contactNo + "]";
	}
	
	public boolean checkRetirement() {
		if(age > 65) {
			return true;
		}
		else {
		return false;
		}
	}
	
}
