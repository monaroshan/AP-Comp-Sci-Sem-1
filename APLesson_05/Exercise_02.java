import java.util.Scanner;
public class Exercise_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		Exercise_02 form = new Exercise_02();
		
		System.out.println("Please enter item 1");
		String item1 = keyboard.next();	
		
		System.out.println("Please enter the price");
		double price1 = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		System.out.println("Please enter item 2");
		String item2 = keyboard.next();	
		
		System.out.println("Please enter the price");
		double price2 = keyboard.nextDouble();
		keyboard.nextLine();
	
		System.out.println("Please enter item 3");
		String item3 = keyboard.next();	
		
		System.out.println("Please enter the price");
		double price3 = keyboard.nextDouble();
		keyboard.nextLine();
		
		keyboard.nextLine();
		
		System.out.println("Please enter item 4");
		String item4 = keyboard.next();
		
		System.out.println("Please enter the price");
		double price4 = keyboard.nextDouble();
		
		double Subtotal = price1+price2+price3+price4;
		double discount = totalDisc(Subtotal);
		double Tax = .08 * Subtotal;
		double Total = Subtotal - discount + Tax;
		
		System.out.println("<<<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		form.format(item4, price4);
		form.format("Subtotal:", Subtotal);
		form.format("Discount:", discount);
		form.format("Tax:", Tax);
		form.format("Total:", Total);
		System.out.println("______________________________________________");
		System.out.println(" *        Thank you for your support         * ");
		
	}
	
	public static double totalDisc(double t)
	{
		double discount = 0;
		if (t>=2000)
		{
			discount = t * 0.15;
		}
		
		if (t<2000)
		{
			discount = 0;
		}
		
		return discount;
	}
	
	public void format(String item, double price)
	{
		System.out.printf("* %20s ..........  %10.2f\n", item, price);
	}
	
}