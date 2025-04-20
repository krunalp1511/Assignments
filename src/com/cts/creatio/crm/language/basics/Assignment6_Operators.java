package com.cts.creatio.crm.language.basics;

public class Assignment6_Operators {

	public static void main(String[] args) {

		/*
		 * Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
		 * marks [75, 80, 82] Add 10 marks to each students using assignment operators
		 * and store it into another array, after adding 10 marks identify the average
		 * marks of all students
		 */

		// Step 1: Arrays for student names and original marks
		String[] students = { "Suresh", "Mahesh", "Naresh" };
		int[] originalMarks = { 75, 80, 82 };

		// Step 2: Array to store updated marks
		int[] updatedMarks = new int[students.length];

		// Step 3: Add 10 marks to each and store in updated array
		for (int i = 0; i < students.length; i++) {
			updatedMarks[i] = originalMarks[i];
			updatedMarks[i] += 10; // assignment operator
		}

		
		// Step 4: Calculate average
        int total = 0;
        for (int mark : updatedMarks) {
            total += mark;
        }
        double average = (double) total / updatedMarks.length;

        // Output
        System.out.println("Updated Marks:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + ": " + updatedMarks[i]);
        }

        System.out.println("\nAverage Marks: " + average);
		 
	}

}
