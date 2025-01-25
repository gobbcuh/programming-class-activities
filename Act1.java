package practiceExercises;

import java.util.Scanner;

public class Act1 {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        intro_loading();

        System.out.println("\n\t     ---------------- AGE FORTUNE TRACKER ----------------");
        
        System.out.print("\n\t\tEnter your age: ");
        int age = scanner.nextInt();
        
        analyzing_age();
        
        System.out.println("\t     -----------------------------------------------------");
        
        fortune_message(age);
    }

    public static void intro_loading() 
    {
        System.out.print("\n\n\n\t Starting the program... Please wait! ");
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

    public static void analyzing_age() 
    {
        System.out.print("\n\t\tAnalyzing your age fortune...");
        for (int i = 0; i < 20; i++) 
        {
            try 
            {
                Thread.sleep(120);
            } 
            catch (InterruptedException e) 
            {
                System.out.println("\t\tError in loading delay!");
            }
            System.out.print(".");
        }
        System.out.println("\n");
    }

    public static void fortune_message(int age) {
        if (age < 13) 
        {
            System.out.println("\t\tBata ka pa! Enjoy life and cartoons!");
        } 
        else if (age >= 13 && age <= 19) 
        {
            System.out.println("\t\tA teenager! TikTok and mood swings everytime, 'no?");
        } 
        else if (age >= 20 && age <= 29) 
        {
            System.out.println("\t\tYou're in your 20s! Trabaho na (and stay broke)!");
        } 
        else if (age >= 30 && age <= 39) 
        {
            System.out.println("\t\tMag-asawa ka na!");
        } 
        else if (age >= 40 && age <= 59) 
        {
            System.out.println("\t\tYou're in your prime! Embrace the dad jokes boss.");
        } 
        else 
        {
            System.out.println("\t\tYou're a legend! Inuman na with Ponce Enrile!");
        }
    }
}