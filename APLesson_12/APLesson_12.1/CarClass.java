public class CarClass
{

	public CarClass()
	{
		paint = "";
		interior = "";
		engine = "";
		tires = "";
	}
	
	public CarClass(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	private String paint, interior, engine, tires;
	
	//Modifier
	public void setCustom(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	//Accessors 
	public String getPaint()
	{
		return paint;
	}
	
	public String getInterior()
	{
		return interior;
	}
	public String getEngine()
	{
		return engine;
	}
	
	public String getTires()
	{
		return tires;
	}
}