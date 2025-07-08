package example.com;
import java.util.ArrayList;

public class Library {
	
	ArrayList<Book> books=new ArrayList<>();
	
	public String addBook(Book b1)
	{
		books.add(b1);
		System.out.println("Book added");
		return b1.title;
	}
	
	public void removeBook(String tit)
	{
		int chck=0;
		for (int i=0;i<books.size();i++)
		{
			if (books.get(i).title.equals(tit))
			{
				books.remove(i);
				System.out.println(tit +" is removed");
				chck=1;
			}
		}
		if (chck==1)
			System.out.println("Book not found");
	}
	
	public int searchBook(String tit)
	{
		int chck=0;
		
		for (int i=0;i<books.size();i++)
		{
			if (books.get(i).title.equals(tit))
			{
				chck=1;
				System.out.println(tit +" found");
			}
		}
		return chck;
		
	}
	

}
