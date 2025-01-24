package practiceExercises2;

import java.util.Scanner;

public class Act9 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter 7 numbers: ");
        int input1 = s.nextInt();
        int input2 = s.nextInt();
        int input3 = s.nextInt();
        int input4 = s.nextInt();
        int input5 = s.nextInt();
        int input6 = s.nextInt();
        int input7 = s.nextInt();

        int[] sorted = {input1, input2, input3, input4, input5, input6, input7};

        for (int i = 0; i < sorted.length - 1; i++) 
        {
            for (int j = i + 1; j < sorted.length; j++) 
            {
                if (sorted[i] > sorted[j]) 
                {
                    int temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }

        System.out.println("\nSorted Array: ");
        for (int num : sorted) 
        {
            System.out.print(num + " ");
        }
    }
}