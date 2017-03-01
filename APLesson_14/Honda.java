public class Honda implements Location
{
	private double xCoord;
	private double yCoord;
	
	public Honda()
	{
		xCoord = 0;
		yCoord = 0;
	}
	
	public Honda(double[] location)
	{
		xCoord = location[0];
		yCoord = location[1];
	}
	
	public int getID()
	{
		return (int) (Math.random() * 1000000) + 1;
	}
	
	public void move(double x, double y)
	{
		xCoord = x;
		yCoord = y;
	}
	
	public double[] getLoc()
	{
		double[] location = {xCoord,yCoord};
		return location;
	}
}