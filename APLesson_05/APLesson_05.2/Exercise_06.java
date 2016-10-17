import java.util.Scanner;
public class Exercise_06
{
	static Scanner kb;
	static String username = "monaroshan";
	static String password = "mona";
	
	public static void main(String[]args)
	{
		 kb = new Scanner(System.in);
		 passCheck();
	}
	public static void passCheck()
	{
		System.out.println("Enter your username. ");
		String user = kb.next();
		kb.nextLine();
		
		System.out.println("Enter your password. ");
		String pass = kb.next();
		kb.nextLine();
		
		if(user.equals(username) && pass.equals(password))
		{
			System.out.println("You are granted access! ");
				
		}
		else
		{
			if(user.equals(username))
				System.out.print("Your password is incorrect!");	
			else if(pass.equals(password))
				System.out.print("Your username is incorrect!");
			else 
				System.out.println("Your username and password are incorrect!");
			passCheck();
		}
	}
}