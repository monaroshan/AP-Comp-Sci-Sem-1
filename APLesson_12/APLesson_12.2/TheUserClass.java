public class TheUserClass
{
	private String firstName;
	private String lastName;
	private String avatar;
	private int userID;

	public TheUserClass()
	{
		//default values for instance vars
		firstName = "";
		lastName = "";
		avatar = "";
		userID = 0; 
	}
	
	//Modifier
	public void setAvatar(String av)
	{
		avatar = av;
	}
	
	public TheUserClass(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public TheUserClass(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstName +
                           "\nLast Name: " + lastName +
                           "\nAvatar: " + avatar +
                           "\nUser ID#: " + userID;
	}
	
}