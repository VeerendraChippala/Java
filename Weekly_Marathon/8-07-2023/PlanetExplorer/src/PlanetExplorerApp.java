/*Problem Statement:
 *You are a scientist at a space research center. The center is currently 
 *researching various planets and their properties. One of the properties they are 
 *interested in is the surface area of these planets. Considering that a planet can 
 *be approximated as a sphere, your task is to create a method that calculates the 
 *surface area of a sphere given its radius.*/

import java.util.Scanner;

public class PlanetExplorerApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double rad=scan.nextDouble();
		System.out.printf("%.2f",4*3.14172*rad*rad);
		scan.close();
	}
}
