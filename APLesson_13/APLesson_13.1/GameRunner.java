import java.util.Scanner;
public class GameRunner 
{
	public static void main(String[]args)
	{
		PlayStation ps = new PlayStation("PS4");
		System.out.println(ps);
		
		XBox xb = new XBox("XBox 360");
		System.out.println(xb);
		
		PlayStation ps1 = new PlayStation("PS3");
		System.out.println(ps1);
	}
}