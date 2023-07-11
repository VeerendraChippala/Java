/*Problem Statement:
 *You are part of a sports data management team. The team is developing a new 
 *feature for their application where the heights of players, currently recorded 
 *in inches, need to be displayed in feet for an international audience. Your task
 *is to create a method that takes a height given in inches and converts it into 
 *feet.*/

import java.util.Scanner;

public class HeightConverterApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double inches=scan.nextDouble();
		System.out.printf("%.2f",inches/12);
		scan.close();
	}
}
