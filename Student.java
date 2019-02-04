package com.bean;

public class Student {
	
	 protected int studentID;
	 protected String studentName;
	 protected String departmentName;
	 protected int semesterNo;
	
	
	public Student(int studentID, String studentName, String departmentName, int semesterNo) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.departmentName = departmentName;
		this.semesterNo = semesterNo;
	}
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public void display(){
		
		System.out.println("Student ID: "+studentID);
		System.out.println("Student Name: "+studentName);
		System.out.println("Department Name: "+departmentName);
		System.out.println("Semester No: "+semesterNo);
		
	}

}
