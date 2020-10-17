package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		/*
		 * let's ask a tester on which browser they would like to use
		 */
		
		Scanner scan;
		String browser;
		String message;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter a browser");
		browser = scan.nextLine();
		
		switch (browser.toLowerCase()) {
		
		case "safari": 
			message = "Your code will be executed on Safari browser";
			break;
		case"chrome":
		    message = "Your code will be executed on Chrome browser";
		    break;
		case"firefox":
	    message = "Your code will be executed on Firefox browser";
	    break;
	    default:
	    	message = "Entered browser is not supported";
		}
		
		System.out.println(message);
		
		//switch can't work with: double, float, long
		//switch case can't use relational or logical operators
		// switch(l) { CE: can't switch on a value of type long.
		
		//None of these will not work:
        float f=10.99f;
        double d=19.90;
        long l=19099;
        boolean b=true;
        
        
        /*Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad
         * Any other grade --> Not Acceptable. 
         * At the end your program should print which grade was entered by a user with explanation.
         * 
         */
        
        
		String grade;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter a grade");
		browser = scan.nextLine();
		
		switch (browser.toLowerCase()) {
		
		case "A": 
			message = "Excellent";
			break;
		case"B":
		    message = "Good";
		    break;
		case"C":
	    message = "Average";
	    break;
		case "D": 
			message = "Bad";
			break;
	    default:
	    	message = "Not Acceptable";
		}
		
		System.out.println("Your grade is a");
		
		}
		
		
		
		}

}


