import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore
{
	ArrayList <Toy> toyList;
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}
	
	public ToyStore(String ts)
	{
		loadToys(ts);
	}
	
	public void loadToys(String ts)
	{
		toyList = new ArrayList<Toy>();
		ArrayList <String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			Toy t = getThatToy(name);
			if(t == null)
			{
				if(type.equals("Car"))
				{
					toyList.add(new Car(name));
				}
				if(type.equals("AF"))
				{
					toyList.add(new AFigure(name));
				}
			}
			else
				t.setCount(t.getCount() + 1); 
		}
	}
	
	public Toy getThatToy(String nm)
	{
		for(Toy t : toyList)
		{
			if (t.getName().equals(nm)) 
			{
				return t;
			}
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for (Toy t : toyList)
		{
			if (max < t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		return name;
	}
	
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for (Toy t : toyList)
		{
			if (t.getType().equals("Car"))
			{
				cars++;
			}
			if(t.getType().equals("Action Figure"))
			{
				figures++;
			}
		}
		
		if(cars > figures)
			return "Cars";
		if(figures> cars)
			return "Action Figures";
		else
			return "Equal amounts of action figures and cars!";
	}
	
	public String toString()
	{
		String output = "";
		for(Toy t : toyList)
		{
			output += "" + t;
		}
		return "\nToys in inventory...\n" + output;
	}
}