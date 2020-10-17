package com.syntax.class04;

public class SequenceIsImportant {

	public static void main(String[] args) {
		
		//debug your code later and analyze what are the issues!
		///do not make this mistake!
		int score=85;
		boolean assignment=true;
				
				if(assignment) {
					
					if (score>90) {
						System.out.println("You did great!");
					} else if (score>70) {
						System.out.println("You did good!");
					} else if (score>80) {
						System.out.println("You need to study more!");
					} else {
						System.out.println("Good job for trying, but you must study!");
					}
					
				}else {
					System.out.println("You need to complete assignment(s)");
				}
			


	}

}
