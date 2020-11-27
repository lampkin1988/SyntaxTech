package com.syntax.class19;

public class Task01 {


		
		
		//Create a method that will accept an array as parameters and will return a sum of all elements from that array. Method should be visibly only within same package and accessible by the creating an instance of the class. 
		
		
		
			//double sumArray(double [] array){
				
				/*double sum = 0;
				for (int i=0; i<array.length-1; i++) {
					sum=sum+array[i];
				}
					return sum;*/
				
				
					
					/*double sumArray(double [] array){ // intellij
						
						double sum = 0;
						for (double v : array) {
							sum+=v;
						}
							return sum;*/
					
					
					
				}
			
		
		
		//Create a method that will take a String as a parameter and returns reversed String. Method should be available to all classes within your project and accessible by class name.
				
		
			/*public static String reverseString(String string) {
				StringBuilder stringBuilder=new StringBuilder(string);
				stringBuilder.reverse();
				return stringBuilder.reverse().toString();*/
			
			
		
		
		//Create a method that will accept a String as a parameter and return a new String that consist only of vowels. Method should be available inside the class only where it was declared and executed by calling it is name.

	
	private String vowelsOnly(String name) {
		return name.replaceAll("[^AEIOUaeiou]", " ");		
}
	
	public void main (String [] args) {
		System.out.println(vowelsOnly(vowelsOnly("All the vowels will be removed"));

}
	}
