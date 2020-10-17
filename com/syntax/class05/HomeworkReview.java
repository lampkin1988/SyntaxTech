package com.syntax.class05;

import java.util.Scanner;

public class HomeworkReview {

	public static void main(String[] args) {
		//Create a java program that will ask if user has a credit card or not. 
		//If user doesn't have a credit card then offer them.
		//If they do have one, ask what is the balance on the card?
		//If balance of the card is larger than 100
		//Tell them to pay off immediately, otherwise you can tell them that they can spend more
	
		int a = 10;
		int b;
		b = 90;

		Scanner scan;
		String answer;
		double balance;

		scan = new Scanner(System.in);
		System.out.println("Please enter if you have a credit card (true/false)");

		answer =scan.next();

		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on your card?");
			balance = scan.nextDouble();
			if (balance > 1000) {
				System.out.println("Please pay off your credit card");
			} else {
				System.out.println("You can spend more money");
			}
		} else {
			System.out.println("Would like to get a credit card?");
		}

	}

}



		
	