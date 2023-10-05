package week3.testcases;

public class Aletterapperstwiseexample2 

{
	
	public static char repetedcharacter(String s) 
	{
		
		int[] cnt = new int[26];
		
		for(int i=0;;++i) 
		{
			char c = s.charAt(i);
			
			if(++cnt[c-'a'] == 2) 
			{
				return c;
			}
            
		}
		
	
	}

	public static void main(String[] args) 
	{
		String info = "abcdd";
		
		System.out.println(repetedcharacter(info));


	}

}
