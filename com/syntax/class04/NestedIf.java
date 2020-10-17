package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		/*Variable for allergy: yes or no
		 * 
		 * if allergy is yes --> will check for pet, peanut, and pollen allergy
		 * 
		 * if no allergy, you are lucky!
		 */
		
		
		boolean allergy=true;
		boolean petAllergy=false;
		
				
				if (allergy) { //true
					
					System.out.println("Let's do further check");
					if (petAllergy) {
						System.out.println("Please no home pets!");
					}else {
						System.out.println("That's good you do not have pet allergy!");
					}
					
					
				} else {
					System.out.println("You are lucky!");
				}
					
					
					// example 2
					System.out.println("_______");
					
					/*
					 * If it's friday, we will watch movie; but will check the date
					 * If date is the 13th, we will watch scary movie
					 * If it's not the 13th, we will watch comedy, action, etc
					 * 
					 * If it's not Friday, then we will study
					 */
						
						boolean isFriday=true;
						int date=14;
						boolean monday=true;
						
						
						if (isFriday) {
							
							if(date==13) {
								System.out.println("I will watch scary movie");
							}else {
								System.out.println("I will watch PK movie with Amir Khan");
							}
							
						}else {
							
							if(monday) {
								System.out.println("On Monday, I am working");
							}else {
								System.out.println("I have class at Syntax");
							}
						}
						
						
						System.out.println("__________");
						
						/* Check if assignment is completed
						 * If assignment is completed: grades will be checked 
						 * Score >90 : Great job!
						 * Score > 80 : Good job!
						 * Score > 70 : Please study more! 
						 */
						
						int score=65;
						boolean assignment=false;
								
								if(assignment) {
									
									if (score>90) {
										System.out.println("You did great!");
									} else if (score>80) {
										System.out.println("You did good!");
									} else if (score>70) {
										System.out.println("You need to study more!");
									} else {
										System.out.println("Good job for trying, but you must study!");
									}
									
								}else {
									System.out.println("You need to complete assignment(s)");
								}
								

			
				}

			}
