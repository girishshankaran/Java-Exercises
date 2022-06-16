/* This program checks whether a given string is palindrome or not */

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your string");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		char[] ch = name.toCharArray();
		// System.out.println("ch[0]= " + ch[0]);
		
		// String[] letters = name.split("[ \"\'\t\n\b\f\r]", 0);
		int wordsLength=ch.length;
		
		// System.out.println("WL= " + wordsLength);
		
		int halfWay=wordsLength/2;
        int i; int check=1;
        for (i=0;i<halfWay;i++)
        {   
        	
        	if((ch[i])!=(ch[wordsLength-1]))
        	{
        		check=0;
        		break;
        	}
        	else
        	{
        		wordsLength--;
        	}
        }
        
        if (check==0)
        {
        	System.out.println(name + " is not palindrome");
        }
        if (check==1)
        {
        	System.out.println(name + " is palindrome");
        }
        		
        
	}

}
