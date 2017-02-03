public class Car extends Toy
{
	private String name, car;
	
	public Car()
	{
		super();
		this.car = "";
	}
	
	public Car(String n, String c)
	{
		super(n);
		this.car = c;
	}
	
	public String toString()
	{
		return "Car:" + car + "\n" +
				super.toString();
	}
	
	public String getType()
	{
		return car;
	}
}