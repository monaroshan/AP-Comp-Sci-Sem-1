public abstract class PC extends GameSystems
{
	public PC()
	{
		super();
	}
	
	public PC(String c)
	{
		super(c);
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "Platform: " + getPlatform() + "\n"
			  + "Serial #: " + getSerialNo() + "\n"
			  + "System Input: " + systemInput();  
	}
	
}