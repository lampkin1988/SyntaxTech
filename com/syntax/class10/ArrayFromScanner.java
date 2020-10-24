package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		//Ask user how many names it would like to store.
		//Then store those names.
		
		Scanner scan; 
		String[] names;
		int size;
		
		scan = new Scanner(System.in);
		System.out.println("How many names would you like to store");
		size=scan.nextInt();
		
		names=new String[size];
		//We are storing values into an array
		for (int i=0; i<size; i++) {
			System.out.println("Please enter any name");
			scan.nextLine();
			names[i]=scan.nextLine();
		}
		//We are retrieving values from an array
		for (int i=0; i<names.length; i++) {
			System.out.print(names[i] +" ");
		}
		

	}

}
