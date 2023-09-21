package week1.day1.assignments;



public class CheckIfTheNumberIsPositiveOrNegative {


	static void chechnumber(int num) {
		
		if(num > 0)
			
			System.out.println(num + " is Positive Number");
		
		else if(num<0)
			
			System.out.println(num + " is a Negative Number");
		
		else
			
			System.out.println(num + " is a Zero");
		
	}
	
	
	public static void main(String[] args) {
		
		
int num1 = 40;
int num2 = -60;
int num3 = 0;
int num4 = 4 * -10;
int num5 = 6 * 10;
int num6 = 8 * 0;


chechnumber(num1);
chechnumber(num2);
chechnumber(num3);
chechnumber(num4);
chechnumber(num5);
chechnumber(num6);



	}

}
