package com.syntax.class18;

public class Notes {

	public static void main(String[] args) {
		
		//1. Local
		//2. Instance variables
		//3. Static variables 
		
		//Local Variables: Any variable that is declared inside a method or a block like while loop, for loop, if condiion 
		//or inside the constructor are called local variables. 
		
		//Properties of local variables. 
		//1.We can't access them out side of the block. For example: 
		
		/*if (2>1) {
			int x = 10 // this variable will not be accessible outside of the 
			curly brackets of the if condition. 
		}*/
		
		/*x=20 CE
		 *2)As soon as we are done with method, these local variables are destroyed and memory (RAM), is freed and is availible to be used by other programs which means they are very efficient 
		 *in managing the memory an that's why they are always recommended over instance variables
		
		Instance variables:
		All of the variables, which are declared outside of the methods blocks or constructors; 
		but inside a class are called instance variables.*/
		
		//properties:
	//1.memory is allocated inside RAM as soon as object of that class is created and it says in the memory unless we are done with the closing bracket.
//2. They are highly discouraged because they are not efficient in handling memory.
		
		
		//Static Variables:
		
		//They are declared outside of the methods, constructor and blocks of code with static keyword
	
	
	//Access modifiers:
		//Access modifiers are just keyboard (private public protected that help use reduce the visibility of our variables and methods
		//So that no one else from other classes or packages can modify our data. 
		
		//private:
		//if we use private access modifier with our variable or method we can only access that variable from the same class. 
		//wee use it to protect critical information that we do not what expose/share.
		/*
		class account {
		private int balance;
		
		//void depositeMoney() {
		 * if(boolean properChannel, int money) {
		 * 
			balance=balance+money
			}
			}
			}
			
			class hacker {
			balance=100000;//CE Cannot access
		*/
	
		
		//default:
		//This is not a keyword, this is a behavior which is assigned to the methods or properties automatically if we are not assigning any access modifier. 
	
	/*Package1
	 * class {
	 * String car;
	 * }
	 * 
	 * Package2
	 * class family {
	 * care="I"m you're little brother, I'm using your car and if I destroy it; oh well"
	 * }
	 * 
	 * 
	 * If we do specify any modifiers default behavior will be assigned to our variables and methods and they will only be available within the same package.
	 * 
	 * Public:
	 * If we declare our methods or instance variables we can access them from anywhere any packages any class.
	
	Package1
	 * class {
	 * Public String car;
	 * }
	 * 
	 * Package2
	 * class family {
	 * care="I"m you're little brother, I'm using your car and if I destroy it; oh well"
	 * }
	
	
	
	*/
	}

}
