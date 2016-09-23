import java.util.Scanner;
public class CompInterest
{
	public static void main(String[]args)
	{
	Scanner keyboard = new Scanner(System.in);
	CompInterest loan = new CompInterest();
	
	System.out.println("Please enter the rate of interest:");
	double rate = keyboard.nextDouble();
	keyboard.nextLine();
	
	System.out.println("Please enter the principal:");
	double princpl = keyboard.nextDouble();
	keyboard.nextLine();
	
	System.out.println("Please enter the time in years:");
	double time = keyboard.nextDouble();
	keyboard.nextLine();
	
	System.out.println("Please enter the number of times per year interest is compounded:");
	double number = keyboard.nextDouble();
	keyboard.nextLine();
	
	System.out.println("Your monthly payment will be " + loan.payment(rate, princpl, time, number));
	}
	
	public double payment(double r, double p, double t, double n)
	{
		return Math.pow((1+(r/n)), (n*t)) *p;
	}
}