public abstract class Car implements location2
{
	private int ID;
	
	public Car()
	{
		ID = (int) (Math.random() * 1000000) + 1;
	}
	
	public abstract void move(double x, double y);
	
	public int getID()
	{
		return ID;
	}
}