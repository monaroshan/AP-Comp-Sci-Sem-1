import java.util.Scanner; //import Statement

public class RudeAI
{
	public static void main(String[]args)
	{
        Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name? ");
		
		String name = keyboard.next();
		System.out.println("Wow" + name + " is such a bad name!!");
		
		keyboard.nextLine();
		
		System.out.println("How old are you? ");
		int num = keyboard.nextInt();
		
		System.out.println("So old! " + " You're so cool! Not. ");
		
		keyboard.nextLine();
		
		System.out.println("What do you do for fun? ");
		String activity = keyboard.next();
		
		System.out.println("Ummm. How is " + activity + " fun. So lame.");
		
		keyboard.nextLine();
		
		System.out.println("What kind of music do you like? ");
		String music = keyboard.next();
		
		System.out.println("Why would anyone like " + music + " ?!!" );
		
		keyboard.nextLine();
		
		System.out.println("How many siblings do you have? ");
		int number = keyboard.nextInt();
		
		System.out.println( number + " ? " + "They must hate living with you." );
		
		keyboard.nextLine();
		
		System.out.println("What do you want to be when you grow up? ");
		String job = keyboard.next();
		
		System.out.println("I think you'd have to be smarter to be a " + job + " Good luck finding a job. You need it.");
		
		
	}
}