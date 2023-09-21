package week1.day2.optionalassigments;

public class SumOfDigitsFromString

{

	public static void main(String[] args) 

	{
	
		String str = "Tes12Le79af65";
		
		int sum=0;
		
		for(int i=0; i < str.length(); i++) 
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9') 
			{
				
				sum+=(str.charAt(i)-'0');
				
			}
		}
		
		System.out.println("Sum of all Digits : " + sum);

	}

}
