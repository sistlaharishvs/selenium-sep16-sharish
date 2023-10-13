
package week4.testcases;


public class CheckUniqueFrequencyex1 

{
	static boolean checkUniqueFrequency(int arr[], int n)
	{
	 
	    int[] frequency = new int[n + 1];
	 
	    
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
	    
	    for(int i = 0; i < n; i++)
	    
	    {
	    
	    	for (int j = 0; j < n; j++) 
	        
	    	{
	            if (i == j || frequency[i] == 0)
	        
	            	continue;
	            
	            if (frequency[i] == frequency[j]) 
	            
	            {
	 
	                return false;
	            }
	        }
	    }
	 
	    
	    return true;
	}
	
	
	public static void main(String[] args) 
	
	{
		
		int arr[] = {1,2,2,1,1,3};
		
	    int n = arr.length;
	 
	    
	    boolean res = checkUniqueFrequency(arr, n);
	 
	    
	    if (res)
	        System.out.println("True");
	    else
	        System.out.println("False");
	    }
		
}
