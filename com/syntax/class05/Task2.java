package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F*/
		
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
		
		if(avg>90) {
			System.out.println("Grade = A");
			System.out.println("You're a good student, you are studying a lot!");
		} else if (avg>=70 && avg<90) {
			System.out.println("Grade = B");
			System.out.println("You're a good student, you are studying a lot!");
		} else if (avg>=50 && avg <70) {
			System.out.println("Grade = C");
			System.out.println("Please study more!");
		} else if (avg>=50 && avg <70) {
			System.out.println("Grade = D");
			System.out.println("Please study more!");
		} else {
			System.out.println("Please study more!");
		}
		
		//if your grade is A or B: You're a good student, you are studying a lot!
		
	}

}
