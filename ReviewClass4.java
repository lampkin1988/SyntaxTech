import java.util.Arrays;
import java.util.Scanner;

public class ReviewClass4 {

	public static void main(String[] args) {
		
		int num=0;
		
		/*System.out.println(num);
		num=num+1;
		System.out.println(num);
		num+=1;
		System.out.println(num);
		num++;
		System.out.println(num);*/
		
		/*num=0;
		System.out.println(num);
		num=num*1;
		System.out.println(num);
		num*=1;
		System.out.println(num);
		num++;
		System.out.println(num);*/
		
		
		//SIMPLE WHILE LOOPS
		
		/*int var=0;
		while (var<=11) {
			System.out.println("Value of var "+var);
			var++;		
	}
		
		var= 10;
		while (var >0) {
			System.out.println("Value of var "+var);
			var--;	*/
			
			
			//WHILE LOOP WITH SWITCH
		
		package reviewclass4;
		import java.util.Scanner;
		public class WhileLoopWithSwitch {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				double num1;
				double num2;
				char operation;
				double results;
				boolean continueLoop=true;
				String end;
				
				while(continueLoop) {
				System.out.println("Please Enter two numbers");
				Scanner scanner = new Scanner(System.in);
				num1 = scanner.nextDouble();
				num2 = scanner.nextDouble();
				System.out.println("Please Enter the operation + - * /");
				operation = scanner.next().charAt(0);
				switch (operation) {
				case '+':
					results = num1 + num2;
					break;
				case '-':
					results = num1 - num2;
					break;
				case '*':
					results = num1 * num2;
					break;
				case '/':
					results = num1 / num2;
					break;
				default:
					results = 0;
				}
				System.out.println("Results are " + results);
				System.out.print("Enter Yes to perform more operations and No to terminate the program");
				end=scanner.next();
				if("No".equals(end)) {
					continueLoop=false;
					
					
					
					for (int i=1; i<=4; i++) {
						
						for (int j=1; j<=4; j++) {
							if (i==1 || i==4 || j==1 || j==4) {
							System.out.println("$");
						} else {
						System.out.println(" ");
					}
						}
						System.out.println("$");
						
					}
					
					System.out.println();
				}
					
					
					// EQUALS METHOD:
					
					String name=null;
					if("Emine".equals(name)) {
						System.out.println("Hi Emine");
					}
				}
				
				//For Loops
				
				int sum=0;
				for (int i=0; i<11; i++) {
					System.out.println("Sum till "+i+" "+(sum=sum+i));
				}
				
				sum=0;
				for (int i= 10; i >= 0; i--) {
					System.out.println("Sum till "+i+" "+(sum=sum+i));
				}
				
				
				//Nested for loops
				
				
				for (int i=0; i<2; i++) {
					System.out.println("I am the outer for loop");
					for (int j=0; j<2; j++) {
						System.out.println("I am the first inner for loop");
						
						for (int k=0; k<2; k++) {
							System.out.println("I am the second inner for loop");
				}
				
				}
				}
				
				//Arrays
				
				String name1="Julia";
				String name1="Jon";
				String name1="Davit";
				String name1="Aladin";
				String name1="Evengiya";
				String[] name= new String[5];
				name[0]="Julia";
				name[1]="Jon";
				name[2]="Davit";
				name[3]="Aladin";
				name[4]="Evengiya";
				System.out.println();
			}
		}
		
	



