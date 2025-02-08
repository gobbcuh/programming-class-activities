package practiceExercises2;

public class Array_Act8 
{
    public static void main(String[] args) 
    {
        int[][] origMatrix = 
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int numOfRow = origMatrix.length;
        int numOfColumn = origMatrix[0].length;
        
        System.out.println("\n\tOriginal Matrix:");
        for (int i = 0; i < numOfRow; i++) 
        {
            for (int j = 0; j < numOfColumn; j++) 
            {
                System.out.print("\t" + origMatrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transposedMatrix = new int[numOfColumn][numOfRow];
        
        for (int i = 0; i < numOfRow; i++) 
        {
            for (int j = 0; j < numOfColumn; j++) 
            {
                transposedMatrix[j][i] = origMatrix[i][j];
            }
        }

        System.out.println("\n\tTransposed Matrix:");
        for (int i = 0; i < numOfColumn; i++) 
        {
            for (int j = 0; j < numOfRow; j++) 
            {
                System.out.print("\t" + transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
