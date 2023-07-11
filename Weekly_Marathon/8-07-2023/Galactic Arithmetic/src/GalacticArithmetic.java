/*   ---Galactic Arthimatic---
 * In a far-off galaxy named Arithmetica, beings have been using a newly discovered 
 * number system to make their life easier. However, they are facing difficulties 
 * in performing basic arithmetic operations. As the resident genius of planet Earth, 
 * you have been called upon to help them. Your first task is to build a function 
 * that will be able to add two numbers in their number system*/

import java.util.Scanner;

public class GalacticArithmetic {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		long m=scan.nextLong();
		System.out.println(galacticArithmetic(n, m));
		scan.close();
	}
	public static long galacticArithmetic(long n,long m) {
		return n+m;
	}
}
