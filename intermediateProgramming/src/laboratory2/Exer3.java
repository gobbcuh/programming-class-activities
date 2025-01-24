package laboratory2;

import java.util.Scanner;

public class Exer3 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n\tSam's Age: ");
		int ageSam = s.nextInt();
		
		System.out.print("\tSan's Age: ");
		int ageSan = s.nextInt();
		
		System.out.print("\tNei's Age: ");
		int ageNei = s.nextInt();
		
		if (ageSam < 1 || ageSan < 1 || ageNei < 1)
		{
			System.out.println("\n\tInvalid age number");
		}
		else 
		{
			if (ageSam == ageSan && ageSan == ageNei)
			{
				System.out.println("\n\tAll of their ages are equal");
			}
			else if (ageSam == ageSan)
			{
				if (ageSam > ageNei) 
				{
					System.out.println("\n\tNei is the youngest");
				}
				else 
				{
					System.out.println("\n\tSam and San is the youngest");
				}
			}
			else if (ageSam == ageNei)
			{
				if (ageSam > ageSan) 
				{
					System.out.println("\n\tSan is the youngest");
				}
				else 
				{
					System.out.println("\n\tSam and Nei is the youngest");
				}
			}
			else if (ageSan == ageNei)
			{
				if (ageSan > ageSam) 
				{
					System.out.println("\n\tSam is the youngest");
				}
				else 
				{
					System.out.println("\n\tSan and Nei is the youngest");
				}
			}
			else if (ageSam > ageSan)
			{
				if (ageSan > ageNei) 
				{
					System.out.println("\n\tNei is the youngest");
				}
				else 
				{
					if (ageNei > ageSam) 
					{
						System.out.println("\n\tSan is the youngest");
					}
					else 
					{
						System.out.println("\n\tSan is the youngest");
					}
				}
			}
			else if (ageSam > ageNei)
			{
				System.out.println("\n\tNei is the youngest");
			}
			else
			{
				if (ageSan > ageNei) 
				{
					System.out.println("\n\tSam is the youngest");
				}
				else 
				{
					System.out.println("\n\tSam is the youngest");
				}
			}	
		}	
		
	}
}