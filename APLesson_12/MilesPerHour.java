import java.util.Scanner;
public class MilesPerHour
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the distance: ");
		int distance = kb.nextInt();
		System.out.println("Enter the hours: ");
		int hours = kb.nextInt(); 
		System.out.println("Enter the minutes: ");
		int minutes = kb.nextInt();
		
		MilesPerHourClassFile object = new MilesPerHourClassFile(distance, hours, minutes);
		
		System.out.println(distance + " miles in " + hours + " hours is " + object.getMPH() + " mph. ");
		
		object.setDistance(distance);
		object.setHours(hours);
		object.setMinutes(minutes);
		System.out.println(distance + " miles in " + hours + " hours is " + object.getMPH() + " mph. ");
		
		
	
	
	
	}
}