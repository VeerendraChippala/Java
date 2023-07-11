/* ---Arithematic Operations---
 * You are a programmer in a school. The mathematics teacher has asked for your help 
 * to teach basic arithmetic operations to students. Your task is to create a set of 
 * functions that will do subtraction, multiplication, division, and find the 
 * remainder of two numbers. */

public class ArithmeticOperations {
	public static void main(String[] args)
	{
		int res1=subtractNumbers(20, 5);
		
		int res2=multiplyNumbers(4, 5);
		
		double res3=divideNumbers(22, 7);
		
		int res4=findRemainder(10, 3);
		
		System.out.println(res1);
		
		System.out.println(res2);
		
		System.out.printf("%.2f\n",res3);
		
		System.out.println(res4);
	
	}

	public static int subtractNumbers(int num1, int num2)
	
	{
	
		return num1-num2;
	
	}
	
	public static int multiplyNumbers(int num1, int num2)
	
	{
	
		return num1*num2;
	
	}
	
	public static double divideNumbers(int num1, int num2)
	
	{
	
		return num1/num2;
	
	}
	
	public static int findRemainder(int num1, int num2)
	
	{
	
		return num1%num2;
	
	}

}