//gita's is the new and improved version of this 


import java.util.Scanner;
public class HighLow
{
	public static void main(String[] args)
	{
		
		System.out.println("You will be playing a card game called HighLow. In HighLow, the user is randomly given the value");
		System.out.println("of a card and must predict whether the next card in the deck will have a value higher or lower than");
		System.out.println("the current card. If their prediction is incorrect, the user loses and the total number of points they");
		System.out.println("have accumulated is their final score.");
   }  // end main()
   

   /**
    * Lets the user play one game of HighLow, and returns the
    * user's score in that game.  The score is the number of
    * correct guesses that the user makes.
    */
   private static int game() 
   {
	  Scanner kb = new Scanner(System.in);
	  
      Deck deck = new Deck();  
      int rightguesses;
      Card currentcard;  
	  Card nextcard; 
      String guess; 
      deck.shuffle(); 
      rightguesses = 0;
      Card currentcard = deck.deal();
      System.out.println("The first card is " + currentcard);
	  
      while (true)
	  {  // Loop ends when user's prediction is wrong.
         
         /* Get the user's prediction, 'H' or 'L' (or 'h' or 'l'). */
         
         System.out.println("Enter high if you think the next card will be higher. ");
		 System.out.println("Enter low if you think the next card will be lower. ");
		 guess = kb.nextLine();
		 
         while (guess != "high" && guess != "low") 
		 {
            if (guess != "high" && guess != "low") 
			{
				System.out.println("Enter high or low plz. ");
			}
         } 
         
         // gets the next card and shows to user
         
         nextcard = deck.deal();
         System.out.println(nextcard + "is the next card.");
         
         // this checks the user's prediction.
         
         if (nextcard.pointValue() == currentcard.pointValue()) 
		 {
            System.out.println("Plot twist! The value was neither higher nor lower. It's a tie! You lose. Sucks to suck.");
            break;  // ends the game.
         }
		 
         else if (nextcard.pointValue() < currentcard.pointValue()) 
		 {
            if (guess == "low") 
			{
                System.out.println("You're right! YAS GIRL! You get a point");
                rightguesses++;
            }
            else 
			{
                System.out.println("NOPE SUCKA. BYE FELICIA!");
                break; 
            }
         }
         else 
		 {  
            if (guess == "high") 
			{
                System.out.println("YUPPERONI. What a player. DAMN SON. You get a point.");
                rightguesses++;
            }
            else 
			{
                System.out.println("Frankly, my dear, no. You lost. SAD. ");
                break; 
            }
         }
         
         /* To set up for the next iteration of the loop, the nextCard
            becomes the currentCard, since the currentCard has to be
            the card that the user sees, and the nextCard will be
            set to the next card in the deck after the user makes
            his prediction.  */
         
         currentcard = nextcard;
         System.out.println("Your current card is " + currentcard);
         
      } // end of while loop
      
      System.out.println("It's over! Now go get a life. ");
      System.out.println("You made " + rightguesses + " right guesses.");
      
      return rightguesses;
      
   }  // end play()
   

} 

	
	
	
	
	
	
