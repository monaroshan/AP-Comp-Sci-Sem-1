import java.util.Scanner;
public class Rectangle4_3
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your length: ");
		int l = kb.nextInt();
		
		System.out.println("Please enter your width: ");
		int w = kb.nextInt();
		
		print(calcPerim(l,w));
	}
	
	public static int calcPerim(int l, int w)
	
	{
		return 2*(l+w);
	}
	public static void print(int perimeter)
	{
		System.out.println("The perimeter of your rectangle is " + perimeter);
	}
}