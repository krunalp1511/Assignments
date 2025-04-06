package com.cts.creatio.crm.language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class FirstJavaProgram {
	
	/******** Advantage of Print Statements 
	 * @throws FileNotFoundException ********/
	
	// Debugging and Error Detection
	// Monitoring Program Execution
	// Testing and Validation 
	// Education and Learning
	// Logging System

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
			System.out.println("Hello, World!");
			
			
			System.out.println("Hello, World!");
		       System.out.println("Hello, KP!");
		       
		       // Print the content and then stay on same line
		       System.out.print("Hello,");
		       System.out.print(" World!");
		       System.out.println();
		       
		       // Print the formated content and then stay on same line
		       System.out.printf("%s is completed Mastre, empId is %d and visa status is %b","KP",45,true);
		       System.out.println();
		       
		       // Format the digits and then Print the formated content and then stay on same line
		       System.out.format("Total Amount is %.2f %n",100.93543539);
		       System.out.println();
		       
		       // Join multiple print statements together
		       System.out.append("My Name is Krunal").append(", My emp id is 45");
		       System.out.println();
		       
		       // Print the char based on ASCII value
		       System.out.write(65);
		       System.out.println();
		       
		       // Print Logs of Program
		       
		       Logger log = Logger.getLogger("MyLog");
		       log.info("Current line is 49");
		       log.warning("Warning at line no 50");
		       		       
		       
		       // Print the errors in print statements
		       System.err.println("ERROR : Expected result is not matching with actual Result");
		       
		       PrintWriter writer = new PrintWriter("G:\\AutomationTraining\\AutomationProject\\Logs.txt");
		       writer.println(LocalDateTime.now()+"Currently Line 59 is running");
		       writer.println(LocalDateTime.now()+"Currently Line 60 is running");
		       writer.println(LocalDateTime.now()+"Execution is completed");
		       writer.close();
	}

}
