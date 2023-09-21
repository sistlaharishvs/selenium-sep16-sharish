package week1.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates 

{

	public static void main(String[] args) 
	
	{
		
    String inputstring = "We learn java basics as part of java sessions in java week1.";
    
	String result = removeduplicatewordes(inputstring);
	
	System.out.println("String after removing duplicate words : " + result);

	}

	private static String removeduplicatewordes(String inputstring) {
		
		String[] words = inputstring.split("\\s+");
		
		Set<String> uniquewords = new HashSet<>();
		
		StringBuilder resultBuilder = new StringBuilder();
		
		for(String word : words) 
		
		{
		
			if(uniquewords.add(word)) 
		
			{
		
				resultBuilder.append(word).append("");
		
			}
		
		}
		
		String result = resultBuilder.toString().trim();
				
		return result;
	}

}
