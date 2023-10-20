package week5.testcases;

public class MostWordsFoundEX_1 

{
	
	public static void main(String[] args) 
	
	{
		
		String sentences [] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		
		int tot = 0;
		
		for(int i=0 ; i < sentences.length; i++ ) 
		{
			int templen = sentences[i].split(" ").length;
			
			if(templen > tot) 
			{
				tot = templen;
				
			}
			
						
		}
			
		System.out.println("The Maximum number of words in the sentences are : "+tot);
			
		
	}
		

}


