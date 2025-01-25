package practiceExercises;

import java.util.Scanner;

public class Act7 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        intro_loading();

        System.out.println("\t\t-------------- EVEN NUMBER SUM CALCULATOR ----------------");

        System.out.print("\n\t\tEnter the upper limit for the even numbers sum: ");
        int numLimit = s.nextInt();

        int number = 2;
        int sum = 0;

        evaluating_sum();

        while (number <= numLimit) 
        {
            sum = sum + number;
            number = number + 2;
        }

        System.out.println("\t\t----------------------------------------------------------");
        System.out.println("\t\t    The sum of even numbers from 2 to " + numLimit + " is: " + sum);
    }

    public static void intro_loading() 
    {
        System.out.print("\n\n\n\t      Starting the program... Please wait! ");
        for (int i = 0; i < 25; i++) 
        {
            try 
            {
                Thread.sleep(100);
            } 
            catch (InterruptedException e) 
            {
                System.out.println("\t\tError in loading delay!");
            }
            System.out.print("█");
        }
        System.out.println("\n");
    }

    public static void evaluating_sum() 
    {
        System.out.print("\n\t\tCalculating the sum of even numbers...");
        for (int i = 0; i < 20; i++) 
        {
            try 
            {
                Thread.sleep(100);
            } 
            catch (InterruptedException e) 
            {
                System.out.println("\t\tError in loading delay!");
            }
            System.out.print(".");
        }
        System.out.println("\n");
    }
}