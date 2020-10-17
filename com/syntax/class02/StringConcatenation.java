package com.syntax.class02;

public class StringConcatenation {

	public static void main(String[] args) {
		
		String name="Ashley";
		
		//Making a sentence: My name is Ashley
		
		System.out.println("My name is "+name);
		
		String lastName="Thatcher";
		
		//Printing full name
		
		System.out.println(name+" "+lastName);
		
		
		//City
		
		String city="San Francisco";
		System.out.println(name+ " lives in "+city);
		
		
		//Average grade
		
		char grade='B';
		System.out.println(name+ " is a "+grade+" student");
		
		
		//Age
	
		int age=14;
		System.out.println(name+ " is "+age+" years old");
		
		//attaching/concatenate to any value (char, int, string, double) to a string, use a string concatenation operator
		
		
		//date
		
		int date=27;
		String month="September";
		System.out.println(date+" "+month);
		
		
		//above Strings are not equal; b/c state has 2 characters
		//anotherState has 3 characters
		
		String state="DC";
		String anotherState=" DC"; 
		System.out.println(state);
		System.out.println(anotherState);
		
		
		

				
	}

}
