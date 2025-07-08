package example.com;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("1. Addition 2. Multiply 3. Divison");
		int choice = scanner.nextInt();
		System.out.println("Enter the first number");
		int number1 = scanner.nextInt();
		System.out.println("Enter the second number");
		int number2 = scanner.nextInt();
		double ans = 0;
		
		if (choice==1)
		{
			ans=calculate_sum(number1,number2);
		}
		
		if (choice==2)
		{
			ans=calculate_product(number1,number2);
		}
		
		if (choice==3)
		{
			ans=calculate_division(number1,number2);
		}
		
		System.out.println("The answer is " + ans);
	}
	
	public static double calculate_sum(int n1,int n2)
	{
	  int ans=n1+n2;
	  return(ans);
	}
	
	public static double calculate_product(int n1,int n2)
	{
	  int ans=n1*n2;
	  return(ans);
	}
	public static double calculate_division(int n1,int n2)
	{
	  int ans=n1/n2;
	  return(ans);
	}

}
