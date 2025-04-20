package com.cts.creatio.crm.language.basics;

public class Assignment3_Employee {

	/*
	 * Create an Employees class that stores the following employee names and IDs in
	 * separate variables: • Employee Names: "Bharath", "ABC", "XYZ" • Employee IDs:
	 * 1234, 1235, 1236 Then, create another class called EmpGroups that contains
	 * two arrays to store the employee names and IDs.
	 * 
	 * Retrieve the data from the Employees class, store it in these arrays, and
	 * finally print each employee's name along with their corresponding ID.
	 * Example: • Employee Name: Bharath, Employee ID: 1234
	 */

	String[][] empData = { { "Bharath", "1" }, { "ABC", "2" }, { "XYZ", "3" },

	};

	public void printdata() {
		System.out.println("Employee 1 name: " + empData[0][0] + "    & ID : " + empData[0][1]);
		System.out.println("Employee 2 name: " + empData[1][0] + "    & ID : " + empData[1][1]);
		System.out.println("Employee 3 name: " + empData[2][0] + "    & ID : " + empData[2][1]);

	}

}
