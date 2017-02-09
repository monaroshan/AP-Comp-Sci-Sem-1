public abstract class Console extends GameSystems
{
	public abstract String getController();
	
	public Console()
	{
		super();
	}
	
	public Console(String c)
	{
		super(c);
	}
	
	public String toString()
	{
		return "Platform: " + getPlatform() + "\n"
			  + "Serial #: " + getSerialNo() + "\n"
			  + "Controller: " + getController();  
	}
	
}