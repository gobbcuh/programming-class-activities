package laboratory2;

import java.util.Scanner;

public class Exer2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n\tEnter anything of your choice: ");
		char input = s.next().charAt(0);
		
		if ((input >= 97 && input <= 122) || (input >= 65 && input <= 90))
	    {
			System.out.println("\tThe character is an alphabet");
	    }
	    else if (input >= 48 && input <= 57)
	    {
	    	System.out.println("\tThe character is a number");
	    }
	    else
	    {
	    	System.out.println("\tThe character is a symbol");
	    }
	}
}
