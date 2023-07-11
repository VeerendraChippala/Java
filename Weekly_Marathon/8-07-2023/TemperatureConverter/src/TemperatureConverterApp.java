/*  -- The Temperature Converter --
 *You are working as a software developer at a weather forecasting company. The 
 *company is developing a new feature for their app that allows users to convert 
 *temperatures from Fahrenheit to Celsius. Your task is to create a method that 
 *takes a temperature in Fahrenheit and converts it to Celsius.*/

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter temp in F");
		double f=scan.nextDouble();
		TemperatureConverter temperatureConverter=new TemperatureConverter();
		System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(f));
		scan.close();
	}

}
class TemperatureConverter {

	public double convertFahrenheitToCelsius(double fahrenheit)
	
	{
	
		return (fahrenheit - 32) * 5/9;
	
	}

}