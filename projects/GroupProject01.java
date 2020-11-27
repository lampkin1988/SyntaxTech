package com.syntax.group.projects;

public class GroupProject01 {

	public static void main(String[] args) {
		
		/*

		// Write a program to swap 2 numbers without a temporary variable? Swap 2
		// strings without a temporary variable?
		 * 

		String[][] sArray = { { "Ocean", "Lake", "Sea", }, { "Town", "Village", "Country", },
				{ "Horse", "Bear", "Whale", }, };
		System.out.println("Tables before swaps:");
		System.out.println();
		int[][] iArray = { { 54, 127, 9500, }, { -27000, 1444, 8, }, { 34634, -62356, 0, }, };
		// Printing original numbers table
		for (int aiArray[] : iArray) {
			for (int biArray : aiArray) {
				System.out.print(biArray + " ");
			}
			System.out.println();
		}
		System.out.println();
		// Printing original strings table
		for (String asArray[] : sArray) {
			for (String bsArray : asArray) {
				System.out.print(bsArray + " ");
			}
			System.out.println();
		}
		iArray[0][0] = iArray[0][0] + iArray[2][1];
		iArray[2][1] = iArray[0][0] - iArray[2][1];
		iArray[0][0] = iArray[0][0] - iArray[2][1];
		System.out.println("________________________________________________");
		System.out.println("Tables after swaps:");
		System.out.println("");
		// Printing numbers table after swapping
		for (int line[] : iArray) {
			for (int num : line) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		System.out.println();
		sArray[0][1] = sArray[0][1] + sArray[2][1];
		sArray[2][1] = sArray[0][1].substring(0, sArray[0][1].length() - sArray[2][1].length());
		sArray[0][1] = sArray[0][1].substring(sArray[2][1].length());
		// Printing strings table after swapping
		for (String strLine[] : sArray) {
			for (String word : strLine) {
				System.out.print(word + " ");
			}
			System.out.println();
		}
	}




	// Write a java program to check whether a given number is prime or not?
	 

	int i, k = 0, num = 0;
	int j = 3;k=j/2;if(j==0||j==1)
	{
		System.out.println(j + " is not a prime number.");
	}else
	{
		for (i = 2; i <= k; i++) {
			if (j % i == 0) {
				System.out.println(j + " is not a prime number.");
				num = 1;
				break;
			}
		}
		if (num == 0) {
			System.out.println(j + " is a prime number.");
		}
	}}
	
	
	
	

	// Write a Java Program to print the first 10 numbers of Fibonacci series.

	int numberLimit = 10;
long[] seriesOfNumbers = new long[numberLimit];seriesOfNumbers[0]=0;seriesOfNumbers[1]=1;for(
	int i = 2;i<numberLimit;i++)
	{
		seriesOfNumbers[i] = seriesOfNumbers[i - 1] + seriesOfNumbers[i - 2];
	}System.out.println("The first "+numberLimit+" numbers of the Fibonacci Sequence:");for(
	int i = 0;i<numberLimit;i++)
	{
		System.out.print(seriesOfNumbers[i] + " ");
	}}
	
	
	
	
	

	// Maximum and minimum number in the array?

	int maximumArray[] = { 8, 11, 12, 13, 1, 25, 62, 34, 54, 100, 76, 87, 10, 54 };
	int minimum = maximumArray[0];
int maximum = maximumArray[0];for(
	int i = 0;i<13;i++)
	{

		if (maximumArray[i] < minimum)
			minimum = maximumArray[i];
		if (maximumArray[i] > maximum)
			maximum = maximumArray[i];

	}System.out.println(“
	The mininum
	value in
	the Array is:“+minimum);System.out.println(“
	The maximum
	value in
	the Array is:“+maximum);}}




	// Write a java program to find the second largest number in the array?

	int largest = 0;
	int secondLargest = 0;
int[] array = { 10, 1000, 20, 8, -1, 80, 20, 56, };for(
	int i = 0;i<array.length;i++)
	{
		if (array[i] > largest) {
			secondLargest = largest;
			largest = array[i];
		} else if (array[i] > secondLargest) {
			secondLargest = array[i];
		}
	}System.out.println("The 2nd Largest number is: "+secondLargest);
	
	
	
	

	// Create a 2D array to store numbers in 3 rows and 3 columns. Print the sum of all numbers.

	int[][] sumNumber = { { 100, 88, 74 }, { 99, 120, 45 }, { 88, 33, 1000 }, };

	sumRowsCols(sumNumber);
}

public static void sumRowsCols(int[][] row) {
        int sum = 0;
        for (int i = 0; i < row.length; i++) {
                 for (int j = 0; j < row[i].length; j++)
                          sum = sum + row[i][j];
        }
        System.out.println("The sum of all numbers is " + sum);
}}




	// Create a 2D array to store numbers in 3 rows and 4 columns. Develop a program which will identify/print the even numbers only.
	 

	int[][] numbersTable = { { 54, 27, -75, 0, }, { 154, 9999, -228, 1000, },
			{ 87553, -5, 5000, 10154, }, };System.out.println("Original 2D array with numbers:");for(int origLine[]:numbersTable)
	{
		for (int origNumber : origLine) {
			System.out.print(origNumber + " ");
		}
		System.out.println();
	}System.out.println();System.out.println("2D array with even numbers only:");for(int evenNumLine[]:numbersTable)
	{
		for (int evenNum : evenNumLine) {
			if (evenNum % 2 == 0) {
				System.out.print(evenNum + " ");
			}
		}
		System.out.println();
	}}
	
	
	

	// Create a 2D array to store numbers and calculate sum of all odd numbers.
	 

	int[][] number = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	int sum = 0;System.out.println("****2D Array*****");for(int[] original:number)
	{
		for (int orig : original) {
			System.out.print(orig + " ");
		}
		System.out.println();
	}System.out.println("****2D Array Odd number*****");for(
	int i = 0;i<number.length;i++)
	{

		for (int j = 0; j < number[i].length; j++) {

			if ((number[i][j] % 2) != 0) {
				System.out.print(number[i][j] + "  ");
				sum = sum + number[i][j];
			}

		}
		System.out.println();

	}System.out.println("Sum of all odd numbers "+sum);
	
	
	
	
	
	
	

	// Create an array of countries: north america countries, south america
	// countries, europe countries, asian countries, african countries. Then print
	// all values from that array using 2 different loops and calculate how many
	// total countries been stored.

	String[][] countries = { { "USA", "Canada", "Mexico" }, { "Argentina", "Brasil", "Peru" },
			{ "France", "England", "Russia" }, { "Korea", "Japan", "Kazakhstan" }, { "Egypt", "Nigeria", "Morocco" } };

	int sum = 0;System.out.println("****2D Array 1 way*****");System.out.println();for(String[] loop:countries)
	{
		for (String lo : loop) {
			System.out.print(lo + "   ");
		}
		System.out.println();
	}

	System.out.println("****2D Array 2 way*****");System.out.println();for(
	int i = 0;i<contries.length;i++)
	{

		for (int j = 0; j < countries[i].length; j++) {

			System.out.print(countries[i][j] + "  ");
			sum++;
		}
		System.out.println();

	}System.out.println("Countries "+sum);

}

}}

*/
		
	}
}
