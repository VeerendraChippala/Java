/* ---The String joiner ---
 * You are creating a new social networking site. In one of the features, you have 
 * to combine the user's first name and last name to display the full name. Your 
 * task is to write a static method that will concatenate two strings.*/

import java.util.Scanner;

public class StringJoin {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		String str1=scan.next();
		
		String str2=scan.next();
		
		System.out.println(joinStrings(str1, str2));
		scan.close();
	
	}

	public static String joinStrings(String str1, String str2)
	
	{
	
		return str1+str2;
	
	}

}