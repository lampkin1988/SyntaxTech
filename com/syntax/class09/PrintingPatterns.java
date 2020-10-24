package com.syntax.class09;

public class PrintingPatterns {

	public static void main(String[] args) {
		
		//Printing patterns (long Way)
		
		/*for (int i=1; i<=5; i++) {
			System.out.print("*");
		}
		
		System.out.println(); */
		
		/*****
		 *****
		 *****
		 *****
		 */
		
		/*for (int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i=1; i<=5; i++) {
			System.out.print("*");
			
		} */
	
	
	// BEST WAY to do Printed Patterns
		
	/*for (int r=1; r<=4; r++) { //out loop controls rows
		for (int c=1; c<=6; c++) { //inner loop controls colums
			System.out.print("*");
	}
		
		System.out.println();*/

		
		//Another example: Big square
		
		for (int r=1; r<=6; r++) { 
			for (int c=1; c<=12; c++) {
				System.out.print("*");
		}
			
			System.out.println();
			
			//Another example: Square with numbers
			
			for (int row=1; row<=6; row++) {
				for (int col=1; col<2; col++) {
					System.out.print("12345");
				}System.out.println();
			}
			

			//Another example: Square with numbers adding 678
			
			
			for (int row=1; row<=7; row++) {
				for (int col=1; col<8; col++) {
					System.out.print("12345");
				}System.out.println();
			}
			
			//Another example

			for (int row=7; row>=1; row--) {
				for (int col=1; col<6; col++) {
					System.out.println("777777");
					System.out.println("666666");
					System.out.println("555555");
					System.out.println("333333");
					System.out.println("222222");
					System.out.println("111111");
				}System.out.println();
			}
			
			
}
}
}
