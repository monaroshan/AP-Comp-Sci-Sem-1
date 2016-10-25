import java.util.Scanner;
public class CountByX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int num1 = kb.nextInt();
		kb.nextLine();
		System.out.println("Please enter another integer: ");
		int num2 = kb.nextInt();
		System.out.println("");
		
		for(int i = num1; i <= num2; i+=2)
		{
		System.out.print(i + "\t");
		}
	}
}