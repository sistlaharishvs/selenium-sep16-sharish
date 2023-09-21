package week1.day2.assignments;

import java.nio.ShortBuffer;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test1 = "changeme";
		StringBuffer test2 = new StringBuffer(test1);
		
		for(int i = 0; i < test1.length(); i++) {
	
			if(Character.isLowerCase(test1.charAt(i))) 
			{
		
				test2.setCharAt(i, Character.toUpperCase(test1.charAt(i)) );
								
			}
			
			else if(Character.isUpperCase(test1.charAt(i)) ) 
			{
				test2.setCharAt(i,Character.toLowerCase(test1.charAt(i)));
			}
		
	}

		System.out.println("Odd index after case conversion :" + test2);
	}	
}