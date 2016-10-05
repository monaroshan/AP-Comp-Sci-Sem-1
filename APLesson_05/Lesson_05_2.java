public class Lesson_05_2
{
	public static void main(String[]args)
	{
		
		if(tOrf())
		{
			System.out.println("It is true!");
		}
		
		if(!tOrf())
		{
			System.out.println("It is false!");
		}
	}
	
	public static boolean tOrf()
	{
		return 8 >= 5;
	}
}