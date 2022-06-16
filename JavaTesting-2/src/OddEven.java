import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter your Number ");
		Scanner sc= new Scanner(System.in); 
		int n= sc.nextInt();
		
		int i=3;
		
		if (n<=3)
			System.out.println("Enter a number that is greater than 3");
		
		else
		{
		
		System.out.println("The odd numbers before " + n + " are");
		while(i<=n && n>3)
		{
			if (i%2!=0)
				System.out.print(i + " ");
			i++;
			
				
			
		}}
	}

}
