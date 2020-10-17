package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		
		
	}
		
	int time = 15;
	
	if (time > 12 ) { // condition is true
		System.out.println("good day"); // code executes 1 time
		
	}
		
		System.out.println("_____While Loop____");
		
		
		while (time > 12) {
			System.out.println("good day"); //infinite loop
			*/
		
		  /* while (time > 12) {
			System.out.println("good day"); //3
			time --;
			
			while (time > 12) {
				System.out.println("good day"); //how many times? Infinite loop
				time ++; */
				
				
				 while (time > 12) {
						System.out.println("good day"); //3
						time --;	
	}
				 
				 //I want to print numbers from 1 to 50
				 
				 
				 System.out.println("Printing numbers 1 to 50 -------");
				 
				 int num= 1;
				  while (num<50) {
					  System.out.println(num); 
					  num++;
				  }
				  
				  
				  //I want to print numbers 10 to 60
				  
				  System.out.println("Printing numbers 10 to 60 ----------");
				  
				  int a=10;
				  while (a<61) { //or a<=60
					  System.out.println("a"); //adding space ("a ");
					  a++;
					  
				  }
				  
				  
				  //I want to print number 100 to 60
				  System.out.println("Printing number 100 to 60 -------");
				  
				  int b=100;
				  
				  while (b>=60) {
					  System.out.println(b); //adding space (b+" ")
					  b--; //increment 
					  
					  
					  
					//I want to print number 10 to 30
					  System.out.println("Printing number 10 to 30, ONLY EVEN NUMBERS -------");
					  
					  int c=10;
					  
					  while (c<31) {
						  
						  if (c%2==0) {
					  
						  System.out.println(c); //adding space (b+" ")
						  b--; //increment 
						  
						  }
						  
						  c++;
				  }
				  
				System.out.println("----Another Way------"); 
				
				int d=10;
				
				while (d<=30) {
					System.out.println(d+" ");
					d+=2;
				}
				 
				
				
				
				
				
				
				/////ANOTHER WAY
				
				
				  int c=10;
				  
				  while (c<31) {
					  
					  System.out.println("I am inide while loop");
					  
					  if (c%2==0) {
				  
					  System.out.println(c+ " "); //adding space (c+" ");
			  /// c++: If we keep increment here, then we will get infinite loop
					  
					  }		
					  c++; /// increment should be here
}

				  System.out.println("End of the code");
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  //print number from 100 to 1, ODD NUMBERS ONLY
				  
				  int e = 99;
				  
				  while (c>1) {
					  
					  System.out.println("I am inside while loop");
					  
					  if (e > 0) {
						  
						  System.out.println(e); //adding space (e+" ")
						  e-=2; //increment 
						  
						  }
						  
						  System.out.println("Another Way");
						  
						  int f =100;
						  
						  while (f > 0)  {
							  
							  if ((f % 2) != 0) {
								  System.out.println(f + " ");
							  }
							  
							  f--;
						  }
						  
						  
						  
						  
						  String day= "Saturday";
						  
						  if (day.equals("Saturday")) {
							  System.out.println("My favorite Java class"); //print 1 time
						  }
						  
						  while(day.equals("Saturday")) {
							  System.out.println("My favorite Java class"); //print infinite
							  day="Sunday";
						  }
						  
						  
						  
						  
						  System.out.println("______________");
						  boolean isItBreakTime=true;
						  
						  if(isItBreakTime) {
							  System.out.println("I will get tea");
						  }
						  
						  while(isItBreakTime) {
							  System.out.println("I will get tea");//infinite
							  isItBreakTime=false;
						  }
							  
							  
						  }
					  
				  }
				  
	}
}






