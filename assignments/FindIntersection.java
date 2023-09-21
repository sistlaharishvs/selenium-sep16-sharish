package week1.day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] arr1 = {3,2,11,4,6,7};
		
		int[] arr2 = {1,2,8,4,9,7};
		
		int m = arr1.length;
		
		int n = arr2.length;
		
	System.out.println(" Union of two arrays : ");
		
	PrintUnion(arr1,arr2,m,n);
	
		
		
	}
	
	private static void PrintUnion(int[] arr1, int[] arr2, int m,int n) 
	
	{
	
    int i=0,j=0;
	
    while(i < m && j < n) 
	
    {
	
    if(arr1[i] < arr2[j]) {
	System.out.println(arr1[i++] + " ");
	
    }

	else if(arr1[i] > arr2[j]) 
	{
	  System.out.println(arr2[j++] + " ");
	}
	else
	{
	  System.out.println(arr1[i++] + " ");	
	  j++;
	  
	}
	
	 
	while(i<m) 
	{
      System.out.println(arr1[i++] + " ");    
	}
	while(j<m) 
	{
	   System.out.println(arr2[j++] + " ");	
	}
    
    }
	}
}

	
	

	