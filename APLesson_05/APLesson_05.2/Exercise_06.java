import java.util.Scanner;
public class Exercise_06
{
	static Scanner kb;
	static username = monaroshan
	static password = password
	
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
		
		if(user.equals(username))
		{
			if(pass.equals(password))
				System.out.println("You are granted access! ");
			else if (pass != )
				System.out.println("Wrong!");
		}
		else
		{
			System.out.println("!");
			passCheck();
		}
	}
}