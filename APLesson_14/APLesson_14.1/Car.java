public abstract class Car implements location2
{
	private int ID;
	private double[] location;
	
	public Car()
	{
		ID = (int) (Math.random() * 1000000) + 1;
		location = new double[2];
	}
	
	public abstract void move(double x, double y);
	
	public int getID()
	{
		return ID;
	}
}