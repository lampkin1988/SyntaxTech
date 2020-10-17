package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {

	/* public static void main(String[] args) {
		
		Scanner input;
		int number;
		
		input = new Scanner (System.in);
		System.out.println("Please enter any number");
		number=input.nextInt();
		
		if (number>0 && number<=10) {
			System.out.println("You entered small number");
		} else if (number>10 && number<=100){
			System.out.println("You entered medium number");
		} else if (number>100 && number <=1000) {
			System.out.println("You entered large number");
		}
	}

} */




	public static void main(String[] args) {
		
		Scanner input;
		int number;
		
		input = new Scanner (System.in);
		System.out.println("Please enter height ");
		number=input.nextInt();
		
		if (number>0 && number<=60) {
			System.out.println("You entered small height");
		} else if (number>60 && number<=72){
			System.out.println("You entered medium height");
		} else if (number<=73) {
			System.out.println("You entered tall height");
		}
	}

}
