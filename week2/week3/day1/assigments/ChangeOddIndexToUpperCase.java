package week3.day1.assigments;

import java.util.Scanner;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) 
	
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String to be changed :");
		
		String str =  sc.nextLine();
		
		str =  str.toLowerCase();
		
		char[] ch = str.toCharArray();
		
		for(int i=0; i < ch.length; i = i+2 ) 

		{
			
			ch[i] = Character.toUpperCase(ch[i]);
						
		}
		
		
		System.out.println("String after conversion : " + new String(ch) );

	}

}
