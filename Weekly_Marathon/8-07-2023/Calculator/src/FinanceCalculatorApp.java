/*Problem Statement:
 * You are a software developer at a financial technology company. The company is 
 * building a new feature in their app that calculates the simple interest for 
 * users wanting to take out loans. Your task is to create a method that calculates
 *  the simple interest given the principal amount, rate of interest, and time.*/

import java.util.Scanner;

public class FinanceCalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double principal=scan.nextDouble();
		double rate=scan.nextDouble();
		double time=scan.nextDouble();
		System.out.printf("%.2f",principal*rate*time);
		scan.close();
	}
}
