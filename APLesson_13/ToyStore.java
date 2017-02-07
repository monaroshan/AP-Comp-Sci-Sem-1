import java.util.ArrayList;
import java.util.Scanner;

ArrayList <Toy> toyList;

public class ToyStore
{
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}
	
	public ToyStore(String ts)
	{
		toyList = ts;
		loadToys();
	}
	
	public loadToys(String ts)
	{
		ArrayList <String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		
		for(int i = 0; i< toys.size; i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			Toy t = getThatToy(name);
			if(t == null)
			{
				if(t.getType().equals("Car"))
				{
					toyList.add(new Car(name));
				}
				if(t.getType().equals("Action Figure"))
				{
					toyList.add(new AFigure(name));
				}
			}
			else
			{
				t.setCount(t.getCount() + 1); 
			}
		}

	}
	
	public static toy getThatToy(String nm)
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
	
	public getMostFrequestToy()
	{
		String Name = "";
		int max = Integer.MIN_VALUE;
		for (Toy t : toyList)
		{
			if (max < t.getCount())
			{
				max = t.getCount();
				name = t.getCount();
		}
	}
	return name;
	
	public getMostFrequentType()
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
		
		if(cars < figures)
		{
			if(cars == figures)
				return "Equal amounts of action figures and cars!";
			else
				return "Cars";
		}
	
	public String toString()
	{
		return toyList;
	}
}