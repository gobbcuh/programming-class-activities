package javaFundamentals;

import java.util.Scanner;

public class IOandArithmeticPractice2 
{
	public static void main(String[] args) 
	{
		// Write a program that converts temperature from Celsius to Fahrenheit
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter temperature in Celcius: ");
		float numCelcius = s.nextFloat();
		
		float numFarenheit = (numCelcius * 9/5) + 32;
		
		System.out.println("Temperature in Farenheit: " + numFarenheit);
	}
}
