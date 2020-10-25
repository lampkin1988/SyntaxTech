package com.syntax.class11;

public class TwoDimensionalArrayDemo {
	
	//new char [how many rows] [how many columns];

	public static void main(String[] args) {
		
		char [][] $array=new char[3][4];
		
		//Add values to first row
		//You can use a $ or _
		
		$array[0][0]='A';
		$array[0][1]='B';
		$array[0][2]='C';
		$array[0][3]='D';
		
		//Second row
		
		$array[1][0]='W';
		$array[1][1]='X';
		$array[1][2]='Y';
		$array[1][3]='Z';
		
		//Third row
		
		$array[2][0]='Q';
		$array[2][1]='W';
		$array[2][2]='E';
		$array[2][3]='R';
		
		
		System.out.println($array[1][3]); //Print the value of Z
		
		
		
		
		
		System.out.println("----Another Way-----");
		
		
		int [] [] array= {
				
				{10, 20, 30},
				{1, 2, 3},
				{100, 200, 300}
									};

		System.out.println(array[2] [1]); // Print the value of 200
		
		System.out.println(array[0][1]); // Print the value of 10
		
		System.out.println("The size of array of integers = "+array.length);
	}

}
