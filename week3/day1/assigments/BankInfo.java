package week3.day1.assigments;

public class BankInfo extends AxisBank
{
	
	void savings() 
	{
		System.out.println("Savings Acount");
	}
	
	void fixed() 
	{ 
		System.out.println("Fixed");
	}
	
	void deposit() 
	{
		System.out.println("Fixed Deposit");
	}
	
	public static void main(String[] args) 
	
	{
		
			
			 AxisBank type = new AxisBank();
			 
			 type.deposit();
		
		
	}
	
}		
	class AxisBank  
	
	{
	void deposit() 
	{
		System.out.println("Current Deposit");
	}
		 

	}


