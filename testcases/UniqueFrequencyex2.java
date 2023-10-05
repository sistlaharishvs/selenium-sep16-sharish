package week3.testcases;



public class UniqueFrequencyex2 

{
	static boolean checkUniqueFrequency(int arr[], int n) 
	{
		
		int[] frequency = new int[n + 1];
		
		
		//checking frequency for if array contains duplicates
		for (int i = 1; i <= n; i++)
		{
	        for (int j = 0; j < n; j++) 
	        {
	            if (arr[j] == i) 
	            {
	                frequency[i - 1]++;
	            }
	        }
	    }
		
		//checking frequency for duplicates
		for (int i = 0; i < n; i++) 
		{
	        for (int j = 0; j < n; j++) 
	        {
	            if (i == j || frequency[i] == 0)
	                continue;
	            if (frequency[i] == frequency[j])
	            {
	 
	                return false;  //if duplicate return false
	            }
	        }
	    }
		
		
		return true;
		
			
	}

	
	
	public static void main(String[] args) 
	
	{
		int arr[] = {1,2};
	    int n = arr.length;
	    
	    boolean res = checkUniqueFrequency(arr, n);
	    
	    if(res) 
	    {
	    	System.out.println("True");
	    }
	    
	    else 
	    {
	    	System.out.println("False");
	    }
	    	

	}

}
