package com.syntax.class11;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		/*
		// ARRAYS

		// Create an array of animals and store 6 elements into it.
		// Using 2 different loops, print all elements from the array.

		String[] animals = { "Lion", "Tiger", "Panther", "Gorilla", "Cheeta", "Liger" };

		for (int i = 1; i < animals.length; i++) {
			System.out.println(animals[i] + " ");
		}

		System.out.println();

		System.out.println("--------------");

		for (String anml_name : animals) {
			System.out.println(anml_name + " ");
		}

		// Create an array on double using scanner
		// Calculate the sum of all elements that was stored in an array.

		Scanner scan;
		double[] num;
		double sum = 0;
		int size;

		scan = new Scanner(System.in);
		System.out.println("How many numbers would you like to add up?");
		size = scan.nextInt();

		num = new double[size];

		// store values into arrays
		for (int i = 0; i < size; i++) {
			System.out.println("Please enter double numbers.");
			num[i] = scan.nextDouble();
		}

		/*
		 * loop through created array for (int i = 0; i < num.length; i ++) { sum = sum
		 * + num[i]; }
		 */

		for (double number : num) {
			sum += number;
		}

		System.out.println(sum);

		// Create an array of countries.
		// While retrieving all values from an array print capital for each country.

		//String[] countries = { "France", "Mexico", "Brazil" };
		//String[] capitals = { "Paris", "Mexico City", "Rio" };

		//for (int v = 0; v < countries.length; v++) {
			//System.out.println("The capital of" + countries[v] + " is " + capitals[v]);
		//}

		/* System.out.println("---------------------------");

		String capital;

		for (String country : countries) {
			
			switch (country) {

			case "USA":
				capital = "DC";
				break;
			case "Ukraine":
				capital = "Kiev";
				break;
			case "Canada":
				capital = "Ottawa";
				break;
			default:
				capital = "I do not know ...";
			}

			System.out.println("Capital of the " + country + "is " + capital);
		} */
		
		
		
	

	}
}
