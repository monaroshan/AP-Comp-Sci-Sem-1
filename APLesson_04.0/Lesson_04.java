public class Lesson_04
{
	public static void main(String[]args)
	{
		Lesson_04 form = new Lesson_04();
		
		System.out.printf("%10s  %10.2f", "test", 4564.553);
		System.out.printf("\n%10s  %10.2f", "thisexam", 989878.00);
		
		String word1 = "blaah";
		double number1 = 4564.553;
		
		form.format(word1, number1);
		
		String word2= "yessss";
		double number2 = 524782.75278;
		form.format(word2, number2);
	
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s  %10.2f", word, number);
	}
}