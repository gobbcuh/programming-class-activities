package practiceExercises2;

import java.util.Scanner;

public class Array_Act7 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        int[][] matrix = 
        {
            {44, 88, 48, 84},
            {24, 42, 28, 82},
            {68, 86, 64, 46},
            {89, 98, 99, 49}
        };

        System.out.print("\n\tSearch Number: ");
        int searchNum = s.nextInt();
        
        boolean isFound = false;

        for (int row = 0; row < matrix.length; row++) 
        {
            int column = 0;
            
            while (column < matrix[row].length && !isFound) 
            {
                if (matrix[row][column] == searchNum) 
                {
                    System.out.println("\tNumber found at row " + (row + 1) + ", column " + (column + 1));
                    isFound = true;
                }
                column++;
            }

            if (isFound) 
            {
                break;
            }
        }

        if (!isFound) 
        {
            System.out.println("\tNumber not found.");
        }  
    }
}
