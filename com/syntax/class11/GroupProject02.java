package com.syntax.class11;

public class GroupProject02 {

	public static void main(String[] args) {
		
		//Write a java program to check whether a given number is prime or not?
		int i, k = 0, num = 0;
		int j = 3;
		k = j / 2;
		if (j == 0 || j == 1) {
			System.out.println(j + " is not a prime number.");
		} else {
			for (i = 2; i <= k; i++) {
				if (j % i == 0) {
					System.out.println(j + " is not a prime number.");
					num = 1;
					break;
				}
			}
			if (num == 0) {
				System.out.println(j + " is a prime number.");
			}
		}
	}
}
	


