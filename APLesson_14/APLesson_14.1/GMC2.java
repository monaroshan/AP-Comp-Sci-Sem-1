public class GMC2 extends Car
{
	private double xCoord;
	private double yCoord;
	
	public GMC2(double x, double y)
	{
		super();
		move(x,y);
	}
	
	public void move(double x, double y)
	{
		this.xCoord += x;
		this.yCoord += y;
	}
	
	public double[] getLoc()
	{
		double[] location = {xCoord,yCoord};
		return location;
	}
}