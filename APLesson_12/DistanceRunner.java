import java.util.Scanner;
public class DistanceRunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter x1: ");
		int xOne = kb.nextInt();
		System.out.println("Enter y1: ");
		int yOne = kb.nextInt(); 
		System.out.println("Enter x2: ");
		int xTwo = kb.nextInt();
		System.out.println("Enter y2: ");
		int yTwo = kb.nextInt();
		
		Distance object = new Distance(xOne, yOne, xTwo, yTwo);
		System.out.println( "distance = " + object.getDistance());
		
		object.setPoints(xOne, yOne, xTwo, yTwo);
		System.out.println( "distance = " + object.getDistance());
		
	}
	
}