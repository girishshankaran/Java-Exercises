import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		
		System.out.println("Enter the first number");
		Scanner sc= new Scanner(System.in); 
		
		int a= sc.nextInt();  
		// TODO Auto-generated method stub
		
		System.out.println("Enter the second number");
		Scanner sc1= new Scanner(System.in);
		int b=sc.nextInt();
		
		System.out.println("Sum =" + a+b);
		System.out.println("Minus=" + (a-b));
		System.out.println("Product =" + a*b);
		System.out.println("Divide =" + a/b);
		System.out.println("Mode =" + a%b);
	}

}
