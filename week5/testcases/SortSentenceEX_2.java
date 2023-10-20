package week5.testcases;

public class SortSentenceEX_2 

{

	public static void main(String[] args) 
	
	{

		String s = "Myself2 Me1 I4 and3";
		
		String[] words = s.split(" ");
		
		String[] ans = new String[words.length];
		
		for(String w : words) 
		{
			
			int i = w.charAt(w.length()-1) - '1';
			
			ans[i] = w.substring(0,w.length() - 1);
					
		}
		
		String x = String.join(" ", ans);
		
		System.out.println("The converted String is : " + x );


	}

}
