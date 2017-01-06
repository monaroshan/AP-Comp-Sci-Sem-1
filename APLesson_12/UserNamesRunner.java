public class UserNamesRunner
{
	public static void main (String[]args)
	{
		APLesson12 object = new APLesson12("professor", "Professor", "Handsome");
		
		System.out.println("<<<<<<<<< USER INFO >>>>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + object.getLastName());
		System.out.println("User Name: " + object.getUserName());
		
		APLesson12 object1 = new APLesson12();
		
		System.out.println("<<<<<<<<< USER INFO >>>>>>>>>>");
		System.out.println("Name: " + object1.getFirstName() + object1.getLastName());
		System.out.println("User Name: " + object1.getUserName());
		
		object.setUserName("pHandsome");
		System.out.println("<<<<<<<<< USER INFO >>>>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + object.getLastName());
		System.out.println("User Name: " + object.getUserName());
	}
}