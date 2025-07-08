package example.com;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = scanner.nextInt();
		int i;
		int flag=0;
		
		for (i=2;i<number;i++)
		{
			int remainder=number%i;
			if (remainder==0)
			{
				System.out.println(number + " is not prime");
				flag=1;
				break;
				
				
			}
		}
	
		if (flag==0)
		{
			System.out.println(number + " is prime");
		}
	}

}
