public class Card 
{

	private String suit;
	private String rank;
	private int pointValue;
	
	public Card(String cardRank, String cardSuit, int cardPointValue) 
	{
		suit = cardSuit;
		rank = cardRank;
		pointValue = cardPointValue;
	}
	
	public String suit() 
	{
		return suit;
    }

	public String rank() 
	{
		return rank;
	}

	public int pointValue() 
	{
		return pointValue;
	}

}