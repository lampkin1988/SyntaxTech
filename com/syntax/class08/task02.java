package com.syntax.class08;

import java.util.Scanner;

public class task02 {

	public static void main(String[] args) {

		// Print numbers from 1 to 50 except those that are divisible by 3

		for (int i = 1; i <= 50; i++)

			if (i % 3 == 0) {
				continue;

				System.out.println(i + " ");
	
			}
	}
	// Create a program that will keep asking user to apply for a credit card.
	// As soon as you get "yes" from the user, program should stop asking.

	Scanner scan = new Scanner(System.in); 
	String response; 

	do {
		System.out.print("Do you want to apply for credit car");
		response=scan.nextLine();
		
	}while(!response.equalsIgnoreCase("yes"));

	System.out.print("You are selected");

	

	
	
}

}
	

