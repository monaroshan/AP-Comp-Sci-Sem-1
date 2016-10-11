import java.util.Scanner;
public class GPACalc
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your math grade:");
		String math = kb.next();
		
		System.out.println("Enter your Chemistry grade:");
		String chem = kb.next();
		
		System.out.println("Enter your Comp Sci grade: ");
		String comp = kb.next();
		
		System.out.println("Enter your history grade: ");
		String history = kb.next();
		
		System.out.println("Enter your Physics grade");
		String physics = kb.next();
		
		System.out.println("Enter your Marketing grade" );
		String marketing = kb.next();
		
		System.out.println("Enter your English grade" );
		String english = kb.next();
		
		double gPoints = calcPoints(math) + calcPoints(chem) + calcPoints(comp) + calcPoints(history) + calcPoints(physics) + calcPoints(marketing) + calcPoints(english);
		double GPA = gPoints / 7;
		
		System.out.println("Your GPA is " + GPA);
		
		}
	
	public static double calcPoints(String grade)
	{
		double points = 0.0;
		if (grade.equals("A"))
			points = 4.0;
		if (grade.equals("B"))
			points = 3.0;
		if (grade.equals("C"))
			points = 2.0;
		if (grade.equals("D"))
			points = 1.0;
		if (grade.equals("F"))
			points = 0.0;
		return points;
	}	
}