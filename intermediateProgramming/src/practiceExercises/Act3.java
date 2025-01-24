package practiceExercises;

import java.util.Scanner;

public class Act3 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        intro_loading();
        
        System.out.println("\n\t\t------------ DREAM GOAL ELIGIBILITY CHECKER ------------");
        
        System.out.print("\n\t\tEnter your age: "); 
        int age = scanner.nextInt();
        
        analyzing_data();
        
        System.out.print("\t\tEnter your monthly income (in pesos): "); 
        int income = scanner.nextInt();
        
        evaluating_eligibility();
        
        System.out.println("\t\t--------------------------------------------------------");
        
        if (age >= 21) 
        {
            if (income >= 30000) 
            {
                System.out.println("\t\t\t    Congratulations! May chance!\n\t You may pursue your dream of owning a house or even a trip to Paris!");
            } 
            else if (income >= 20000) 
            {
                System.out.println("\t\tYou are eligible to start working on your dream. Keri yan!\n\t\tMaybe a secondhand car or a nice studio apartment, maem?");
            }
            else 
            {
                System.out.println("\t     Grind lang! You're on your way to achieving your dreams boss.\n\t\t\t     Start small and work up!");
            }
        } 
        else if (age >= 16) 
        {
            System.out.println("\t  You’re still young, but it’s never too early to start dreaming big!\n\t\t\tFocus on your studies and skills ate ko.");
        } 
        else 
        {
            System.out.println("\t\t\t\t  Enjoy your youth!\n\t     Your dream right now should be having fun and eating ice cream.");
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

    public static void analyzing_data() 
    {
        System.out.print("\n\t\tAnalyzing your age...");
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
            System.out.print(".");
        }
        System.out.println("\n");
    }
    
    public static void evaluating_eligibility() 
    {
        System.out.print("\n\t\tEvaluating eligibility...");
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