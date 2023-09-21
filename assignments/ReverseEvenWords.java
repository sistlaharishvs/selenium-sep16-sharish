package week1.day2.assignments;

public class ReverseEvenWords 

{

	
	
	
	public static String reverseWord(String str) 
	{
		
		String words[] = str.split("\\s");
		
		String reverseWord = "";
		
		for(String w:words) 
		
		{
		
			StringBuilder  sb = new StringBuilder(w);
		
			sb.reverse();
		
			reverseWord += sb.toString()+"";
		
		}
		
		return reverseWord.trim();
		
	}

	
}



