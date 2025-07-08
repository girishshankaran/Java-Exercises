package example.com;
import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many numbers? ");
		int number = scanner.nextInt();
		int a=0;
		int b=1;
		int s=1;
		for (int i=0;i<number;i++)
		{
			System.out.println(s);
			s=s+b;
		    	
		}

	}

}
