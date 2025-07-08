package example.com;
import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

	ArrayList<Employee> Emplist=new ArrayList<>();
	
	public void addEmployee(Employee emp)
	{
		Emplist.add(emp);
		System.out.println(emp.name + " added");
	}

	public void deleteEmployee(String n)
	{  int check=0;
		for (int i=0;i<Emplist.size();i++)
		{
			if (Emplist.get(i).name.equals(n))
			{
				Emplist.remove(i);
				System.out.println(n + " is removed");
				check=1;
				break;
			}
				
		}
		if (check==0)
		System.out.println(n + " not found");
	}
	
	public void listEmployeesByDepartment(String dep)
	{
		for (int i=0;i<Emplist.size();i++)
		{
			if (Emplist.get(i).department.equals(dep))
			{
			
				System.out.println(Emplist.get(i).name);
				System.out.println(Emplist.get(i).department);
				System.out.println(Emplist.get(i).salary);
			}
		}
		
	}
	
}
