package example.com;

public class HayStackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String haystack= "This has tiger, lion, lion, and tiger";
		String needles []= {"lion","tiger"};
		
		findNeedles(haystack, needles);
		
	}

	public static void findNeedles(String haystack,String needles[])
	{
		String[] words = haystack.split("[,\\s]+");
		
		for (int i=0;i<needles.length;i++)
		{
			for (int j=0;j<words.length;j++)
			{
				if (needles[i].equals(words[j]))
					System.out.println(needles[i] + " matched");
			}
		}
	}
}
