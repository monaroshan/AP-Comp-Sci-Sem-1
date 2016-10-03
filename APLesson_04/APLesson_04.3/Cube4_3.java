import java.util.Scanner;
public class Cube4_3
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the length of the side of a cube: ");
		int side = kb.nextInt();
		
		print(side, calcSurfaceA(side));
	}
	
	public static int calcSurfaceA(int side)
	
	{
		return 6*(side*side);
	}
	public static void print(int side, int sa)
	{
		System.out.println("The surface area of a cube with " + side + " sides is " + sa + ".");
	}
}