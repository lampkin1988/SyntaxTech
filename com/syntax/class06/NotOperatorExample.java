package com.syntax.class06;

public class NotOperatorExample {

	public static void main(String[] args) {
		
		//Not operator: reverse the condition
		
		boolean isJavaEasy=false;
		
		if (!isJavaEasy) {
			System.out.println("Please try to spend more time Java");
		}
		
		System.out.println("______________________________");
		
		String day="Saturday";
		
		if(!(day.equals("Sunday")) || day.equals("Saturday")) {
			System.out.println("I am going to work");		
		}
	}
}
		
		
	