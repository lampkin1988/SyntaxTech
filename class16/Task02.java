package com.syntax.class16;

public class Task02 {

	public static void main(String[] args) {
		
		//Create a method that will take 2 parameters as a numbers and prints which number is larger.
		
		
		    public static void printLarger(double number1, double number2) {
		        if (number1 > number2) {
		        	System.out.println(number1+ " is larger");
		        } else if (number2>number1) {
		        	System.out.println(number2+ " is larger");        
		    }else {
		    	System.out.println("Numbers are equal");
		}
		
		        
	//Create a method that will take a number and prints whether the number is even or odd.
		
		        //Even numbers 2, 4, 6, 8, 10, etc ... if a number is completely divisable by 2, it is an Even number
		        //If numbers are not divisable by 2, they are treated as Odd numbers. Ex: !, 3, 5, 7 etc.
	    
		        void printNumberEvenorOdd(int number) {
	    	 if (number%2==0) {
	    		 System.out.println("Number is an Even number");
	    	 }else {
	    		 System.out.println("Number is an Odd number");
	    	 }
	     }
	


		//Create a method that will print whether given String is palindrome or not.
		//saShSas
	   
		        public void isStringpalindrome(String string) {
		        	int i=0; 
		        	int j=string.length() -1; 
		        	while(i<j) {
		        		
		        		if(string.charAt(i) !=string.charAt(j)) {
		        			System.out.println("String is not palindrome");
		        			return;
		        		}
		        		i++; //0
		        		j--; //5
		        	}
		        	System.out.println("String is a palindrome");
		        }

		        
		        
		        
		//Create a method that will say Hello in different language based on the country that will passed when method is executed.
	
		    static void sayHello(String countryName){
		    	
		    	switch(countryName) {
		    	case"USA";
		    	break;
		    	System.out.println("Hello");
		    	case"China";
		    	break;
		    	System.out.println("Ni Hao");
		    	case"Turkey";
		    	break;
		    	default:
		    		System.out.println("Country not supported");
		    	}
		    	}
		    
		    
		    
		    
		    }

}
}
