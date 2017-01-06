//Default Constructor
public class APLesson12
{
	//instance variation
	private String userName, firstName, lastName;
	
	//Default Constructor 
	public APLesson12()
	{
		//default values for instance vars
		userName = "";
		firstName = "";
		lastName = "";
	}
	//Constructor with parameters
	public APLesson12(String uName, String fName, String lName)
	{
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	//Modifier
	public void setUserName(String uName)
	{
		userName = uName;
	}
	
	//Accessors 
	public String getUserName()
	{
		return userName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	
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