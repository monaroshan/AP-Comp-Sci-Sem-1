import java.util.Scanner;
public class UserClassRunner
{
	public static void main(String[]args)
		{
			Scanner kb = new Scanner(System.in);
			TheUserClass object;
			System.out.println("What is your first name?");
			String firstName = kb.next();
			System.out.println("What is your last name?");
			String lastName = kb.next();
			System.out.println("Would you like to use a public avatar? Y or N?");
			String YorN = kb.next();
			if (YorN.equals("N"))
			{
				object = new TheUserClass(firstName,lastName);
				System.out.println(object);
			}
			else
			{
				System.out.println("What is your avatar?");
				String avatar = kb.next();
				object = new TheUserClass(firstName,lastName, avatar);
				System.out.println(object);
			}
			
			object.setAvatar("ProfHansizzle");
			System.out.println(object);
		
		}
}