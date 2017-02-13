public abstract class GameSystems 
{
	private String platform;
	private int serialNo;

	public GameSystems()
	{
		this.platform = "";
		this.serialNo = 0;
	}
	
	public GameSystems(String p)
	{
		this.platform = p;
		this.serialNo = (int) (Math.random() * 10000000) + 1;
	}
	
	public String getPlatform()
	{
		return platform;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
}