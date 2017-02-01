public class WhatisInheritance extends Money 
{
	private String face; 
	private String name;
	private double value;

	public WhatisInheritance()
	{
		super();
		face = "";
	}
	
	public WhatisInheritance(String n, String f, double v)
	{
		super(n,v);
		face = f;
	}
	
	public String scan()
	{
		return face; 
	}
	
	public String toString()
	{
		return "face: " + face + "\n" +
				super.toString();
	}
}