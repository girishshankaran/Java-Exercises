import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		
		System.out.println("How many numbers?");
		Scanner sc= new Scanner(System.in); 
		int n= sc.nextInt();
		
		int i,sum=0;
		for (i=1;i<=n;i++)
		{
			System.out.println("Enter the " + i+ " number");
			Scanner sc1= new Scanner(System.in); 
			int num= sc1.nextInt();
			sum=sum+num;
		}
		
		System.out.println("Sum =" + sum);
		
	    
		// TODO Auto-generated method stub

	}

}
