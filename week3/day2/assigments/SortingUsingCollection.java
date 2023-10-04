package week3.day2.assigments;

import java.util.*;

public class SortingUsingCollection 
{

	public static void main(String[] args)
	{
		
		
		//Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("HCL");
		al.add("Wipro");
		al.add("Aspire Systems");
		al.add("CTS");
		
		
		
		//// sort the array
		Collections.sort(al);
		Collections.sort(al,Collections.reverseOrder());  
        
		// Iterate it in the reverse order

		Iterator i=al.iterator();  
        
		
		// print the array
		while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  

	}
	
}

