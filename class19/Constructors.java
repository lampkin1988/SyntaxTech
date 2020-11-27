package com.syntax.class19;

public class Constructors {

	
		int number;
		String name;
		char character;
		
		Constructors() {
			System.out.println("I will be called everytime you create an object of this class");
		}
		
		Constructors (int numberValue, String nameValue, char characterValue) {
			System.out.println("I am not a useless constuctor, I am initilizing your fields");
			
			number=numberValue;
			name=nameValue;
			character = characterValue;
		}
		
			void print () {
		System.out.println("Number " + number + " name" + name + "character " + character); 
			
		}

		public static void main(String[] args) {
			Constructors constructors = new Constructors();
			Constructors constructors2 = new Constructors(/*numberValue:*/ 100, /*nameValue:*/"Vlad", /*characterValue:*/'A');
			//constructors.print();
			
			
			
			
			
			
			
			//constructors.character='A';
			
			
			//Constructors: name of the variable
			//equal sign (=): assignment 
			//new: by specifying new, we are letting Java know that we want an new object
			//Constructors(): 
			
			
			int num;
			System.out.println(num);
				
	}

}
