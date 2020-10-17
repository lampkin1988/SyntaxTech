package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		double d=12/7; //widening (2.0)
		System.out.println(d);
		
		double e=9;
		System.out.println(e); //widening (9.0)
			
		
		//int num=9.89; error
		
		
		int i=(int)9.99;
		System.out.println(i); //narrowing with non-primitives  (9)
		
		byte b=(byte)130; //narrowing  (whatever value ...)
		System.out.println(b);

	}

}
