public class AFigure extends Toy 
{
	private String AFigure; 

	public AFigure()
	{
		super();
		AFigure = "";
	}
	
	public AFigure(String n, String af)
	{
		super(n);
		AFigure = af;
	}
	
	public String getType()
	{
		return AFigure; 
	}
	
	public String toString()
	{
		return "Action Figure: " + AFigure + "\n" +
				super.toString();
	}
}