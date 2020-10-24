package com.syntax.class10;

public class AllValuesFromArray {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. Print all values from the array.
		
		String[] cars = {"Toyota", "Jeep", "Ford", "Mercedes", "BMW", "Tesla"};
		
       for (int a = 0; a<cars.length; a++) {
    	   System.out.print(cars[a] + " ");
        }
       
       System.out.println();
       
       System.out.println("Getting values from Array, using enhanced for loop");
       
       //for (: name of the array

       for (String car:cars) {
    	   System.out.println(car +" ");
    	   
       }
       
       //Another example
       
       
       int[] numbers= {10,10,90,600,89};
       
       for (int num :numbers) {
    	   System.out.println(num);
       }
       
       
       //Another example
       
       boolean [] arrayOfBoolean = {true, true, false, true};
       
       for (boolean boo:arrayOfBoolean) {
    	   System.out.println(boo);
       }
       
	}

}
