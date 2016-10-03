import java.util.Scanner;
public class Lab_04IDCard
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		Lab_04IDCard form = new Lab_04IDCard();
		
		//input for item 1 and price
		System.out.println("Please enter your first name:");
		String first = keyboard.next();	
		
		//input for item 1 and price
		System.out.println("Please enter your last name:");
		String name = keyboard.next();	
		
		//input for item 2 and price
		System.out.println("Please enter your title:");
		String title = keyboard.next();	
		
		//input for item 3 and price
		System.out.println("Please enter the school site:");
		String site = keyboard.next();	
		keyboard.nextLine();
		//input for item 3 and price
		System.out.println("Please enter the school year:");
		String year = keyboard.nextLine();
		
		keyboard.nextLine();
		
		System.out.println("What is your subject?");
		String subject = keyboard.next();	
		
		System.out.println("************************");
		form.format(site, year);
		form.format(first, name);
		form.format(title, subject);
		System.out.println("************************");
	}
	
	//create a method that print formats your 3 items
	public void format(String item, String year)
	{
		System.out.printf("* %10s%10s * \n", item, year);
	}

}
	
	
	