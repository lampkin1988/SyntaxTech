package com.syntax.class12;

public class ForVsEnhancedFor {

	public static void main(String[] args) {

		int[] num = { 10, 20, 30, 10 };//num.length=4
		
		for (int i=num.length-1; i>=0; i--) {
			System.out.println(num [i]+" ");
		}
		
		//We cannot loop backward while using enhanched for loop.
		//It starts from the beginning of the loop and stops at the end

	}

}
