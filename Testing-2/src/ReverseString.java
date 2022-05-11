import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your String ");
		Scanner sc= new Scanner(System.in); 
		char name[]= sc.nextLine().toCharArray();
		
		int l=name.length;
				
		for (int i=l-1;i>=0;i--)
		{
			System.out.print(name[i]);
		}
			
				
		}
}
