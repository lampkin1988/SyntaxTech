package com.syntax.class20;

public class Task4 {

	
		
	//Write program that have static constructor and observe result.
		
	public class Student {
	    String name;
	    String address;
	    Student(String name, String address){
	        this.name=name;
	        this.address=address;
	    }
	    void displayInfo(){
	        System.out.println("Student name is "+name+" and student address is "+address);
	    }
	    public static void main(String[] args) {
	        Student student=new Student ("Lucas","225 Chestnut Hill ave, Brookline");
	        student.displayInfo();
	    }
	}
	
	

		
	}


