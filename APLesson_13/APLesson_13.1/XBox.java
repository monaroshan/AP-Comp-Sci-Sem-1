public class XBox extends Console 
{
	public XBox()
	{
		super();
	}
	
	public XBox(String c)
	{
		super(c);
	}
	
	public String getController()
	{
		return "XBox Wireless Controller"; 
	}
	
	public String getPlatform()
	{
		return "XBox";
	}
}