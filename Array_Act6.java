package practiceExercises2;

public class Act6 
{
    public static void main(String[] args) 
    {
        int[][] matrix = 
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] sumOfRow = new int[3];
        int[] sumOfColumn = new int[3];

        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
            	sumOfRow[i] = sumOfRow[i] + matrix[i][j];
            	sumOfColumn[j] = sumOfColumn[j] + matrix[i][j];
            }
        }

        System.out.println("\n\tMatrix:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }

        System.out.print("\n\tRow sums: ");
        for (int sum : sumOfRow) 
        {
            System.out.print(sum + " ");
        }

        System.out.print("\n\tColumn sums: ");
        for (int sum : sumOfColumn) 
        {
            System.out.print(sum + " ");
        }
    }
}