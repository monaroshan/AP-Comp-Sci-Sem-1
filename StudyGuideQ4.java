public class StudyGuideQ4
{
	public static void main(String[]args)
	{
		int count = 0;
		for (int i = 0; i <arr1.length; i++)
			if (arr1[i] != 0)
			{
				arr1[count] = arr1[i];
				count++;
			}
		int[] arr2 = new int[count];


		for(int i = 0; i < count; i++)
			arr2[i] = arr1[i];
	}
}