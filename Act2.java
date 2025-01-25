package practiceExercises;

import java.util.Scanner;

public class Act2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        intro_loading();
        
        System.out.println("\n\t   -------------- MOTIVATING GRADE CALCULATOR --------------");
        
        System.out.print("\n\t\tEnter your score: ");
        int score = scanner.nextInt();
        
        analyzing_age();
        
        System.out.println("\t   ---------------------------------------------------------");
        
        fortune_message(score);
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
        System.out.print("\n\t\tAnalyzing your score...");
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
        
	public static void fortune_message(int score) 
	{
        if (score >= 90) 
        {
            System.out.println("\t       Excellent work! Keep it up, future valedictorian!");
        } 
        else if (score >= 80) 
        {
            System.out.println("\t    Great job! A little more effort and you’ll hit the top!");
        } 
        else if (score >= 70) 
        {
            System.out.println("\t     Good effort! You’re on the right track—don’t give up!");
        }
        else if (score >= 60) 
        {
            System.out.println("\t You passed, but there's room for improvement. You’ve got this!");
        } 
        else 
        {
            System.out.println("\t\t\t   Don’t be discouraged!\n\t     Every failure is a step toward success. Try again!");
        }  
	}
}