import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in); 
		int a= sc.nextInt();  
	    
		int i;
		
		for (i=1;i<=10;i++)
		{
			System.out.println(a + "X" + i + "=" + a*i);
		}
		
		// TODO Auto-generated method stub

	}

}
