package practiceExercises;

import java.util.Scanner;

public class AGroceryStoreCalculator 
{
	public static void main(String[] args) 
	{
		/* Activity Title: "Grocery Store Calculator"
		   Instructions from module p. 32 */
		
		Scanner s = new Scanner(System.in);
		double price1, price2, price3, discountPrice = 0, totalCost = 0;
		
		System.out.println("\t---------------------------------");
		System.out.println("\t SIMPLE GROCERY STORE CALCULATOR");
		System.out.println("\t---------------------------------");
		
		System.out.print("\tEnter price of Item 1: ₱");
		price1 = s.nextDouble();
		System.out.print("\tEnter price of Item 2: ₱");
		price2 = s.nextDouble();
		System.out.print("\tEnter price of Item 3: ₱");
		price3 = s.nextDouble();
		
		System.out.println("\t---------------------------------");
		
		totalCost = price1 + price2 + price3;
		System.out.printf("\tTotal Cost : ₱%.2f\n", totalCost);
		
		if (totalCost > 500) 
		{
			discountPrice = totalCost - (totalCost * 0.10);
			System.out.printf("\tDiscounted Price : ₱%.2f", discountPrice);
		}
		else 
		{
			System.out.println("\tNot eligible for a discount.");
		}
	}
}
