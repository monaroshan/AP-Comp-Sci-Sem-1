public class StudentAdvance extends Advance 
{
	public StudentAdvance()
	{
		super();
	}
	
	public double getPrice()
	{
		return super.getPrice()/2; 
	}
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\n"
			  + "Price: " + getPrice() + "\n" 
			  + "(STUDENT ID REQUIRED)";
	}
}