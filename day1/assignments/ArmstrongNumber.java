package week1.day1.assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int number = 153, orginalnumber, remainder, result=0;
		orginalnumber = number;
		while(orginalnumber !=0)
		
		{ 
			remainder = orginalnumber % 10;
			result += Math.pow(remainder,3);
			orginalnumber /= 10;
		}
		
		if(result == number)
	      
			System.out.println(number + " is an ArmstrongNumber");
		
		else
			
			System.out.println(number + " is not an ArmstrongNumber");
	

	}

}
