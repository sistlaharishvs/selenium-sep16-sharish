package week3.day1.assigments;

public class ReverseEvenWords 

{
	public static String reverseWord(String str)
	{  
	   
		String words[]=str.split("\\s");  
	
		String reverseWord="";  
	    
		for(String w:words)
	    {  
	    
			StringBuilder sb=new StringBuilder(w);  
	        
			sb.reverse();  
	        
			reverseWord+=sb.toString()+" ";  
	    }  
	    
		return reverseWord.trim();  
	}  
	

	public static void main(String[] args) 
	
	{
		System.out.println(ReverseEvenWords.reverseWord("I am a software tester"));
		
		System.out.println(ReverseEvenWords.reverseWord("I ma a erawtfos retset"));
		
		
	}

}
