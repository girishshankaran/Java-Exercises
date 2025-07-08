package example.com;
import java.time.LocalDate;
import java.util.ArrayList;

public class FlightManagement {
	
	ArrayList<Passenger> passenger=new ArrayList<>();
	
	public int[] findAllFlights(int id)
	{  int[] l=new int[passenger.size()];
		int j=0;
		for (int i=0;i<passenger.size();i++)
		{
			if (passenger.get(i).p_id==id)
			{
				l[j]=id;
				j++;
			}
		}
		return l;
	}
	

}
