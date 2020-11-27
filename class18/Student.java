package com.syntax.class18;

public class Student {

	
	
	/*Create a Class called Students
	Create three  variables  studentName , studentID  and  numberOfStudents
	Create three objects of the Students Class 
	Set the value for  studentName , studentID and increment  the numberOfStudents for each object
	Print out  total number of students*/
	
	String studentName;
	int studentID;
	static int numberOfStudents;
	
	public static void main(String[] args) {
		
		Student student1=new Student();
		student1.studentID=123;
		student1.studentName="Shawn";
		Student.numberOfStudents++;
		
		
		System.out.println(student1.studentName);
		System.out.println(student1.studentID);
		System.out.println(Student.numberOfStudents);
		
		Student student2=new Student();
		student2.studentID=12345;
		student2.studentName="Michael";
		Student.numberOfStudents++;
		
		System.out.println(student2.studentName);
		System.out.println(student2.studentID);
		System.out.println(Student.numberOfStudents);
		
		
		

	}

}
