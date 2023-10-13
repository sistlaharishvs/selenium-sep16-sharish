package week4.testcases;

public class NumberofJewelsInStoneex2 
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
		String jewels = "z";
	    String stones = "ZZ";
	    
	    System.out.println(numJewelsInStones(jewels, stones));

	}

}
