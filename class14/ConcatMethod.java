package com.syntax.class14;

public class ConcatMethod {

	public static void main(String[] args) {
		String firstName="Migo";
		String lastName="Micale";
		String name="Migo Micale";
		//String name2=null;
		String completeName=firstName.concat(lastName);
		System.out.println(completeName);
		System.out.println(firstName+lastName+name);

	}

}
