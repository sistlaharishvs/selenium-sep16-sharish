package week3.day2.assigments;


import java.util.ArrayList;

public class FindIntersection

{

	public static void main(String[] args) 
	
	{
		
		//a) Declare An array for {3,2,11,4,6,7};
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		
		// b) Declare another array for {1,2,8,4,9,7};
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);
		
		//c) Declare for loop iterator from 0 to array length
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		
		for(int i=0; i <= list1.size()-1;i++) 
		{
			
			int value1 = list1.get(i);
			
			//d) Declare a nested for another array from 0 to array length
			for(int j=0;j<=list2.size()-1;j++) 
			{
				int value2 = list2.get(j);
				
				
				//e) Compare Both the arrays using a condition statement
				if(value1==value2) 
				{
					System.out.println(value2);
					list3.add(value2);
					
				}
			}
			
		//f) Print the first array (shoud match item in both arrays)	
		System.out.println("The Intersected values are: " +" " + list3 );	
		
		}
		
	}

}
