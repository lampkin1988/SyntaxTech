package com.syntax.class05;

import java.util.Scanner;

public class Task2Improved {

	public static void main(String[] args) {
		Scanner scan;
		int quiz, midTerm, finalScore, avg;
		
		scan = new Scanner(System.in);
		
		System.out.println("Please enter your quiz score");
		quiz = scan.nextInt();
		System.out.println("Please enter mid term score");
		midTerm = scan.nextInt();
		System.out.println("Please enter your final score");
		finalScore = scan.nextInt();
		
		avg = (quiz +midTerm + finalScore)/3;
		
		
		char grade;
		
		if(avg>90) {
			grade = 'A';
		} else if (avg>=70 && avg<90) {
			grade = 'B';
		} else if (avg>=50 && avg <70) {
			grade = 'C';
		} else if (avg>=50 && avg <70) {
			grade = 'D';
		} else {
			grade='F';		
		}
		System.out.println("Grade is = "+grade);
		
		if(grade=='A' || grade =='B') {
			System.out.println("You are a good student!");
		} else {
			System.out.println("Please study more!");
		}
	}

}
