import java.util.Scanner;
public class AverageDigits
{
	static int number;
	static int digits;
	static int average;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = kb.nextInt();
		digits = 0;
		average = 0;
		avDigits();
		System.out.println("The average of the digits in " + number + " is " + average);
	}
	public static void avDigits()
	{
		int num = number;
		while(num>0)
		{
			digits += 1;
			average += (num %10);
			num /= 10;
		}
		average = average/digits;
	}
}