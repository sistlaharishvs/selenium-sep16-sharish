package week4.testcases;

public class FirstRepeatingex2 

{
	
	static char firstRepeating(String str) 
	
	{

	int n = str.length();
    
	char ans = ' ';
    
	int index = Integer.MAX_VALUE;
    
	for (int i = 0; i < n; i++) 
	
	{
    
		char temp = str.charAt(i);
 
      
      
		for (int j = i + 1; j < n; j++) 
      
		{
        
			if (str.charAt(j) == temp)
        
			{
 
          
          
				if (j < index) 
				{
            
					index = j;
            
					ans = str.charAt(j);
        
				}
				    
			}
      
		}
    
	}
    
	return ans;
  

	}

	
	public static void main(String[] args)
	{
		
		String str = "abcdd";
		
	    System.out.println(firstRepeating(str));
	
	}

}
