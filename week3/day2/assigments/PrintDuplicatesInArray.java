package week3.day2.assigments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray 

{

	public static void main(String[] args) 
	
	{
		//int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		//Declaration of emapty List 
		
		List<Integer> list = new ArrayList<Integer>();
		
		//declaration of Array elements to the List
		
		list.add(14);
		list.add(12);
		list.add(13);
		list.add(11);
		list.add(15);
		list.add(14);
		list.add(18);
		list.add(16);
		list.add(17);
		list.add(19);
		list.add(18);
		list.add(17);
		list.add(20);
		
		//sorting of list
		Collections.sort(list);
		
		Set<Integer> s = new HashSet<Integer>();
		
		for(Integer dup : list) 
		{
		   if(s.add(dup) == false) 
		   {
			   System.out.println(dup + " " + "is the duplicate value");
		   }
		}
		
		

	}

}
