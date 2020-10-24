package com.syntax.class08;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		//Print good morning five times.
		
		
		/*For Syntax
		
		for (initialization; condition; increment/decrement;)*/
		

		for (int i = 5; i <10; i++) {
			System.out.println("Good Morning");
		}
		
		
		//I want to print number from 1 to 100
		
		
		/*For Syntax
		
		for (start point; end point; increment/decrement ) {
			code;
		}*/
		
		for(int i=1; i<=100; i++) {
			System.out.println(i);
	}
		
		System.out.println("----I want to print numbers 10 to 0 ---------");
		
		for (int i=10; i>=0; i--) {
			System.out.println(i+" ");
		}
		
		System.out.println("-----What will be the output?-----");
		
		for(int i=0; i<=30; i+=3) {
			System.out.println(i+" ");
		}
	}
	
}
