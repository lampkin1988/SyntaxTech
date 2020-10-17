import java.util.Scanner;

public class ReviewClass2 {
	
	
	///If Else Conditions 
	
	
	//Example 1

	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		System.out.println("Please enter your gender");
		char gender = userIn.next().charAt(0);
		System.out.println("Please enter your age");
		int age = userIn.nextInt();
		if (gender == 'M') {
			if (age >25 ) {
				System.out.println("Man");
			} else {
				System.out.println("Boy");
			
				if (gender == 'F') {
				if (age > 25) {
					System.out.println("Woman");
				}else {
					System.out.println("Girl");
				}
				}
			}
		}
	}

}
//Example 2


int a=-1;
	System.out.println("This will be printed always");

	if (a>0) {
		System.out.println("Number is greater than zero");
	}
	System.out.println("Line after if condition");
	
	if (a>0) {
		System.out.println("Number is greater than zero");
	} else {
		System.out.println("Number is greater less than zero");
	}
	System.out.println("This will always be printed");
}
}



//Example 3



int a = 0;
System.out.println("This will always be printed");

if (a>0) {
	System.out.println("Number us greater than zero");
}else if(a<0) {
	System.out.println("Number is greater than zero");
}else {
	System.out.println("Number is zero");
}

System.out.println("This will be printed always");

}
}



////Nested If Conditions

String name="LaShawn";
String pass="pass123";
double accountBalance=10.25;
double transferAmount=8;
boolean transerAllowed=true;
if(pass.equals("pass123")) {
	System.out.println("Welcome to Syntax Bank "+name);
	if(transerAllowed) {
		System.out.println("Initiating tranfer");
		if(transferAmount > accountBalance) {
			System.out.println("Insufficient balance");
		}else {
			System.out.println("Transfer complete");
		}
		
	} else {
		System.out.println("You are not allowed to tranfer");
	}
}else {
	System.out.println("Invalid credentials, please try again");
}
}
}


//Assignment


Scanner scanner = new Scanner(System.in);
System.out.println ("Please enter three distinct numbers");
			int num1 = userIn.nextInt();
			int num2 = userIn.nextInt();
			int num3 = userIn.nextInt();

			
			if(num1>=num2){
				System.out.println("num1>num2 is evaluated to true num1" + num1+"num2 "+num2);
			
			if(num1>=num3) {
				System.out.println("num1>=num3 is evaluted to true");
			}
			System.out.println("The largest number is "+num1);
			
			if (num2>=num1) {
			if(num2>num3) {
			System.out.println("The largest number is "+num1);	
			
			if (num3>=num1) {
			if(num3>num2) {
			System.out.println("The largest number is "+num1);
			
			}
		}
	}
			
			
			
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println ("Please enter three distinct numbers");
			
						int num1 = userIn.nextInt();
						int num2 = userIn.nextInt();
						int num3 = userIn.nextInt();
						
						if (num1>num2) {
							System.out.println("Inside num1 > num2 value of num1 " + " num2 "+num2);
							num1 = num2;
							
						} else {
							System.out.println("Inside the else block "+ num1 +" num2 " +num2);
							num1 = num1;
						}
						if (num1 > num3) {
							System.out.println("largest number is " +num1);
						} else {
							System.out.println("largest number is " +num3);
						}
						}
			}
			
			
			
			
			
			
			
			
			public static void main(String[] args) {
				  Scanner ss = new Scanner(System.in);
				  System.out.println("Please enter month number");
				  int mo=ss.nextInt();
				  if (mo==1) {
				    System.out.println("January");
				  } else if (mo==2) {
					System.out.println("February");
				  }	else if (mo==3) {
					System.out.println("March");
				  }	else if (mo==4) {
					System.out.println("April");
				  }	else if (mo==5) {
					System.out.println("May");
				  }	else if (mo==6) {
					System.out.println("June");
				  }	else if (mo==7) {
					System.out.println("July");
				  }	else if (mo==8) {
					 System.out.println("August");
				  }	else if (mo==9) {
					System.out.println("September");
				  }	else if (mo==10) {
					System.out.println("October");
				  } else if (mo==11) {
					System.out.println("November");
				  }	else if (mo==12) {
					  System.out.println("December");
																										
				   } else {
				    System.out.println("Ivalid");
				  }
				 
				
				}
		}