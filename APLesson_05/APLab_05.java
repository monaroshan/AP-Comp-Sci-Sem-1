import java.util.Random;
public class APLab_05
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int player = rand.nextInt(6)+1;
		int computer = rand.nextInt(6)+1;
		
		String winner = rollDice(player, computer);
		
		System.out.println("You rolled the " + player);
		System.out.println("Your computer rolled the " + computer);
		System.out.println("The winner is " + winner);

	}
	
	public static String rollDice(int p, int c)
	{
		String winner = "";
		if (p>c)
		{
			winner = "player";
		}
		
		if (c>p)
		{
			winner = "computer";
		}
		return winner;
	}
	
}