import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter your number ");
		Scanner sc= new Scanner(System.in); 
		int n= sc.nextInt();
		
		int i=0;
	    int a=0;int b=1;
	    int temp=0;
	    
	  if (n<=2)
	  {

	    System.out.println("The Fibanocci series is: ");
	    System.out.println(a);
    	System.out.println(b);
	  }
    	else
    	{
    	 System.out.println("The Fibanocci series is: ");   
    	 System.out.println(a);
     	 System.out.println(b);
	    for (i=0;i<n-2;i++)
	    {
	    	
	    	System.out.println(a+b);    	
	    	temp=a;
	    	a=b;
	    	b=temp+b;
	    	
	    }	
	    	
	    }
	
		
	}

}
