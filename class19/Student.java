package com.syntax.class19;

public class Student {


	
	//Write a java program of Class Students that takes students name and 3 subject grades. Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks. Your program should print an average mark of each students name.
	//NOTE: please use different names for instance and local variables.
		
		Student(String nameValue, double subjectValue, double subject2Value, double subject3Value){
			
			name = nameValue;
			subject1 = subject1Value;
			subject2 = subject2Value;
			subject3 = subject3Value;
		}
		
		void printGradeAverage() {
			double avg=(subject1+subject2+subject3)/3;
			System.out.println("Average marks for " + name + "are "+avg);
			
			
			void printsubject1Marks() {
				
			}
			
			public static void main(String[] args) {
				Student student1=new Student(nameValue: "Marta", subject1Value: 93, subject2value: 90, subject3Value: 91);
				student1.printGradeAverage();
				Student student2=new Student(nameValue: "Jack", subject1Value: 87, subject2value: 80, subject3Value: 97);
				student2.printGradeAverage();
				Student student3=new Student(nameValue: "Danilo", subject1Value: 100, subject2value: 100, subject3Value: 100);
				student3.printGradeAverage();
				Student student4=new Student(nameValue: "Maria", subject1Value: 98, subject2value: 94, subject3Value: 96);
				student4.printGradeAverage();
				Student student5=new Student(nameValue: "Nabin", subject1Value: 100, subject2value: 100, subject3Value: 92);
				student5.printGradeAverage();
			
			}
		
	}

}
