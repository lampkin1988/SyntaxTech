package com.syntax.class08;

public class Task {

	public static void main(String[] args) {

//I want to create a multiplication table

		int num1 = 9;
		int mult;

		for (int i = 1; i <= 10; i++) {
			mult = num1 * i;
			System.out.println(num1 + "x" + i + " = " + mult);
		}

	}
}
