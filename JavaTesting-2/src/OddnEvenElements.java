
public class OddnEvenElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,3,4,5,6,7,8,9,10,11};
		
		int i;
		int odd=0;int even=0;
		int l=a.length;
		for (i=0;i<l;i++)
		 {
		   if ((a[i])%2==0)
		   {
			   even++;
		   }
		   else
		   {
			   odd++;
		   }
		 }

		System.out.println("Odd numbers = " + odd);
		System.out.println("Even numbers = " + even);
	}

}
