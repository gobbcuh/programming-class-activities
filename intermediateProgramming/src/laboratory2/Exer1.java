package laboratory2;

import java.util.Scanner;

public class Exer1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n\tEnter an integer number: ");
		int numberInput = s.nextInt();
		
		if (numberInput == 0)
		{
			System.out.println("\t" + numberInput + " is a zero value");
		}
		else if(numberInput > 0)
		{
			System.out.println("\t" + numberInput + " is a positive number");
		}
		else 
		{
			System.out.println("\t" + numberInput + "  is a negative number");
		}
	}
}
