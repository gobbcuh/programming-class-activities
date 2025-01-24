package laboratory1;

import java.util.Scanner;

public class Exer1 
{
	public static void main(String[] args) 
	{
		// Create a program that will allow the user to enter a number & print that number
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		float number = s.nextFloat();
		
		System.out.println("Your Number: " + number);
	}
}
