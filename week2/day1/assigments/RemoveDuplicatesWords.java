package week3.day1.assigments;

import java.util.*;

public class RemoveDuplicatesWords 

{
	
	static void removeDupWord(String str)
	{
		
		// To split string around spaces.
		StringTokenizer st = new StringTokenizer(str);
		
		// To store individual visited words
		Set<String> hsh = new HashSet<>();
		
		// Traverse through all words
		while (st.hasMoreTokens()) 
		{
		
			String word = st.nextToken();
			
			
			// If current word is not seen before.
			while (!hsh.contains(word)) 
			{
		    
				System.out.print(word + " ");
		        
				hsh.add(word);
		      
			}
		    
		}
		
	}

	

	public static void main(String[] args) 
	
	{
	

		String text = "We learn java basics as part of java sessions in java week1";
		
		removeDupWord(text);
		

	}

}
