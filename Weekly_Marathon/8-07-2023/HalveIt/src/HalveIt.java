/*Problem Statement:
 *You are helping a friend in developing a financial app. The app has a feature 
 *where it calculates half of the entered amount for splitting bills. Your task is 
 *to write a function that takes a number and returns its half.*/


import java.util.Scanner;

public class HalveIt {
	public static double halveTheNumber(double num) {
		return num/2;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double num=scan.nextDouble();
		System.out.printf("%.2f",halveTheNumber(num));
		scan.close();
	}
	
	
}
