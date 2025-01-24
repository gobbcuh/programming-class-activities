package practiceExercises;

import java.util.Scanner;

public class Act5 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        intro_loading();
        
        System.out.println("\n\t     ----------------- POLITICAL COLOR CHOICE -----------------");
        System.out.println("\t\t\tFind out who your political color is!\n");
        
        System.out.print("\t\tEnter your favorite color: ");
        String color = scanner.next();
        
        evaluating_color();
        
        System.out.println("\n\n\t     ----------------------------------------------------------");

        switch (color) 
        {
            case "Red":
                System.out.println("\tBongbong Marcos - Sige na, I respect your opinion.");
                break;
            case "Green":
                System.out.println("\tSara Dutere - Ipamaglaki mo na, 'wag gawing confidential.");
                break;
            case "Blue":
                System.out.println("\tIsko Moreno - Magaling siguro mag-budots 'no?");
                break;
            default:
                System.out.println("\t\t     Baka ang political figure choice mo ay\n\t\t    hindi member ng Kadiliman VS Kasamaan Cult.");
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
    
    public static void evaluating_color() 
    {
        System.out.print("\n\t\tEvaluating your political color...");
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
    }
}