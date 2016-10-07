import java.util.Scanner;
public class StudyGuide2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter item1: ");
		String i1 = kb.nextLine();
		System.out.println("Now enter the price: ");
		double p1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item2: ");
		String i2 = kb.nextLine();
		System.out.println("Now enter the price: ");
		double p2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item3: ");
		String i3 = kb.nextLine();
		System.out.println("Now enter the price: ");
		double p3 = kb.nextDouble();
		kb.nextLine();
		
		double subtotal = p1+p2+p3;
		double tax = subtotal * 0.08;
		double total = subtotal +tax;
		
		System.out.println("<<<<<<<<<<< Reciept >>>>>>>>>>>>>");
		format(i1, p1);
		format(i2, p2);
		format(i3, p3);
		format("Subtotal: ", subtotal);
		format("Tax: ", tax);
		format("Total: ", total);
		System.out.println("_______________________________________");
		System.out.println("\tThank you....Come Again!");
		
	}
	public void format(String one, double two)
	{
		System.out.printf("* %15s.....%15.2f\n", one, two);
	}
	
}
	