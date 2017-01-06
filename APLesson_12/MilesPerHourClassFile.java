import static java.lang.Math.*;
public class MilesPerHourClassFile
{
	private int distance, hours, minutes;
	private double mph;
	
	public MilesPerHourClassFile()
	{
		//default values for instance vars
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public MilesPerHourClassFile(int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
		mph = 0; 
	}
	
	//modifers
	public void setDistance(int d)
	{
		distance = d;
	}
	
	public void setHours(int h)
	{
		hours = h;
	}
	
	public void setMinutes(int m)
	{
		minutes = m;
	}
	
	//accessors
	public double getMPH()
	{
		mph = Math.round(distance / (hours + minutes / 60.0));
		return mph;
	}
}