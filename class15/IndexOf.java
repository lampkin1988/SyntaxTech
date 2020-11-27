package com.syntax.class15;

public class IndexOf {

	public static void main(String[] args) {
		
		//Will give a -1 if letter is not present in name
		
		String name="Mohammad";
		System.out.println(name.indexOf('m'));
		System.out.println(name.indexOf('d'));
		System.out.println(name.indexOf('M'));
		System.out.println(name.indexOf('z'));
	}

}
