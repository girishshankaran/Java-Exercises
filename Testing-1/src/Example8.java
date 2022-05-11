import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in); 
		int n= sc.nextInt();
		int a[]=new int[5];
		int i=0;
		while((n/2)!=0)
		{
			a[i]=(n%2);
			System.out.println(a[i]);
			n=n/2;
			i++;
		}
	
       	  
    
	}

}
