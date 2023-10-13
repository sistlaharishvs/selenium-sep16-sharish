
package week4.testcases;

public class NumberofJewelsInStones 

{
	
	
	public static int numJewelsInStones(String jewels, String stones) 
	{

		int k = 0;
	    
	    for(int i=0; i < stones.length(); i++ ) 
	    {
	    	for(int j = 0; j < jewels.length(); j++) 
	    	{
	    		if(stones.charAt(i) == jewels.charAt(j)) 
	    		{
	    			k++;
	    		}
	    	}
	    }

		
		return k;
	
	}
	
	public static void main(String[] args) 
	
	{
		String jewels = "aA";
	    String stones = "aAAbbbb";
	    
	    System.out.println(numJewelsInStones(jewels, stones));
	    
	    
	}

}
