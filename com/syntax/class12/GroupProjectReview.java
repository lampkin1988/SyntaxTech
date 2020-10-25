package com.syntax.class12;

public class GroupProjectReview {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable? Swap 2
		// strings without a temporary variable?

		int x = 10;
		int y = 20;

		x = y + x; // 30
		y = x - y; // 10
		x = x - y; // 20

		System.out.println("Value of x =" + x);
		System.out.println("Value of x =" + y);
		
		
		// Write a java program to check whether a given number is prime or not?
		
		int num = 4;
		boolean flag = false;
		
		
		if (num >1) {
		for (int i = 2; i <num; i++) {
			//condition for non-prime number
			if (num% i ==0) {
				flag = true;
				break;
			}
		}
	}else {
		flag=true;
	}
		if (!flag)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
			}
	}



//Write a Java Program to print the first 10 numbers of Fibonacci series.

int a=0;
int b=1;
int sum;


for (int i=1; i<=10; i++) {
	System.out.println(a+" ");	
	int sum =a+b;
	a=b;
	b=sum;
}
}
}



//Maximum and minimum number in the array?

int[] myArray = { 900, 66, -1, 65, 32, 876, -900 };

int max = myArray[0];
int min = myArray[0];


for (int i = 1; i < myArray.length; i++) {
	if (myArray[i] > max) {
		max = myArray[i];
	}
	if (myArray[i]< max) {
		min = myArray[i];
	}
}
System.out.println("the largest number in array is :" + max);
System.out.println("the smallest number in array is :" + min);


Arrays.sort(myArray);
System.out.println("Min number = "+myArray[0]);
System.out.println("Max number = " +myArray[0]);



//Maximum and minimum number in the array?

double[] num1 = {1,5,3,6};
int length=num1.length;
Arrays.sort(num1);//1,2,3,5,6,10}
System.out.println("Second highest number is "+num1[length]);





//Write a java program to find the second largest number in the array?


int[] myArray= {66,45,65,900,965,32,876,900};
int max=myArray[0];
int secoundmax=myArray[0];

for(int i=0;i<myArray.length;i++) {
	if(myArray[0]>max) {
		secoundmax=0;
		
	}
	else if(myArray[i]>secoundmax && myArray[i]!=max){
		secoundmax=myArray[i];
		
		}
	
	}

System.out.println("the largest number in array is :"+max);
System.out.println("the 2nd largest number is :"+secoundmax);





//Create a 2D array to store numbers in 3 rows and 3 columns. Print the sum of all numbers.

//initilize & assign values to 2d array:

		double [][] array= {
			{39.0, 78.0, 3.5},
			{10.0 , 57.5 , 80.0},
			{61.5, 33.5 , 90};
		
	// create a variable sum and assign it 0, we'll use that to assign the sums.
	
	double sum=0;
		for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			
			sum+=array[i][j]; // summing the arrays with a loop
			System.out.print(array[i][j]+ " | ");
			if((j+1) %3==0) {
				
			
		}
	}

	System.out.println("\nThe sum of all values on the 2D array is: " + sum);
	
	
	// Create a 2D array to store numbers in 3 rows and 4 columns. Develop a program which will identify/print the even numbers only.

	
	int[][]num= {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
	};
	for(int i=0; i<num.length; i++) {
		for(int j=0; j<num[i].length; j++) {
			if(num[i][j]%2==0)
				System.out.println(num[i][j]);
		}
	}
	
	
}
}
		
		
		// Create a 2D array to store numbers and calculate sum of all odd numbers.
		
		
		
		int [][] number={{1,2,3},
	             {4,5,6},
              	{7,8,9}};
int sum=0;

System.out.println("****2D Array*****");
for(int[] original:number) {
	for (int orig:original) {
		
		if (orig%2!=0) {
			sum+=orig;
		
	}System.out.println("Sum of odd numbers ="+sum);}		

	int sum1=0;
System.out.println("Sum of odd numbers ="+sum);
for (int i=0;i<number.length;i++) {			
	for (int j=0;j<number[i].length;j++) {			
		   	if ((number[i][j]%2)!=0) {
		     sum1=sum+number[i][j];}			
	}

}System.out.println("Sum of all odd numbers "+sum);





//Create an array of countries: north america countries, south america


String [][] countries= {
		{“USA”, “Canada”, “Mexico”, “Cuba”},
		{“Brazil”, “Argentina”, “Colombia”, “Peru”},
		{“Ukraine”, “Italy”,“France”},
		{“Japan”, “Indonesia”, “China”, “India”},
		{“Nigeria”, “Kenya”, “Ethiopia”}
		
};
int total=0;

for(int i=0; i<countries.length; i++) {
	
	total=total+countries[i].length;
	for(int j=0; j<countries[i].length; j++ ) {
		System.out.print(countries[i][j] + “. “);
						
	}
	System.out.println();
}
System.out.println();
System.out.println(“Total number of countries that has been stored is ” + total);

System.out.println();
System.out.println(“--------------different loop--------------“);

int sum=0;
for(String []c:countries) {
	
	sum=sum+c.length;
	
	for(String name:c) {
		System.out.print(name + “. “);
	}
	System.out.println();
}

System.out.println();
System.out.println(“Total number of countries that has been stored is ” + sum);


	}
}

