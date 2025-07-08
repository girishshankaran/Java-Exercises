package example.com;

public class Student {

	int student_id;
	String name;
	String grade;
	
	
	public Student(int student_id, String name, String grade)
	{
		this.student_id=student_id;
		this.name=name;
		this.grade=grade;
	}
	
	public String getStudentName()
	{
		return name;
	}
	
	public int getStudentId()
	{
		return student_id;
	}
	
	public String getStudentGrade()
	{
		return grade;
	}
	
	
}
