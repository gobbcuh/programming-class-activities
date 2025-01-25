package practiceExercises2;

public class Act8 
{
	public static void main(String[] args) 
	{
        int[][] origMatrix = 
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
		System.out.println("\n\tOriginal Matrix:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print("\t" + origMatrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transposedMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                transposedMatrix[j][i] = origMatrix[i][j];
            }
        }

        System.out.println("\n\tTransposed Matrix:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print("\t" + transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
	}
}