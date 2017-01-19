import java.util.Scanner;
public class InventoryItemsRunner
{
	public static void main(String[]args)
		{
			Scanner kb = new Scanner(System.in);
			InventoryItems object;
			System.out.println("What is the Item Manufacturer?");
			String ItemManufacturer = kb.next();
			System.out.println("What is the item name?");
			String ItemName = kb.next();
			System.out.println("Would you like to enter item category and price? Y or N?");
			String YorN = kb.next();
			if (YorN.equals("N"))
			{
				object = new InventoryItems(ItemManufacturer,ItemName);
				System.out.println(object);
			}
			else
			{
				System.out.println("What is the Item Category?");
				String ItemCategory = kb.next();
				System.out.println("What is the item price?");
				int price = kb.nextInt();
				object = new InventoryItems(ItemManufacturer,ItemName, ItemCategory, price);
				System.out.println(object);
			}
		
		}
}