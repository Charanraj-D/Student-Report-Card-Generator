package com.service;

import com.bean.Student;
import com.main.StudentMain;

public class StudentReportCard extends Student {
		
	int total_subjects;
	int points_earned;
	float gpa;
	float cgpa;
			
	public StudentReportCard(int studentID, String
			studentName, String departmentName, int
			semesterNo, int total_subjects, int
			points_earned) {
		
		super();
		this.studentID= studentID;
		this.studentName= studentName;
		this.departmentName= departmentName;
		this.semesterNo= semesterNo;
		this.total_subjects = total_subjects;
		this.points_earned = points_earned;
		this.gpa = gpa;
		this.cgpa = cgpa;
	}
	
	public float gpaCalculator(){
		
		float gpa;
		gpa = ((total_subjects*points_earned)/7.0f);
		return gpa;
		
	}
	
	public float cgpaCalculator(float gpa){
	
		float cgpa;
		cgpa = (gpa/semesterNo);
		return cgpa;
	}

	public void display(){
		
		System.out.println("Student ID : "+studentID);
		System.out.println("Name of the student : "+studentName);
		System.out.println("Department Name : "+departmentName);
		System.out.println("Semester Number : "+semesterNo);
		System.out.println("GPA Computed :"+gpaCalculator());
		System.out.println("CGPA Computed :"+cgpaCalculator(gpaCalculator()));
	}
	
}
