import java.util.Scanner;
public class HumanDriver
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the hair color: ");
		String hair = kb.next();
		kb.nextLine();
		System.out.println("Enter the eye color: ");
		String eyes = kb.next(); 
		kb.nextLine();
		System.out.println("Enter the skin color: ");
		String skin = kb.next();
		kb.nextLine();
		
		Human object = new Human(hair, eyes, skin);
		System.out.println("My info......");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: "  + object.getSkin());
		
		object.setHES("light brown", "dark brown", "white");
		System.out.println("Friend's info......");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: "  + object.getSkin());
	}
	
}