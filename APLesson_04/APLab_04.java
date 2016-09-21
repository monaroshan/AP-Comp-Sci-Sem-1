import java.util.Scanner;
public class APLab_04
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		APLab_04 form = new APLab_04();
		
		//input for item 1 and price
		System.out.println("Please enter item 1");
		String item1 = keyboard.next();	
		
		System.out.println("Please enter the price");
		double price1 = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		//input for item 2 and price
		System.out.println("Please enter item 2");
		String item2 = keyboard.next();	
		
		System.out.println("Please enter the price");
		double price2 = keyboard.nextDouble();
		keyboard.nextLine();
		
		//input for item 3 and price
		System.out.println("Please enter item 3");
		String item3 = keyboard.next();	
		
		System.out.println("Please enter the price");
		double price3 = keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.println("<<<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>>");
		
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		
		double Subtotal = price1+price2+price3;
		form.format("Subtotal:", Subtotal);
		
		double Tax = .08 * Subtotal;
		form.format("Tax:", Tax);
		
		double Total = Subtotal + Tax;
		form.format("Total:", Total);
		
		System.out.println("______________________________________________");
		System.out.println(" *        Thank you for your support         * ");
		
		
	}
	
	//create a method that print formats your 3 items
	public void format(String item, double price)
	{
		System.out.printf("* %20s ..........  %10.2f\n", item, price);
	}
}
	
	
	