import java.util.Scanner;
public class CarDriver
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the paint color: ");
		String paint = kb.next();
		kb.nextLine();
		System.out.println("Enter the interior type: ");
		String interior = kb.next(); 
		kb.nextLine();
		System.out.println("Enter the engine type: ");
		String engine = kb.next();
		kb.nextLine();
		System.out.println("Enter the tires: ");
		String tires = kb.next();
		kb.nextLine();
		
		CarClass object = new CarClass(paint, interior, engine, tires);
		System.out.println("Your vehicle is ready......");
		System.out.println("Paint: " + object.getPaint());
		System.out.println("Interior: " + object.getInterior());
		System.out.println("Engine: "  + object.getEngine());
		System.out.println("Tires: "  + object.getTires());
	}
	
}