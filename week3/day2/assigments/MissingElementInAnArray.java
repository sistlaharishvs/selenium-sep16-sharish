package week3.day2.assigments;

public class MissingElementInAnArray 

{

	public static void main(String[] args) 
	
	{
		//Hear is the input

		int[] arr = {1,2,3,4,7,6,8};
		
		int count = 1;
		
		for(int i=0; i <= arr.length - 1; i++) 
		{
			if(arr[i] != i + count) 
			{
				System.out.println(i +" " + count);
				count++;
			}
		}

	}

}
