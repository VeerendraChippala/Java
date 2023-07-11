/*Problem Statement:
 * You are developing a time tracking application for a company. The employees log 
 * their time in minutes. The management wants to see these durations in hours for
 * better understanding. Your task is to write a function that can convert minutes
 * into hours.*/
import java.util.Scanner;

public class TimeConverter {
	public static double convertToHours(int minutes) {
		return (double)minutes/60;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(convertToHours(num));
		scan.close();
	}
}
