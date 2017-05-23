public class HighLow
{
	public static void main(String[] args)
	{
		System.out.println("You will be playing a card game called HighLow. In HighLow, the user is randomly given the value");
		System.out.println("of a card and must predict whether the next card in the deck will have a value higher or lower than");
		System.out.println("the current card. If their prediction is incorrect, the user loses and the total number of points they");
		System.out.println("have accumulated is their final score.");
		
		//int plays = 0;     // Number of games user has played.
		//int ScoreSum = 0;     // The sum of all the scores from 
                               //      all the games played.
		/* double AvgScore;  */    // Average score, computed by dividing
                               //      sumOfScores by gamesPlayed.
		/* boolean OneMore;    */    // Record user's response when user is 
                               //   asked whether he wants to play 
                               //   another game.
		
		/* int onescore; 
		
		while (OneMore)
		{
			// Score for one game.
			onescore = game();   // Play the game and get the score.
			ScoreSum += onescore;
			plays++;
			System.out.print("Do you want to play one more time?" );
			OneMore = TextIO.getlnBoolean();
		} 
	
      
      AvgScore = ((double)sumOfScores) / plays;
      
      System.out.println();
      System.out.println(plays + "games were played");
      System.out.println("Your average score is " + AvgScore); */
   
   }  // end main()
   

   /**
    * Lets the user play one game of HighLow, and returns the
    * user's score in that game.  The score is the number of
    * correct guesses that the user makes.
    */
   private static int game() 
   {
   
      Deck deck = new Deck();  
      int rightguesses;
      Card currentcard;  
	  Card nextcard; 
      String guess; 
      deck.shuffle(); 
      rightguesses = 0;
      Card firstcard = deck.deal();
      System.out.println("The first card is " + firstcard);
	  
      while (true)
	  {  // Loop ends when user's prediction is wrong.
         
         /* Get the user's prediction, 'H' or 'L' (or 'h' or 'l'). */
         
         System.out.println("Enter high if you think the next card will be higher. ");
		 System.out.println("Enter low if you think the next card will be lower. ");
		 guess = kb.nextLine;
		 
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
         
         if (nextcard.getpointValue() == currentcard.getpointValue()) 
		 {
            System.out.println("Plot twist! The value was neither higher nor lower. It's a tie! You lose. Sucks to suck.");
            break;  // ends the game.
         }
		 
         else if (nextcard.getpointValue() < currentcard.getValue()) 
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
   

} // end class HighLow

	
	
	
	
	
	
