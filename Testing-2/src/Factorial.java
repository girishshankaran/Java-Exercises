import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your number");
		Scanner sc=new Scanner (System.in);
		int n= sc.nextInt();
		
		int i; int fact=1;
		
		for (i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		
     System.out.println("Factorial of " + n + " = "+ fact);
	}

}
