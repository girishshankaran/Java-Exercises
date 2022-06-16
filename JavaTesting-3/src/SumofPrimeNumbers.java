/* This program is for grouping the prime and non-prime members in a given array */

import java.util.Scanner;

public class SumofPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* This is a multi-liner comment */
        // This is a single-liner comment
		
		int a[]= {3,5,7,8,9,10,13,15,16,19,17,20};
		int i,j; 
		int check=1;
		int countPrime=0;
		
		for (j=0;j<a.length;j++)
		{
		
			for (i=4;i<=a[j]/2;i++)
				{  
				if((a[j]%2)==0)
					{
					System.out.println(a[j] + " is NOT a prime number");
					check=0;
					break;
				    /* If check=0, then break the inner loop and move to the next number for checking */
					}
            			
				}
      
			if (check==1)
			{
				System.out.println(a[j] + " is a prime number");
				countPrime++;
			}
		
		 }	
		System.out.println("Total prime numbers = " + countPrime);
		System.out.println("Total non-prime numbers = " + (a.length-countPrime));
	}

}
