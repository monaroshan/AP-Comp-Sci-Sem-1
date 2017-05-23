public class Deck 
{

    public Card[] deck;

    public int cardsDealt;

    public Deck() 
	{
		deck = new Card[52];
		String[] suit = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int created = 0;
       
		for (String r: rank)
		{
			for(String s: suit) 
			{
				for (int value = 1; value <= 13; value++) 
				{
					deck[created] = new Card(r, s, value);
					created ++;
				}
			}
		}
        cardsDealt = 0;
    }

	public void shuffle() 
	{
		for (int i = deck.length - 1; i > 0; i--) 
		{
			int pos = (int)(Math.random() * (i + 1)); 
			Card temp = deck[i];
			deck[i] = deck[pos];
			deck[pos] = temp;
		}
		cardsDealt = 0;
	}

    public int left() 
	{
        return deck.length - cardsDealt;
    }

    public Card deal() 
	{
        if (cardsDealt == deck.length)
		{
			System.out.println("All cards have been dealt.");
		}
        else
		{
			cardsDealt++;
		}			
        
		return deck[cardsDealt - 1];
    }
}