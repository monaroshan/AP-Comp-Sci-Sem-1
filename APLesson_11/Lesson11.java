public class Lesson11
{
	public static void main(String[]args)
	{
		int[][]values = new int [4][4];
		values [0][0] = 1;
		values [1][1] = 2;
		values [2][2] = 3;
		values [3][3] = 4; 
		
		//print out the array
		for(int i = 0; i< values.length; i++)
		{
			for(int j = 0; j < values.length; j++)
			{
				System.out.print(values[i][j]);
			}
			System.out.println();
		}
	}
}