public class GMC implements Location
{
	private double xCoord;
	private double yCoord;
	
	public GMC()
	{
		xCoord = 0;
		yCoord = 0;
	}
	
	public GMC(double x, double y)
	{
		xCoord = x;
		yCoord = y;
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