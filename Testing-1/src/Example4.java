import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		System.out.println("Enter the first number");
		Scanner sc= new Scanner(System.in); 
		
		int a= sc.nextInt();  
		// TODO Auto-generated method stub
		
		System.out.println("Enter the second number");
		Scanner sc1= new Scanner(System.in); 
		
		int b= sc1.nextInt();
		
		System.out.println("Product= "+ a*b);
    
	}

}
