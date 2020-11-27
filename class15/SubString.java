package com.syntax.class15;

public class SubString {

	public static void main(String[] args) {
		
		//First 5 characters(including spaces) will be ignored
		//inputing 0 will ignore nothing
		
		String name="Can u write the second m too?";
		System.out.println(name.substring(5));
		
		System.out.println(name.substring(5,10)); //Will be ignored
		System.out.println(name.substring(6,11)+" "+name.substring(16,22));
	}

}
