import java.util.Scanner;

public class ReviewClass1 {

	public static void main(String[] args) {
	 
	 int number1=10;
	 int number2=20;
	 int result=number1+number2;
	 
	 System.out.println(number1 + number2);
	 String stringNumber1= "10";
	 String stringNumber2= "20";
	 System.out.println(stringNumber1 + stringNumber2);
	 String name="syntax";
	 
	 //number of data types
	 //numeric data types
	 /*we have 6 numeric data types: byte, short, int, long, float, double. */
// most common data types: String, int, double
	 	//non-primitive types start with capital letter
	 
	 Float floatNumber=1010101000000f;
	 System.out.println(floatNumber);
	 
	 double doubleNumber=1010;
	 System.out.println(doubleNumber);
	
	
	char charVar='C';
	System.out.println(charVar);
	
	boolean boolVar=true;
	System.out.println(boolVar);
	System.out.println(10+20);
	
	double bonus=0.8;
	int employee1Salary=10200000;
	int employee2Salary=13000000;
	int employee3Salary=14000000;
	int employee4Salary=15000000;
	double bonusForEmployee1=employee1Salary*bonus;
	double bonusForEmployee2=employee2Salary*bonus;
	double bonusForEmployee3=employee3Salary*bonus;
	double bonusForEmployee4=employee4Salary*bonus;
	System.out.println(bonusForEmployee1);
	System.out.println(bonusForEmployee2);
	System.out.println(bonusForEmployee3);
	System.out.println(bonusForEmployee4);
	
	
	
	
	
	
	//facebook
	
	/*String firstName="Michael";
	String surName="Proctor";
	String mobileOrmail="mproc@yahoo.com";
	String password="password";
	int dayOfMonth=01;
	int monthOfYear=1;
	int year=1995;
	char genderM='M';
	char genderF='F';*/
	
	
	//Casting
	
	/*char charVar1='A';
	byte byteVar=10;
	short shortVar=100;
	int intVar=1000;
	long longVar=10000;
	float floatVar=100000;
	double doubleVar=1000000;
	shortVar=byteVar;
	System.out.println(shortVar);
	intVar=charVar;
	System.out.println(intVar);
	System.out.println(doubleVar);
	
	floatVar=(float) doubleVar;
	System.out.println(doubleVar);
	byteVar=(byte)shortVar;
	System.out.println(byteVar);
	
	byte newVar=100;
	short newShortVar= (short) (newVar+10);
			
	int newIntVar=100;
	long newLongVar=1000000;
	float floatVar=145.02F;
	
	
	//Scanner
	
	/*String name1;//declaring variable
	Scanner scanner=new Scanner(System.in); //capture input from keyboard
	System.out.println("Please enter your name");
	name1 = scanner.nextInt(); // this line waits for input from keyboard
	System.out.println("Hi " +name1);*/
	
	
	/*int age;//declaring variable
	Scanner scanner=new Scanner(System.in); //capture input from keyboard
	System.out.println("Please enter your age");
	age = scanner.nextInt();
	if(age<=18) {
		System.out.println("You should study");
	}else {
		System.out.println("You should work");
	}*/
	
	
	
	String name2;
	int age;
	Scanner scanner=new Scanner(System.in); 
	System.out.println("Please enter your Name");
	name=scanner.nextLine();
	System.out.println("please enter your age");
	age=scanner.nextInt();
	System.out.println("Hi " +name+ " you are " +age+ " years old");
	
	
	}

}
	
