package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		//shortcut to import: ctr+shift+o  or right-click and choose import
		
		int num=80;
		String str="I am a string";
		
		Scanner scan=new Scanner(System.in);//Enable input to the console
		//I"m adding a message to the user
		
		System.out.println("Please enter any text"); //This will capture any input
		
		String value=scan.nextLine();//Waits for your input. Once you provided the input, hit ENTER button
		System.out.println("I captured value ="+value);
		
		System.out.println("Please enter your name");
		String name=scan.nextLine();
		System.out.println("Nice to meet you ="+name);
	
	}

}
