import java.util.Scanner;

public class ReviewClass3 {

	public static void main(String[] args) {
		
		//Logical Operators
		
		/*String day="Sunday";
		if(day.equalsIgnoreCase("Sunday")) { //To accept both lower/upper case; use equalsIgnoreCase
		System.out.println("Relax, it's Sunday");
		
		} else if (day.equalsIgnoreCase("Saturday")) {
			System.out.println("Relax, it's Saturday");
			
		} else {
			System.out.println("Go to work");
			
		}
		
		if (day.equalsIgnoreCase("Sunday") || day.equalsIgnoreCase("Saturday")) {
			System.out.println("Relax, it's the weekend);
			
			} else {
			system.out.println ("Go to work");
			
			}
			

	}*/
	
	
	
	//Logical And
	
/*	int number=0;
	
	if (number>=0) {
		if (number<=100) {
			System.out.println("Number is between 0 and 100");
		} else {
			System.out.println("Number is not between 0 and 100");
		}
	} else {
		System.out.println("Number is not between 0 and 100");
	}
	
	if (number>=0 && number<=100);
	System.out.println("Number is between 0 and 100");
	
	}
	
} */


//Nested If
		
		/* String pass;
		double accountBalance = 1000;
		Scanner scan = new Scanner(System.in);
		double transferAmount = 500;
		System.out.println("Welcome to Syntax Bank! Please enter your password.");
		pass = scan.nextLine();

		if ("password123".equals(pass) || pass.equals("password123")) {
			System.out.println("Please enter the amount that you want to transfer");
			transferAmount=scan.nextDouble ();
			if (transferAmount>accountBalance) {
				System.out.println("Not enough funds");
			} else {
				System.out.println("Transferred remaining balance " + (accountBalance - transferAmount));
			}
					
		} else {
			System.out.println("Sorry try again invalid credentials");
		}
	}
	
	*/
		
		//Not Operator
		
		
		/*boolean isRaining = false;
		if (!isRaining) {
			System.out.println("I will go outside");
		} else {
			System.out.println("I will stay home");
		}
		
		int num1=10; 
		int num2=0;
		if (num2!=0) {
			System.out.println(num1/num2);
		}
		}*/
		
		//Switch
		
		/*Homework: Using Scanner class, create a calculator.
		 * Allow user to enter 2 numbers and operators (+,-.*,/)
		 * Based on operator, provide the result to user*/
		
		int num1;
		int num2;
		char operation;
		int results = 0;
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println("Please eneter the operation + - / *");
		operation=scan.nextLine().charAt(0);
		System.out.println("My computer didn't wait for my input");
		
		if (operation =='+') {
			results=num1+num2;	
		} else if (operation =='-') {
			results=num1+num2;
		} else if (operation =='*') {
			results=num1+num2;
		} else if (operation =='/') {
			results=num1+num2;
		} else {
			System.out.println("Invalid operation");
		}
		
		System.out.println(results);
		}
		
		switch(operation) {
		case '+':
		results = num1 + num2;
		break;
				case '-':
				results = num1 - num2;
				break;
					case '/':
					results = num1 / num2;
					break;
						case '*':
						results = num1 * num2;
						break;
							default:
								System.out.println("Invalid operation");
				
			}
						System.out.println(results);
						
						double marks=100;
						if (marks>90 && marks<=100) {
							System.out.println("A");
}
				
	
				
			
		
					
	
	
