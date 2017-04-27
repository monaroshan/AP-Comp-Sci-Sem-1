/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		String[] r1 = {"Queen", "King", "Ace"};
		String[] s1 = {"Clubs", "Diamonds", "Spades"};
		int[] v1 = {12, 13, 1};
		Deck d1 = new Deck(r1, s1, v1);
		System.out.println("The first deck should be empty: " + d1.isEmpty());
		
		String[] r2 = {"9", "10", "Jack"};
		String[] s2 = {"Spades", "Diamonds", "Hearts"};
		int[] v2 = {9, 10, 11};
		Deck d2 = new Deck(r2, s2, v2);
		System.out.println("The second deck's size should be: " + d2.size());
		
		String[] r3 = {"2", "4", "King"};
		String[] s3 = {"Spades", "Diamonds", "Hearts"};
		int[] v3 = {2, 4, 13};
		Deck d3 = new Deck(r3, s3, v3);
		System.out.println("The third deck's dealt card is: " + d3.deal());
	}
}
