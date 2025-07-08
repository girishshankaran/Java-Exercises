package example.com;

public class Rectangle {

	float width;
	float height;
	
	public Rectangle(float width, float height)
	{
		this.height=height;
		this.width=width;
	}
  
	public float findArea(float height, float width)
	{
		return height*width;
	}
	
	public float findPerimeter(float height, float width)
	{
		return 2*(height*width);
	}
}

