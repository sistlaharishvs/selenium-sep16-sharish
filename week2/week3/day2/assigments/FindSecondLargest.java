package week3.day2.assigments;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class FindSecondLargest 

{

	public static void main(String[] args) 
	
	{
		
		// Here is the input
		int[] data = {3,2,11,4,6,7};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i < data.length; i++) 
		{
		
			list.add(data[i]);
			
		}
		
		System.out.println(list);
		
		
		//arranging the list in ascending order to find the send largest nuber in the list
		
		Collections.sort(list);
		
		System.out.println(list);
		
		//arranged now need to print the second largest
		
		int size = list.size();
		
		System.out.println(list.get(size-2));
		
		

	}

}
