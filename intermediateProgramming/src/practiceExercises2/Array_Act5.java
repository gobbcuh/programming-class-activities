package practiceExercises2;

import java.util.Scanner;

public class Array_Act5 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("\n\tEnter 10 integers: ");
        int input1 = s.nextInt();
        int input2 = s.nextInt();
        int input3 = s.nextInt();
        int input4 = s.nextInt();
        int input5 = s.nextInt();
        int input6 = s.nextInt();
        int input7 = s.nextInt();
        int input8 = s.nextInt();
        int input9 = s.nextInt();
        int input10 = s.nextInt();
        
        int[] userInput = new int[10];
        userInput[0] = input1;
        userInput[1] = input2;
        userInput[2] = input3;
        userInput[3] = input4;
        userInput[4] = input5;
        userInput[5] = input6;
        userInput[6] = input7;
        userInput[7] = input8;
        userInput[8] = input9;
        userInput[9] = input10;
        
        System.out.print("\tDuplicate numbers: ");
        boolean foundDuplicate = false;
        
        for (int i = 0; i < 10; i++) 
        {
            boolean isDuplicate = false;
            boolean isDisplayed = false;

            for (int j = i + 1; j < 10; j++) 
            {
                if (userInput[i] == userInput[j]) 
                {
                    isDuplicate = true;
                    break;
                }
            }

            for (int k = 0; k < i; k++) 
            {
                if (userInput[i] == userInput[k]) 
                {
                    isDisplayed = true;
                    break;
                }
            }

            if (isDuplicate && !isDisplayed) 
            {
                System.out.print(userInput[i] + " ");
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) 
        {
            System.out.println("\tNo duplicates found.");
        }
    }
}