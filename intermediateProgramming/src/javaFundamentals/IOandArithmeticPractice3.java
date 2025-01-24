package javaFundamentals;

import java.util.Scanner;
import java.lang.Math;

public class IOandArithmeticPractice3 
{
	public static void main(String[] args) 
	{
		// Write a program that calculates compound interest
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter principal amount: ");
		double principalAmount = s.nextFloat();
		
		System.out.print("Enter annual interest rate (in %): ");
		double annualRate = s.nextFloat();
		
		System.out.print("Enter time (in years): ");
		int years = s.nextInt();	// (Math.pow(a, b)
		
		System.out.print("Enter number of times interest is compounded per year: ");
		int compoundTimes = s.nextInt();
		
		double compoundInterest = principalAmount * Math.pow(1 + ((annualRate / 100) / compoundTimes), compoundTimes * years);
		
		System.out.println();
		System.out.println("Final Amount: " + compoundInterest);
	}
}
