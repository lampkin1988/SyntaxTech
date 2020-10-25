package com.syntax.class11;

public class Task {

	public static void main(String[] args) {
		
		
		// 2D Array
		
		
		//Create an array of cars : american, german, korean, italian. And print all values from a 2D array
		
	
				
				String[][] cars= {
						{"Jeep", "Ford", "Dodge"},
						{"Audi", "Porsche", "BMW"},
						{"Kia", "Hyundai", "Hyundai sonata"},
						{"Ferrari", "Maserati", "Lamborghini"},
				};
					
				for (int i=0; i<cars.length; i++) {
					for(int j=0; a<cars[i].length; j++) {
						
						String car = cars[i][j];
						
						System.out.println(car+"    ");
					}
					
					System.out.println();
				}
				
				System.out.println("-------------------------------------------");
				
				
				
				String[][] carArray= {
						{"Jeep", "Ford", "Dodge"},
						{"Audi", "Porsche", "BMW"},
						{"Kia", "Hyundai", "Hyundai sonata"},
						{"Ferrari", "Maserati", "Lamborghini"},
				};
					
				
				for(String[] carArray:cars) {
					
					for (String car:carArray) {
						
						System.out.println(car+"   ");
					}
		
					System.out.println();
		
		
		
		
		/*Create a 2D array where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		After storing values print the following:
		Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.*/
		

	     /* String[][] names = {
	                {"Mr. ", "Mrs. ", "Ms. ", "Miss "},
	                {"Smith", "Obama", "Jackson", "Jordon"}
	            };
	            
	      System.out.println(names[0][1] +
	                names[1][0]);
	      
	      System.out.println(names[0][0] +
	                names[1][1]);
	      
	      System.out.println(names[0][2] +
	                names[1][2]);
	      
	      System.out.println(names[0][3] +
	                names[1][3]);
	        }   */

	
	}
}


