import java.util.Scanner;
public class Ex_04
{
	public static void main(String[]args)
	{
	Scanner keyboard = new Scanner(System.in);
	Ex_04 box = new Ex_04();
	
	System.out.println("Please enter the height of the box in inches");
	double height = keyboard.nextDouble();
	keyboard.nextLine();
	
	System.out.println("Please enter the length of the box in inches");
	double length = keyboard.nextDouble();
	keyboard.nextLine();
	
	System.out.println("Please enter the width of the box in inches");
	double width = keyboard.nextDouble();
	keyboard.nextLine();
	
	System.out.println("Your volume for the subwoofer box in cubic feet is " + box.volume(height, length, width));
	}
	
	public double volume(double h, double l, double w)
	{
		return (h*l*w)/1728;
	}
}