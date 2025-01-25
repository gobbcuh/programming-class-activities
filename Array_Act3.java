package practiceExercises2;

import java.util.Scanner;

public class Act3
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("\n\t3X3 Multiplication table of number: ");
        int multiByNum = s.nextInt();
        
        System.out.println();
        
        int[][] multiplicationTable = new int[3][3];
        
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                multiplicationTable[i][j] = (i + 1) * (j + 1) * multiByNum;
            }
        }
        
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print("\t" + multiplicationTable[i][j] + " ");
            }
            System.out.println();
        }
        
        int sum = 0;
        int largestValue = multiplicationTable[0][0];

        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                sum = sum + multiplicationTable[i][j];
                
                if (multiplicationTable[i][j] > largestValue) 
                {
                    largestValue = multiplicationTable[i][j];
                }
            }
        }
        
        System.out.println("\n\tSum of all elements in the 2D array: " + sum);
        System.out.println("\tLargest value in the 2D array: " + largestValue);
    }
}
