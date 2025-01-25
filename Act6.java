package practiceExercises;

import java.util.Scanner;

public class Act6 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        intro_loading();
        
        System.out.println("\t\t------------- MULTIPLICATION TABLE GENERATOR --------------");

        System.out.print("\n\t\tEnter a number to display its multiplication table: ");
        int choiceNum = s.nextInt();
        
        evaluating_number();
        
        System.out.println("\t\t-----------------------------------------------------------");
        
        System.out.println("\n\t\t\t     Multiplication Table for " + choiceNum + ":");
        
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println("\t\t\t\t     " + choiceNum + " x " + i + " = " + (choiceNum * i));
        }
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

    public static void evaluating_number() 
    {
        System.out.print("\n\t\tCreating your multiplication table...");
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
