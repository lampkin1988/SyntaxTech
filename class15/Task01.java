package com.syntax.class15;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		// Create a String and if the String is not empty perform the following:
		// if the String has an odd number of characters and has 3 or more characters,
		// print the character in the middle of the String.
		// Create a String and print it in reverse order (Sunday → yadnuS).

		System.out.println(7 / 2);
		String string = "Strings";
		int length = string.length();
		if (!string.isEmpty()) {
			if (length > 3 && length % 2 != 0) {
				System.out.println(string.charAt(length / 2)); // Dividing 7 by 2 = 3
			}

			// Write a program that reads two people's first names and if they expecting boy
			// or girl?

			/*
			 * Based on the input suggests a name for a baby:
			 * 
			 * Example Output: Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl?
			 * boy Suggested baby name: DANRY
			 * 
			 * Example Output: Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl?
			 * girl Suggested baby name: MAIEL
			 */

			Scanner scanner = new Scanner(System.in);

			String momsName, dadsName, gender, babyName;

			System.out.println("Please enter dad's name");
			dadsName = scanner.nextLine();

			System.out.println("Please enter mom's name");
			momsName = scanner.nextLine();

			System.out.println("Please enter baby's gender");
			gender = scanner.nextLine();

			if (gender.toLowerCase().startsWith("m")) {
				String firstPart = dadsName.substring(0, dadsName.length() / 2);
				String lastPart = momsName.substring(momsName.length() / 2);
				babyName = firstPart + lastPart;
			} else if (gender.toLowerCase().startsWith("f")) {
				String firstPart = momsName.substring(0, dadsName.length() / 2);
				String lastPart = dadsName.substring(momsName.length() / 2);
				babyName = firstPart + lastPart;

			} else {
				babyName = "No suggestions ";
			}

			System.out.println(babyName);

		}

	}
}
