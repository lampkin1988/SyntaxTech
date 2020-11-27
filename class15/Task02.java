package com.syntax.class15;

public class Task02 {

	public static void main(String[] args) {
		
//Create a String that will hold a sentence. Write a program to get a new String without any spaces.

		
	String sentence = "This is too easy!";	
		System.out.println(sentence.replaceAll(regex: "" , replacement:""));
		
		
//Create a String that should be combination of letters, numbers and special characters. Find out how many alpha characters are there in the String

	String a1 = "a 1 b 2 c 3 d 4  % # ";
	System.out.println("Count");
	System.out.println(a1.replaceAll(regex: "[^0-9]", replacement: " ")length());
	
//You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” How would you find out how many sentences are in that String

	String sen = "Is it Saturday ...";
	System.out.println();
	System.out.println(sen.replaceAll (regex: "[\\r));
	
	
		
		//task 1
        String sentence = "String that holds sentence";
        System.out.println(sentence.replaceAll("[^A-Za-z]", ""));
        //task 2
        String mix = "OJSw-3859$%8gfve0 injwrf3#%4UERFcE3R2%$*@";
        String newMix = mix.replaceAll("[^A-Z]", "");
        System.out.println("Alpha characters amount: "+ newMix.length());
        //task 3
        String a = "Is it saturday? Is it rainig? Dow we have a Java Class today?";
        String b = a.replaceAll("[A-Z a-z]","");
        System.out.println("Amount of sentences: "+b.length());	
		
		
	}

}
