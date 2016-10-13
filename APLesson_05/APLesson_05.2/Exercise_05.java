import java.util.Scanner;
public class Exercise_05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to... " +
							"\n 1. Go to Paris" +
							"\n 2. Go to London");
		int ParisOrLondon = kb.nextInt();
		if(ParisOrLondon == 1)
		{
			System.out.println("Do you want to see the Eiffel Tower? ");
			kb.nextLine();
			String parisAnswer = kb.nextLine();
			if (parisAnswer.equals("Y"))
			{
				System.out.println("Perfect! Do you know how to get there?");
				kb.nextLine();
				String eiffelAnswer = kb.nextLine();
				if (eiffelAnswer.equals("Y"))
				{
					System.out.println("Great! Snapchat pics on your story!!");
				}
				else 
					System.out.println("Ask your hotel's concierge!");
			}
			else 
				System.out.println("No way! You have to see it!");
		}
		else
		{
			System.out.println("Do you want to see the Big Ben? ");
			kb.nextLine();
			String londonAnswer = kb.nextLine();
			if(londonAnswer.equals("Y"))
			{
				System.out.println("Sounds fun! Do you know how to get there?!");
				String benAnswer = kb.nextLine();
				if (benAnswer.equals("Y"))
				{
					System.out.println("YAY! Hope you have lots of fun!");
				}
				else
					System.out.println("That sucks. Too bad.");
			}
			else
			{
				System.out.println("Awww why! It's so pretty");
			}	
		}
	}
}