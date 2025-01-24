package javaFundamentals;

import java.util.Scanner;

public class IOandArithmeticPractice1 
{
	public static void main(String[] args) 
	{
		/* Write a program that asks the user to input two numbers and prints their 
		sum, difference, product, and quotient */
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		float firstNum = s.nextFloat();
		
		System.out.print("Enter second number: ");
		float secondNum = s.nextFloat();
		
		System.out.println();
		
		System.out.println("Sum: " + (firstNum + secondNum));
		System.out.println("Difference: " + (firstNum - secondNum));
		System.out.println("Product: " + (firstNum * secondNum));
		System.out.println("Quotient: " + (firstNum / secondNum));
	}
}
