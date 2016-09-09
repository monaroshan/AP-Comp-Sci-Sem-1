import java.util.Scanner; //import Statement

public class BMI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("What is your height in inches? I am going to calculate your BMI. ");
		double height = keyboard.nextDouble();
		
		System.out.println("Great!");
		
		keyboard.nextLine();
		
		System.out.println("What is your weight in kilograms?");
		double weight = keyboard.nextDouble();
		
		double BMI = (weight)/(height * height);
		System.out.println("Your BMI is " + BMI);
	}
}