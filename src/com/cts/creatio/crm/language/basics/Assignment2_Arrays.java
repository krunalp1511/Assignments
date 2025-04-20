package com.cts.creatio.crm.language.basics;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Problem: Multi-Dimensional Array Practice 
		1. Create a 3D array to represent the following data: 
		o Semesters as the first dimension. 
		o Subjects and Status/Marks as the second dimension. 
		o Actual values for Subject Names and Marks as the third dimension. 
		2. From the array: 
		o Print Semester 2 Subject 4 and Subject 5 names. 
		o Print the Status/Marks of Semester 4 Subject 3 and Subject 6.*/
		
			
		String [][][] studentData = {
				
				{  //sem1
					{"Mathematics I","Pass(78)"},
					{"Physics","Pass(85)"},
					{"Chemistry","Fail(21)"},
					{"Computer Programming","Pass(74)"},
					{"Engineering Drawing","Pass(88)"},
					{"Basic Electrical Eng.","Pass(79)"},
				},
				
				{ //sem2
					{"Mathematics II","Pass(82)"},
					{"Mechanics","Pass(77)"},
					{"Environmental  Sci.","Pass(93)"},
					{"Basic Electronics","Fail(19)"},
					{"Engineering Physic","Fail(24)"},
					{"Engineering Graphics","Pass(90)"},
					
				},
				
				{ //sem3
					{"Data Structures","Pass(88)"},
					{"Discrete Mathematics","Pass(81)"},
					{"Digital Electronics","Pass(76)"},
					{"Operating Systems","Fail(32)"},
					{"Signals and Systems","Pass(85)"},
					{"Object-Oriented Prog.","Pass(78)"},
					
				},
				{ //sem4
					{"Algorithms","Pass(91)"},
					{"Computer Networks","Pass(73)"},
					{"Database Systems","Fail(19)"},
					{"Microprocessors","Pass(80)"},
					{"Communication Eng.","Pass(76)"},
					{"Software Engineering","Pass(87)"},
					
				},
				
				{ //sem5
					{"Probability & Stats","Pass(86)"},
					{"Machine Learning","Pass(88)"},
					{"Compiler Design","Pass(84)"},
					{"Theory of Computation","Pass(95)"},
					{"Embedded Systems","Pass(73)"},
					{"Computer Graphics","Pass(90)"},
					
				},
				
				
			
		};
		
		
		System.out.println("Sem 2 , Sub 4 :" + studentData[1][3][0]);
		System.out.println("Sem 2 , Sub 5 :" + studentData[1][4][0]);
		System.out.println("Sem 4 , Sub 3 with status :" + studentData[1][3][1]);
		System.out.println("Sem 4 , Sub 6 with status :" + studentData[1][5][1]);
	
	}

}
