package com.Employee;

import java.util.ArrayList;

public class EmployeeDisplayInfo {

	public static void main(String[] args) {
		/* 
		 * EmployeeData employee1 = new EmployeeData(101, "John Doe", 68, 75000.00,
		 * "Senior Developer", 1234567890L); EmployeeData employee2 = new
		 * EmployeeData(102, "Jane Smith", 45, 60000.00, "Project Manager",
		 * 1234567891L); EmployeeData employee3 = new EmployeeData(103, "Alice Brown",
		 * 34, 50000.00, "Software Engineer", 1234567892L); EmployeeData employee4 = new
		 * EmployeeData(104, "Bob Johnson", 55, 70000.00, "System Analyst",
		 * 1234567893L); EmployeeData employee5 = new EmployeeData(105,
		 * "Charlie Wilson", 29, 48000.00, "Junior Developer", 1234567894L);
		 * EmployeeData employee6 = new EmployeeData(106, "Diana Prince", 60, 80000.00,
		 * "HR Manager", 1234567895L);
		 * 
		 * printEmployeeInfo(employee1); printEmployeeInfo(employee2);
		 * printEmployeeInfo(employee3); printEmployeeInfo(employee4);
		 * printEmployeeInfo(employee5); printEmployeeInfo(employee6);
		 */

		ArrayList<EmployeeData> employeeList = new ArrayList<EmployeeData>();
		employeeList.add(new EmployeeData(101, "John Doe", 68, 75000.00, "Senior Developer", 1234567890L));
		employeeList.add(new EmployeeData(102, "Jane Smith", 45, 60000.00, "Project Manager", 1234567891L));
		employeeList.add(new EmployeeData(103, "Alice Brown", 34, 50000.00, "Software Engineer", 1234567892L));
		employeeList.add(new EmployeeData(104, "Bob Johnson", 55, 70000.00, "System Analyst", 1234567893L));
		employeeList.add(new EmployeeData(105, "Charlie Wilson", 29, 48000.00, "Junior Developer", 1234567894L));
		employeeList.add(new EmployeeData(106, "Diana Prince", 60, 80000.00, "HR Manager", 1234567895L));
		employeeList.add(new EmployeeData(107, "Clark Kent", 30, 80000.00, "News Reporter", 1234467895L));
		employeeList.add(new EmployeeData(107, "Clark Kent", 30, 80000.00, "News Reporter", 1234467895L));
		
		
		/* 
		 * private static void printEmployeeInfo(EmployeeData employee) {
		 * System.out.println(employee.toString() + ", At Retirement Age: " +
		 * (employee.checkRetirement() ? "Yes" : "No")); }
		 */
		for (EmployeeData employee : employeeList) {
			System.out.println(
					employee.toString() + ", At Retirement Age: " + (employee.checkRetirement() ? "Yes" : "No"));
		}

	}
}