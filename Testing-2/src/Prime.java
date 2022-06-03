import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		int check=1;
		
		for (i=4;i<=n/2;i++)
		{  
            if(n%i==0)
            {
				System.out.println(n + " is NOT a prime number");
				check=0;
				break;
				
            }
            			
		}
      
		if (check==1)
           {
    	     System.out.println(n + " is a prime number");
           }
	}

}
