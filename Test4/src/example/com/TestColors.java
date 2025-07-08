package example.com;

import java.util.ArrayList;

public class TestColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColorsManipulate MyColors=new ColorsManipulate();
		
		MyColors.add_colors("blue");
		MyColors.add_colors("green");
		MyColors.add_colors("red");
		MyColors.delete_colors(0);
		MyColors.add_n_colors("black");
	}

}
