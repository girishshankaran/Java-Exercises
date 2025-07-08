package example.com;

public class Student {
	
	String name;
	int studentID;
	
	public Student(String name, int StudentID)
	{
		this.name=name;
		this.studentID=studentID;
	}

	public String getName()
	{
		return name;
	}
	public int getStudentID()
	{
		return studentID;
	}
}
