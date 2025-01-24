package laboratory2;

import java.util.Scanner;

public class Exer2Version2
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("\n\tEnter a single character: ");
        String input = s.nextLine();

        if (input.length() == 1) 
        {
            char character = input.charAt(0);

            if (character >= '0' && character <= '9') 
            {
                System.out.println("\tThe character is a number");
            } 
            else if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) 
            {
                System.out.println("\tThe character is an alphabet");
            } 
            else 
            {
                System.out.println("\tThe character is a symbol");
            }
        } 
        else if (input.length() == 2 && input.charAt(0) == '-' && input.charAt(1) >= '0' && input.charAt(1) <= '9') 
        {
            System.out.println("\tThe character is a number");
        } 
        else 
        {
            System.out.println("\tInvalid input. Please enter a single character only.");
        }
    }
}