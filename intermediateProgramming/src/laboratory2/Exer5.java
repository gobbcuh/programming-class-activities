package laboratory2;

import java.util.Scanner;

public class Exer5 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n\tNumber of late days borrowed: ");
		int borrowDays = s.nextInt();
		
		if (borrowDays > 30) 
		{
			System.out.println("\tSorry, your membership is cancelled due to being late for more than a month.");
		}
		else if (borrowDays > 10 && borrowDays <= 30) 
		{
			System.out.println("\tMore than 10 days late.\n\tYou have a fine of: 5 rupees");
		}
		else if (borrowDays >= 6 && borrowDays <= 10)
		{
			System.out.println("\t6 to 10 days late.\n\tYou have a fine of: 1 rupee");
		}
		else if (borrowDays >= 1 && borrowDays < 6) 
		{
			System.out.println("\t1 to 5 days late.\n\tYou have a fine of: 50 paise");
		}
		else 
		{
			System.out.println("\tNo fine. Thank you.");
		}
	}
}
