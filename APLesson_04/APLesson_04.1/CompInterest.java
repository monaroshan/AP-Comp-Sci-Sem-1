import java.util.Scanner;
public class CompInterest
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the rate of interest:");
		double rate = keyboard.nextDouble();
		
		System.out.println("Please enter the principal:");
		double princpl = keyboard.nextDouble();
		
		System.out.println("Please enter the time in years:");
		double time = keyboard.nextDouble();
		
		System.out.println("Please enter the number of times per year interest is compounded:");
		double number = keyboard.nextDouble();
		
		System.out.println("Your monthly payment will be " + payment(rate, princpl, time, number));
	}
	
	public static double payment(double r, double p, double t, double n)
	{
		return (p*Math.pow(1 + r/n, n*t))/(t*12);
	}
}