package practiceExercises2;

import java.util.Scanner;

public class Act4 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("\n\tEnter 5 numbers: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        int num4 = s.nextInt();
        int num5 = s.nextInt();
        
        int[] originalArray = new int[5];
        originalArray[0] = num1;
        originalArray[1] = num2;
        originalArray[2] = num3;
        originalArray[3] = num4;
        originalArray[4] = num5;
        
        int[] reversedArray = new int[5];
        reversedArray[0] = originalArray[4];
        reversedArray[1] = originalArray[3];
        reversedArray[2] = originalArray[2];
        reversedArray[3] = originalArray[1];
        reversedArray[4] = originalArray[0];
                
        System.out.print("\n\tOriginal Array: ");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println();
        
        System.out.print("\tReversed Array: ");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println();
    }
}