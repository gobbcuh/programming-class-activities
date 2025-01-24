package practiceExercises;

import java.util.Scanner;

public class Act8 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        intro_loading();

        System.out.println("\t\t---------------- TASK REMINDER PROGRAM -----------------");

        System.out.print("\n\t\tEnter the task you want to be reminded of: ");
        String task = s.nextLine();
        
        System.out.print("\t\tTimes do you want to be reminded: ");
        int repetitions = s.nextInt();
        
        evaluating_reminders();
        
        System.out.println("\t\t--------------------------------------------------------");

        int count = 1;
        do 
        {
            System.out.println("\t\t\t\t   Reminder " + count + ": " + task);
            count++;
        } while (count <= repetitions);
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

    public static void evaluating_reminders() 
    {
        System.out.print("\n\t\tSetting up your reminders...");
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