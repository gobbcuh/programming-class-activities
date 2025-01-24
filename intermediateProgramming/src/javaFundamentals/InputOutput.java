package javaFundamentals;

import java.util.Scanner;

public class InputOutput 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter first grade: ");
		float gradeOne = s.nextFloat();
		
		System.out.print("Enter second grade: ");
		float gradeTwo = s.nextFloat();
		
		System.out.print("Enter third grade: ");
		float gradeThree = s.nextFloat();
		
		float average = (gradeOne + gradeTwo + gradeThree) / 3;
		
		System.out.println();
		System.out.println("Average: " + average);

	}

}
