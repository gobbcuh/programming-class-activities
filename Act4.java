package practiceExercises;

import java.util.Scanner;

public class Act4 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        intro_loading();
        
        System.out.println("\n\t     ----------------- BMI CHECKER: PA-KAPWA STYLE -----------------");
        System.out.println("\t      Ready to check if you're on the right track to being healthy?\n");
        
        System.out.print("\t\tEnter your height (in meters): ");
        double height = scanner.nextDouble();
                
        System.out.print("\t\tEnter your weight (in kilograms): ");
        double weight = scanner.nextDouble();
        
        evaluating_bmi();
        
        System.out.println("\t     ---------------------------------------------------------------");
        
        double bmi = weight / (height * height);
        
        if (bmi < 18.5) 
        {
            System.out.println("\t\t    Underweight ka, friend. Time to eat a little more,\n\t\t\tbaka kaya pa ng konting extra rice?");
        } 
        else if (bmi >= 18.5 && bmi < 25) 
        {
            System.out.println("\t\t      Sana all healthy! You're on the right track!");
        } 
        else 
        {
            System.out.println("\t\t\t\tOverweight ka na, friend.\n\t\tMaybe it's time to add a few more walks or workout sesh?");
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

    public static void evaluating_bmi() 
    {
        System.out.print("\n\t\tEvaluating your BMI...");
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