import java.util.Scanner;

/**
 * A simple classI 0 to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagPie3Runner
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		MagPie3 maggie = new MagPie3();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
