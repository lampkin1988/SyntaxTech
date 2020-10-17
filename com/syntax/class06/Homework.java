package com.syntax.class06;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		/*Scanner input;
		double sales;
		double commission;
		
		System.out.println("Please Enter Sales Amount");
		
		if (sales >= 10 && sales < 100) {
			commission = (sales * 10) / 100;
		}else if (sales >= 100 && sales < 200) {
			commission = (sales * 20) / 100;
		}else if (sales >= 200 && sales < 500) {
			commission = (sales * 30) / 100;
		}else if (sales >= 200 && sales < 500) {
			commission = (sales * 50) / 100;
		}else {
			commission = 0;
		}
		
		System.out.println("You will get money" + commission + " commission");
		
		if (commission>1000) {
			System.out.println("You are awesome");
		}
	}*/
		
		
		//LARGEST NUMBER EXAMPLE
		
		
	Scanner scanner = new Scanner(System.in);
	double num1, num2, num3, max;
	
	num1 = scanner.nextDouble ();
	num2 = scanner.nextDouble ();
	num3 = scanner.nextDouble ();
	scanner.close();

	if (num1 > num2 && num1 > num3) {
		max = num1;
	} else if (num2 > num3) {
		max = num2;
	} else {
		max = num3;
	}
	System.out.println(max);
	
	double biggest ;
	System.out.println("_______ Comparing two numbers using nested if ______");
	
	double biggest;
	if (num1 > num2) { // if num1 larger than num2
		if (num1 > num3) {
			biggest = num1;
		} else {
			biggest = num3;
		}
	} else { // num2 is larger than num1
		if (num2 > num3) {
			biggest = num2;
		} else {
			biggest = num3;
		}
	}
	System.out.println(“The largest number is ” + biggest);
	
	
	
}
}