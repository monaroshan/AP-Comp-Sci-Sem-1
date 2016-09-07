public class Lab_02
{
	public static void main(String[]args)
	{
		int num1 = 5;
		int num2 = 7;
		int answer = num1 * num2;
		
		System.out.println(num1 + " multiplied by " + num2 + " is " +" "+ answer);
		
		String name = "Mona Roshan";
		String address = "10758 Gallop Crest Court";
		String city = "San Diego,CA";
		String zip = "92130";
		
		System.out.println(name + "'s address is" +" "+ address +" "+ city +" "+ zip);
		
		int w = 3;
		int l = 5;
		int h = 7;
		int SurfaceArea = 2 * (w*l + l*h + w*h);
		
		System.out.println("The surface area of your rectangular cube is" +" "+ SurfaceArea);
		
	}
}