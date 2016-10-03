import java.util.Scanner;
public class Average4_3
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int num1 = kb.nextInt();
		
		System.out.println("Please enter another number: ");
		int num2 = kb.nextInt();
		
		System.out.println("Please enter another number: ");
		int num3 = kb.nextInt();
		
		print(num1, num2, num3, calcAvg(num1,num2,num3));
	}
	
	public static int calcAvg(int num1, int num2, int num3)
	
	{
		return (num1+num2+num3)/3;
	}
	public static void print(int num1, int num2, int num3, int average)
	{
		System.out.println("The average of " + num1 + ", " + num2 + " and " + num3 + " is " + average + ".");
	}
}