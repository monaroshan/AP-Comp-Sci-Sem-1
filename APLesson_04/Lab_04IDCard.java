import java.util.Scanner;
public class Lab_04IDCard.java
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		APLab_04IDCard form = new APLab_04IDCard();
		
		//input for item 1 and price
		System.out.println("Please enter your last name");
		String name = keyboard.next();	
		
		//input for item 2 and price
		System.out.println("Please enter your title");
		String title = keyboard.next();	
		
		//input for item 3 and price
		System.out.println("Please enter the school site");
		String site = keyboard.next();	
		
		//input for item 3 and price
		System.out.println("Please enter the school year");
		Double year = keyboard.next();	
		
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
	}
	
	//create a method that print formats your 3 items
	public void format(String item, double price)
	{
		System.out.printf("\n%10s ..........  %10.2f", item, price);
	}
}
	
	
	