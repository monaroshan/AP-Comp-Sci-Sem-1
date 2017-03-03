public class Toyota implements Location
{
	private double[] location;
	
	private double xCoord;
	private double yCoord;
	
	public Toyota()
	{
		location = new double[2];
	}
	
	public Toyota(String c)
	{
		xCoord = Double.parseDouble(c.substring(0,1));
		yCoord = Double.parseDouble(c.substring(3));
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