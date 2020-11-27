package com.syntax.class14;

public class LengthMethod {

	public static void main(String[] args) {
		
		String name="Shawn";
		System.out.println(name.length());
		name="";
		System.out.println(name.length());
		name="Lamp Shawn";
		System.out.println(name.length());
		name="  Shawn  ";
		System.out.println(name.length());
		
		if(name.length()>10) {
			System.out.println("You are great");
		}
	}

}
