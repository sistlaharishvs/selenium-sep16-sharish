package week1.day2.optionalassigments;

public class ReverseCharacterPseudocode {

	public static void main(String[] args) 
	
	{
	
		String input = "de12ef35777777yu";

		System.out.println(reverseString(input.toCharArray()));
		
	}


	public static String reverseString(char[] charArray) 
	{
	
		if(charArray == null) return" ";
		
		if(charArray.length == 1) return new String(charArray);
		
		int start = 0;
		
		int end = charArray.length -1;
		
		while(start < end)  
		{
			char ch = charArray[start];
			
			charArray[start] = charArray[end];
			
			charArray[end] = ch;
			
			start++;
			
			end--;
			
		}
				
		
		return new String(charArray);
		
	}

}
