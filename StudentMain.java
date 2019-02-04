package com.main;

import java.util.Scanner;

import com.service.StudentReportCard;

public class StudentMain {
	
	
	public static boolean validateInputs(int studentID, int semNumber, int total_subjects, 
			int	points_earned){
		
		 int length = String.valueOf(studentID).length();
		 
		if(length==4 & (0<total_subjects && total_subjects<=7) & (0<semNumber && semNumber<=7) &
				(0<points_earned && points_earned<=20))
			return true;
		else
			return false;
	}
	
	
	public static void main(String abcd[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Student ID : ");
		int studentID = scanner.nextInt();
		
		System.out.println("Enter Student Name : ");
		 String studentName = scanner.next();
		 
		System.out.println("Enter Semester Number : "); 
		 int semesterNo = scanner.nextInt();
		 
		 System.out.println("Enter Department Name : "); 
		 String departmentName = scanner.next();
		 
		 System.out.println("Enter total subjects");
		 int totalsubjects = scanner.nextInt();
		 
		 System.out.println("Enter points earned");
		 int pointsearned = scanner.nextInt();
		 
				 
		 boolean vim = validateInputs( studentID,  semesterNo,  totalsubjects, pointsearned);
		 
		 if(vim){
			 StudentReportCard reportObject = new StudentReportCard(studentID, studentName, departmentName, semesterNo, totalsubjects, pointsearned);
			 
			 reportObject.display();
			 }
		 else{
			 System.out.println("Invalid Request");
		 }
		
	}

}
