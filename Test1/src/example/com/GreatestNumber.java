package example.com;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] values= {10,500,700,12,35,23,90,60};
		int i;
		int number=8;
		int large=10;
		
		for (i=0;i<values.length;i++)
		{
			if (values[i]>large)
				large=values[i];
		
		}
		
		System.out.println("Largest number is"+ large);
	}

}
