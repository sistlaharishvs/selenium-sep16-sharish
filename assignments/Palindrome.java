package week1.day2.assignments;



public class Palindrome {

	public static void main(String[] args) {
		
			String new1 = "madam", reversenew1 = "";
			
			int new1length = new1.length();
			
			for(int i=(new1length-1); i >= 0; --i) 
			{
			reversenew1 = reversenew1 + new1.charAt(i);
			}
			
			if(new1.toLowerCase().equals(reversenew1.toLowerCase())) 
			{
            System.out.println(new1 + " is a Palindrome String");
			}
			else
			{
				System.out.println(new1+ " is not a Palindrome string");
			}
	}

}
