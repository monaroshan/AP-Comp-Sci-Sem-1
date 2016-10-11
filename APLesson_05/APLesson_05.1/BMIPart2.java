import java.util.Scanner; 
public class BMIPart2
{
	static double BMI = 0;
	static String condition;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("What is your height in inches? I am going to calculate your BMI. ");
		double height = keyboard.nextDouble();
		System.out.println("What is your weight in pounds?");
		double weight = keyboard.nextDouble();
		
		
		calcBMI(height,weight,BMI,condition);
		
	}
	
	public static void calcBMI(double height, double weight, double BMI, String condition)
	{
		BMI = 703*(weight/(height*height));
		System.out.println("Your BMI is " + BMI);
		if (BMI<18.5)
			condition = "Underweight";
		else if (BMI<24.9)
			condition = "Normal";
		else if (BMI<29.9)
			condition = "Overweight";
		else if (BMI<34.9)
			condition = "Obese";
		else if (BMI<39.9)
			condition = "Very Obese";
		else 
			condition = "Morbidly Obese";
		System.out.println("You are " +condition);
	}
}