/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		Card one = new Card("2", "Spades" ,3);
		Card two = new Card("3", "Clubs" , 3);
		Card three = new Card("3", "Clubs", 3);
		
		System.out.println("Does two match three?" + two.matches(three));
		System.out.println("Does one match two?" + one.matches(two));
		System.out.println("Card two:" + two.toString());
		System.out.println("Suit of Card three: " + three.suit());
	}
}
