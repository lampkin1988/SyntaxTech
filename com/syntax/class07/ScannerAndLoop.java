package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
	//Ask user what is his name 5 times. Also, print: hello +name
		
		/* Scanner scan;
		String name;
		
		scan=new Scanner(System.in);
		
		int number=1;
		
		while(number<=5) {
			
		System.out.println("Please tell me your name");
		name=scan.nextLine();
		System.out.println("Nice to meet you "+name);
		System.out.println("-----------------------");
		number++;
	}
		
		
		System.out.println("-----------------------");
		
		*/
		
		//Lucky number 
		//Play a lottery. We need to enter numbers 1 to 100
		//Lucky number is 7
		//Keep asking the user to enter a number, until it's a lucky number
		
		/*
		Scanner scan;
		int numberFromUser;
		
		int luckyNumber=7;
		
		scan=new Scanner(System.in);
		
		do  {
				System.out.println("Please enter any number from range 1 to 100");
				scan.nextInt();
		}while(numberFromUser!=luckyNumber);
		
		System.out.println("You guessed the number right!");
		
		*/
		
		
		///Lucky Number with While
		
	
		
		//Lucky number 
		//Play a lottery. We need to enter numbers 1 to 100
		//Lucky number is 7
		//Keep asking the user to enter a number, until it's a lucky number
		
		
		Scanner scan;
		int numberFromUser;
		
		int luckyNumber=7;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter any number from 1 to 100");
		numberFromUser=scan.nextInt();
		
		while(numberFromUser!=luckyNumber) {
			System.out.println("Please enter any number from 1 to 100");
		}

}
}
