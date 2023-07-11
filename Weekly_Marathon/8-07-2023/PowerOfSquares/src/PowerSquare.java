/*  -- The Power Of Squares --
 *You are a software developer at a gaming company. The company is developing a new 
 *game called "The Power of Squares". In this game, players have to square the 
 *number provided to advance to the next level. Your task is to create a function 
 *that will calculate the square of the number provided.*/

import java.util.Scanner;

public class PowerSquare {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int num=scan.nextInt();
		
		System.out.println(PowerSq.squareNumber(num));
		scan.close();
	}

}
class PowerSq{
	public static int squareNumber(int num) {
		return num*num;
	}
}
