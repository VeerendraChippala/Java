/*  ---The Double Trouble ---
 * You are participating in a coding competition at your school. The challenge is to 
 * create a function that can double the value of any number provided. This function 
 * will help in the game design where scores need to be doubled under certain 
 * conditions.*/

import java.util.Scanner;

public class DoubleTrouble {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		int num=scan.nextInt();
		
		System.out.println(doubleTheNumber(num));
		scan.close();
	
	}

	public static int doubleTheNumber(int num){
	
		return num*2;
	
	}

}