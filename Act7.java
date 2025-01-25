package practiceExercises2;

import java.util.Scanner;

public class Act7 
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
        
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[i].length; j++) 
            {
                if (matrix[i][j] == searchNum) 
                {
                    System.out.println("\tNumber found at row " + (i + 1) + ", column " + (j + 1));
                    found = true;
                    break;
                }
            }
            if (found) 
            {
            	break;
            }
        }
        
        if (!found) 
        {
            System.out.println("\tNumber not found in the matrix.");
        }   
    }
}
