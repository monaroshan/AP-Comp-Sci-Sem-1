public class Toyota implements Location
{
	private double[] location;
	
	public Toyota()
	{
		location = new double[];
	}
	
	public Toyota(String c)
	{
		location = c.
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