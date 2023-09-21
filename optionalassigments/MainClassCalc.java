package week1.day2.optionalassigments;

import java.util.Scanner;

public class MainClassCalc {

	public static void main(String[] args) 
	
	{
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		
		int firstnumber = scan.nextInt();
		
		System.out.println("Enter Second Number : ");

		int secondnumber = scan.nextInt();
		
		CalculatorVO calVO = new CalculatorVO();
		
		calVO.setFirstNumber(firstnumber);
		
		calVO.setSecondNumber(secondnumber);
		
		Calculation cal = new Calculation();
		
		int addResult = cal.add(calVO.getFirstNumber(),calVO.getSecondNumber());
		
		System.out.println("Addition Result : " + addResult);
		
		int subResult = cal.substract(calVO.getFirstNumber(),calVO.getSecondNumber());
		
		System.out.println("Subtraction Result : " + subResult);
		
		int mulResult = cal.multiply(calVO.getFirstNumber(),calVO.getSecondNumber());
		
		System.out.println("Multipllication Result : " + mulResult);

		float divResult = cal.divide(calVO.getFirstNumber(),calVO.getSecondNumber());
		
		System.out.println("Division Result : " + divResult);
	
	}

}
