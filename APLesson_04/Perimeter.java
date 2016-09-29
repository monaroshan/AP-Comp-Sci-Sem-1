
public class Perimeter
{
	
	public static void main(String[]args)
	{
		
		int width = 10;
		int height = 15;
		
		int perimeter = calcPerim(width, height);
		
		System.out.println("Your perimeter is " +perimeter+ " ft.");
	}
	
	public static int calcPerim(int w, int h)
	
	{
		return 2*(w+h);
		
	}
		
}