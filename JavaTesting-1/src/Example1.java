
public class Example1 {

	public static void main(String[] args) {
		
		int i,l,sum=0;
		int a[]= {10,20,30,40,50,60,70,80,90};
		 l=a.length;
		
		for (i=0;i<l;i++)
		{
			sum=sum+a[i];
		}

		System.out.println("Total=" + sum);
	}

}
