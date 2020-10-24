package com.syntax.class10;

public class ArraysAnotherWay {

	public static void main(String[] args) {
		
		
		String[] names={"Mike", "Burju", "Jack", "Danilo", "Bryan", "Evgeniya"};
		
		System.out.println(names[3]);
		
		//How to know the amount of element you have in the array.
		
		int size=names.length;
		System.out.println("Size of names array = " +size);
		
		System.out.println(names[names.length-2]);
		
		int a=2;
		
		System.out.println(names[a]);//Jack
		
		a+=2;
		System.out.println(names[a]);//Bryan
		
		for (int i=0; i<names.length; i++) {
			
			System.out.println(names[i]);
		}
		
		System.out.println("----------------------------------");
		
	//for (int i=0; i<=names.length; i++) { we will get an exception because length will be 6. Highiest index we have is 5!
			
			//System.out.println(names[i-1]);
		}
	
	
	for (int i=0; i<=names.length-1; i++) {
		
		System.out.println(names[i]);
	}
	
	
	
	
	
	
	
	
		
		
		/*
		
		//Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).


		String[] names = { "Artem", "Anna", "Timothy", "Denis", "Anatoly" };
		System.out.println(names[0]);
		String[] names1 = new String[5];
		names1[0] = "Artem";
		names1[1] = "Anna";
		names1[2] = "Timothy";
		names1[3] = "Denis";
		names1[4] = "Anatoly";
		
		System.out.println(names1[0]);

		//Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).


		//Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: “Saturday is Java coding Day”.
		
		*/
	}

}
