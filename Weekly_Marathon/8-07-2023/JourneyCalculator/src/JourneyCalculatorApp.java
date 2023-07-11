/* The Journey Calculator 
 *You are a developer at a transportation company. The company is developing a new 
 *app that helps users track their journey. One of the features of the app is to 
 *calculate the distance travelled given the speed and time of the journey. Your 
 *task is to create a method that takes speed and time and returns the distance 
 *travelled. This method should be a non-static method and should be implemented 
 *inside a class named JourneyCalculator.*/
import java.util.Scanner;

public class JourneyCalculatorApp {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter speed and time as realnumbers");
		
		double speed=scan.nextDouble();
		
		double time=scan.nextDouble();
		
		JourneyCalculator journeyCalculator=new JourneyCalculator();
		
		System.out.printf("%.2f",journeyCalculator.calculateDistance(speed,time));
		scan.close();
	
	}
}
class JourneyCalculator {

	public double calculateDistance(double speed, double time)
	
	{
	
		return speed*time;
	
	}

}