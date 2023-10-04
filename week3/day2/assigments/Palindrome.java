package week3.day2.assigments;

import java.util.*;

public class Palindrome 

{

	public static void main(String[] args) 
	
	{
		
		String original = "madam", reverse = "";
		
		Scanner in = new Scanner(original); 
		
		original = in.nextLine();
		
		int length = original.length();
		
		for( int i = length -1; i >= 0;i--) 
		
			reverse = reverse + original.charAt(i);
			
			if(original.equals(reverse)) 
			{
				System.out.println("The string is a palindrome.");
			}
			
			else 
			{
				System.out.println("The string isn't a palindrome.");
			}
		

	}

}
