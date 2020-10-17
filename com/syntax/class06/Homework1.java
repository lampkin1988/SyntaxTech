package com.syntax.class06;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		 
			    
			   {
			      int  score;    
			      char grade;   

			      Scanner console = new Scanner(System.in);


			      System.out.print("Please enter your mark ");
			      score = console.nextInt();


			      int avg;
				if (score >= 80)
			      {
			         grade = 'A';
			      }
			      else if (avg>=60 && avg<80)
			      {
			         grade = 'B';
			      }
			      else if (avg>=50 && avg<60)
			      {
			         grade = 'C';
			      }
			      else if (avg>=45 && avg<50)
			      {
			         grade = 'D';
			      }
			      else if (avg>=25 && avg<45)
			      {
			         grade = 'E';
			      }
			     else if (avg>=1 && avg<25)
			      {
			         grade = 'F';
			      }

			      
			      System.out.println("Your grade is " + grade);
			   }
			   }

	}

}
}
