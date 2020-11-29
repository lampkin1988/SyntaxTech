package com.syntax.class30;

import java.util.Arrays;

public class ArrayIssues {
	
	public static void main(String[] args) {
		String name="Ali"; 
		String name1="Nabin";
		String name2="Qasim";
		
		//variables can hold one value at a time if we need to store values, we need to declare 1000 variables
		
		int initialSize=3;
		int elementsStored;
		
		String [] names= new String[3];
		names[0] ="Ali";
		elementsStored++;
		names[1]="Nabin";
		elementsStored++;
		names[2]="Qasim";
		elementsStored++;
		
		System.out.println(names.length);
		System.out.println(Arrays.toString(names));
		
		
		//names[3]="Davit";  Array index is out of bound, as the size of the array was 33
		//we can't store more than 3 elements
		
		//Arrays are fixed in size, we have to provide the size of the array in advance, before we can use it.
		
		System.out.println(Arrays.toString(names));
		
		if(names.length>=elementsStored++) {
			
			public static String[] expandArray(String [] oldArray){
				
			
			String[] newArray= new String[oldArray.length*2];
			newArray[0]=names[0];
			newArray[1]=names[1];
			newArray[2]=names[2];
			newArray[3]="Danilo";
			
			return newArray;
			
		}
		
		
	}
	
	
		
	}
 
}
