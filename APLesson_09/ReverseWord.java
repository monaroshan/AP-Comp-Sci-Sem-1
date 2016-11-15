import java.util.Scanner;
public class ReverseWord
{
	public static void main(String[]args)
	{
		String [] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		System.out.println("In order...");
		
		for(String word : words)
		{
			System.out.println(word);
		}
		
		System.out.println();
		System.out.println("Reversed...");
		reverse(words);
	}
	
	public static void reverse(String[] w)
	{
		for(int i = w.length-1; i>-1; i--)
		{
			System.out.println(w[i]);
		}
		
		
	}
}