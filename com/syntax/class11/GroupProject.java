package com.syntax.class11;

public class GroupProject {

	public static void main(String[] args) {
		
		/*
		int i =0;
		int num =0;
		String primeNumbers = "";
		for (i = 1; i <= 100; i++)
		{
		int counter=0;
		for(num =i; num>=1; num--)
		{
		if(i%num==0)
		{
		counter = counter + 1;
		}
		}
		if (counter ==2)
		{
		primeNumbers = primeNumbers + i + " ";
		}
		}
		System.out.print("Prime numbers between 1 and 100 are :");
		System.out.println(primeNumbers);
		}

	
	
		*/	
			

			
		
		



			
		
		
		
		
		
		
		
		
		
		/*int num, i, count=0;
		 
		
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a Number : ");
        num = scan.nextInt();
	

        for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }		
        if(count == 0)
        {
            System.out.print("This is a Prime Number");
        }
        else
        {
            System.out.print("This is not a Prime Number");
        }
    }*/

		

		
		/*int i[] = new int[] {5, 24, 10, 27, 8788, 12};

		int minNumber = i[0]; 
		int maxNumber = i[0]; 

		for (int j = 1; j < i.length; j++)  
		{
			if (i[j] > maxNumber) 
			{
				maxNumber = i[j];
			}
			if (i[j] < minNumber) 
			{
				minNumber = i[j];
			}
		}

		System.out.println("Maximum Number: " + maxNumber);
		System.out.println("Minimum Number: " + minNumber); */
/*	}

}*/

		
		// Write a Java Program to print the first 10 numbers of Fibonacci series.

		/*int numberLimit = 10;

		long[] seriesOfNumbers = new long[numberLimit];

		seriesOfNumbers[0] = 0;
		seriesOfNumbers[1] = 1;

		for (int i = 2; i < numberLimit; i++) {
			seriesOfNumbers[i] = seriesOfNumbers[i - 1] + seriesOfNumbers[i - 2];
		}
		System.out.println("The first " + numberLimit + " numbers of the Fibonacci Sequence:");
		for (int i = 0; i < numberLimit; i++) {
			System.out.print(seriesOfNumbers[i] + " ");*/
		
		int [] [] sumNumber = {
				{100,88,74},
				{99,120,45},
				{88,33,1000},
				};
				sumRowsCols(sumNumber);
			}

			public static void sumRowsCols(int[][] row) {
				int sum = 0;
				for (int i = 0; i < row.length; i++) {
					for (int j = 0; j < row[i].length; j++)
						sum = sum + row[i][j];
				}
				System.out.println("The sum of all numbers is " + sum);
			}

		}
		