import java.util.Scanner;

public class OddnNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Until what number?");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int i;
		
		if (n<3)
		
		{
			System.out.println("The number should be above 2");
		}
		
		else
		{
		
		System.out.println("The odd numbers before " + n + " are ");
		for (i=3;i<n;i++)
		{
			if ((i%2)!=0)
			{
				System.out.println(i + " ");
			}
		}
	}}

}
