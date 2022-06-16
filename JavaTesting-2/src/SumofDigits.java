import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter your number ");
		Scanner sc= new Scanner(System.in); 
		int n= sc.nextInt();
		int sum=0;
		while((n/10)>0)
		{
			sum=sum+(n%10);
			n=n/10;
			
			if (n/10==0)
			{
				sum=sum+(n%10);	
			}
		  	
		}
		
		System.out.println("Sum = " + sum);
		
	}

}
