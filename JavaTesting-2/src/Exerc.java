
public class Exerc {

	public static void findNeedles(String haystack, String[] needles) {
		if (needles.length > 5) {
		 System.err.println("Too many words!");
		if (haystack.length()<=0)
		  System.err.println("Haystack is empty!");
		  
		} 
		  else {
		    int[] countArray = new int[needles.length];
		    String[] words = haystack.split("[ \"\'\t\n\b\f\r]", 0);
		    
		    System.out.println(needles.length);
		    for (int i = 0; i < needles.length; i++) {
		      		    
		    System.out.println("words - " + i+ words[i]);
		      for (int j = 0; j < words.length; j++) {
		        if (words[j].compareTo(needles[i]) == 0) {
		        	System.out.println("words[j]= " + words[j]);
		        	System.out.println("needles[i]= " + needles[i]);
		        	System.out.println("CountArray[i]" + countArray[i]);
		          countArray[i]++;
		           }
		         }
		      }
		   for (int j = 0; j < needles.length; j++) {
		        System.out.println(needles[j] + ": " + countArray[j]);
		      }
		    }
		}

}
