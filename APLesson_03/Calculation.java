import java.util.Scanner; //import Statement

public class Calculation
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Hi. I am going to calculate the volume of a rectangular prism. What is the height? ");
		double height = keyboard.nextDouble();
		
		System.out.println("Great!");
		
		keyboard.nextLine();
		
		System.out.println("What is the width?");
		double width = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		System.out.println("What is the length?");
		double length = keyboard.nextDouble();
		
		double RecVolume = (height * width * length);
		System.out.println("Your rectangular prism's volume is " + RecVolume);
	}
}