package laboratory2;

import java.util.Scanner;

public class Exer4 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("\n\t------------ NUMBERS ASCENDER ------------\n");
		System.out.print("\tEnter three integer numbers: ");
		int inputOne = s.nextInt();
		int inputTwo = s.nextInt();
		int inputThree = s.nextInt();
		
		if (inputOne == inputTwo && inputTwo == inputThree)
		{
			System.out.println("\tAll numbers are equal");
		}
		else if (inputOne == inputTwo)
		{
			if (inputOne > inputThree) 
			{
				System.out.println("\tNumbers in ascending order: " + inputThree + " " + inputOne + " " + inputTwo);
			}
			else 
			{
				System.out.println("\tNumbers in ascending order: " + inputOne + " " + inputTwo + " " + inputThree);
			}
		}
		else if (inputOne == inputThree)
		{
			if (inputOne > inputTwo) 
			{
				System.out.println("\tNumbers in ascending order: " + inputTwo + " " + inputOne + " " + inputThree);
			}
			else 
			{
				System.out.println("\tNumbers in ascending order: " + inputOne + " " + inputThree + " " + inputTwo);
			}
		}
		else if (inputTwo == inputThree)
		{
			if (inputTwo > inputOne) 
			{
				System.out.println("\tNumbers in ascending order: " + inputOne + " " + inputTwo + " " + inputThree);
			}
			else 
			{
				System.out.println("\tNumbers in ascending order: " + inputTwo + " " + inputThree + " " + inputOne);
			}
		}
		else if (inputOne > inputTwo)
		{
			if (inputTwo > inputThree) 
			{
				System.out.println("\tNumbers in ascending order: " + inputThree + " " + inputTwo + " " + inputOne);
			}
			else 
			{
				if (inputThree > inputOne) 
				{
					System.out.println("\tNumbers in ascending order: " + inputTwo + " " + inputOne + " " + inputThree);
				}
				else 
				{
					System.out.println("\tNumbers in ascending order: " + inputTwo + " " + inputThree + " " + inputOne);
				}
			}
		}
		else if (inputOne > inputThree)
		{
			System.out.println("\tNumbers in ascending order: " + inputThree + " " + inputOne + " " + inputTwo);
		}
		else
		{
			if (inputTwo > inputThree) 
			{
				System.out.println("\tNumbers in ascending order: " + inputOne + " " + inputThree + " " + inputTwo);
			}
			else 
			{
					System.out.println("\tNumbers in ascending order: " + inputOne + " " + inputTwo + " " + inputThree);
			}
		}	
	}
}
