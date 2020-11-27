package com.syntax.class14;

public class EqualsMethod {

	public static void main(String[] args) {
		
		String name="Lamb";
		String name2="Shawn";
		String name3="Ash";
		
		System.out.println(name.equals(name3));
		System.out.println(name.equals(name2));
		System.out.println(name.equals(name));
		
		System.out.println(name==name);
		System.out.println(name3==name3);
		System.out.println(name2==name2);
		
		
		//Intellij
		
		String name= new String (original: "Lamb");
		String name= new String (original: "Shawn");
		String name= new String (original: "Ash");
		
		System.out.println(name.equals(name2));
		System.out.println(name.equals(name3));
		System.out.println(name.equals(name));
		
		System.out.println(name==name2);
		System.out.println(name3==name3);
		System.out.println(name2==name2);
	}

}
