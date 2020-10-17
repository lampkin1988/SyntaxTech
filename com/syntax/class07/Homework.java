package com.syntax.class07;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter two numbers");
		double num1=input.nextInt();
		double num2=input.nextInt();
		System.out.println("Please enter any of the operators: +,-,*,/");
		char operator=input.next().charAt(0);
		
		int result = 0;
		char operation=0;
		
		switch(operator) {
		case '+':
		result= (num1 + num2);
		break;
		case '-':
		result= (num1 - num2);
		break;
		case '*':
		result= (num1 * num2);
		break;
		case '/':
		result= (num1 / num2);
		break;
		default:
		System.out.println("Invalid operation");
		
		
		}
		
		if (result != 0) {
			System.out.println("The result is " +result);
		}
	}



	}


