package com.syntax.class17;

public class Task01 {

	public static void main(String[] args) {
		
		
		//Create a method createEmail(). Based on values of users name, lastName and email type, your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or 
				
		String createEmail(String firstName, String lastName, String emailType) {
			
			return firstName+lastName+ "@" +emailType+" .com";
			
			
			Task1 task1=new Task();
			String email = task1.createEmail(firstName: "Ash", lastName: "Lamp", emailType: "Gmail")
			System.out.println(email);
			
			Task2 task2 = new Task2();
			boolean prime = task2.isPrime(number:);
			boolean prime = task2.isPrime(number:);
			boolean prime = task2.isPrime(number:);
			System.out.println();
			System.out.println();
			System.out.println();
			
			
		}
		
		
		
		//Write a method to return whether given number is prime or not? (Prime numbers can only be int).
		
		if(number <=1) {
			return false;
		}
		boolean isPrime(int number) {
			boolean isPrime=true;
			for (int i=2; i<=number/2;i++) {
				if(number%i==0) {
					isPrime=false;
					break;
				}
			}
			
			return isPrime;
		}
				
		
		
		//Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
				/*score > 90 - A
				score >80 - B
				score >70 - C
				score > 50 - D
				anything else - F*/
		
		char getGrade(int marks) {
			char grade;
			switch (marks) {
			if (marks >= 90 && marks <=100) {
				grade='A';		
			} else if (marks >= 80 && marks <90) {
				grade='B';
			} else if (marks >= 70 && marks <80) {
				grade = 'C';
			} else if (marks >= 60 marks && <70) {
				grade ='D';
		} else {
			grade = 'F';
		}
		
		return grade;
			}
		
		public staic void main (String[] args) {
			Task3 task3 = new Task3();
			System.out.println(" task3.getGrade(90) "+ task3.getGrade(marks:90));
			System.out.println(" task3.getGrade(101) "+ task3.getGrade(marks:101));
			System.out.println(" task3.getGrade(40) "+ task3.getGrade(marks:40));
			System.out.println(" task3.getGrade(-1) "+ task3.getGrade(marks:-1));
		}
		
		
	}

}
