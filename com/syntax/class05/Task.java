package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner scan;
		double workedYears;
		int annualSalary;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter number of worked years");
		workedYears = scan.nextDouble();
		
		if (workedYears >=5) {
			System.out.println("You are elg");
			System.out.println();
			annualSalary = scan.NextInt("Please enter sal");
			
			if (annualSalary > 50000) {
				System.out.println(5000);
			} else {
				System.out.println(300);
			}
		} else {
			System.out.println("Sorry, no");
			}
		}

	}

