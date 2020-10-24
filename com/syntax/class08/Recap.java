package com.syntax.class08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		/* Ask user to pay for user
		 * water price is $5
		 * Once user enters money, then we need to tell if we need more money or less
		 * Once user gives us exactly $5, then it will print: Enjoy your water!
		 */
		
		Scanner input;
		int money;
		int waterPrice=5;
		
		input=new Scanner(System.in);
		System.out.println("Please pay for your water.");
		money=input.nextInt();
		
		while(money!=waterPrice) {
			if (money>waterPrice) {
				System.out.println("This is too much, you need to enter less money");
			} else {
				System.out.println("Water is expensive, please insert more money");
			}
			money=input.nextInt();
		}
		System.out.println("Enjoy your water");

	}

}
