package example.com;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ColorsManipulate {
	
	ArrayList<String> colors=new ArrayList<>();
	String color;
	
	public void add_colors(String color)
	{
		colors.add(color);
		System.out.println(color + "added");
	}
	
	public void delete_colors(int n)
	{
		colors.remove(0);
		System.out.println("color" + "removed" + "from"+ n + "position");
	}
	
	public void add_n_colors(String color)
	{
		colors.add(0, color);
		System.out.println(color + "added");
	}
}
