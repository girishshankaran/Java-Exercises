
public class Exerc1 {

	public static void findNeedles(String haystack, String[] needles) {
		if (needles.length > 5) {
		 System.err.println("Too many words!");
		} 
		
		else
		{
			String[] words = haystack.split("[ \"\'\t\n\b\f\r]", 0);
			
			int i,j;
			int[] countMatch = new int[needles.length];
			  for (i=0;i<needles.length;i++)
			  {
				  for(j=0;j<words.length;j++)
				  {
					  if (words[j].compareTo(needles[i]) == 0)
					  {
						  countMatch[i]++;
					  }
				  }
					  
			  }
		}  for (i=0;i<needles.length;i++)
		    {
			  System.out.println(needles[i] + countMatch[i]);
		    }
	}
}
