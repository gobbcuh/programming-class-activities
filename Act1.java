package practiceExercises2;

import java.util.Scanner;

public class Act1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		double averageScore = 0.0;
		int total = 0, highestScore, lowestScore;
		int[] studentScores = new int[5];
		
		System.out.print("\n\tEnter score for student 1: ");
		studentScores[0] = s.nextInt();
		
		System.out.print("\tEnter score for student 2: ");
		studentScores[1] = s.nextInt();
		
		System.out.print("\tEnter score for student 3: ");
		studentScores[2] = s.nextInt();
		
		System.out.print("\tEnter score for student 4: ");
		studentScores[3] = s.nextInt();
		
		System.out.print("\tEnter score for student 5: ");
		studentScores[4] = s.nextInt();
		
		for (int score : studentScores) 
		{
			total = total + score;
		}
		averageScore = total / 5.0;
		System.out.println("\n\tAverage score: " + averageScore);
		
		highestScore = studentScores[0];
		lowestScore = studentScores[0];
		
		for (int score : studentScores) 
		{
			if (score > highestScore) 
			{
				highestScore = score;
			}
			else if (score < lowestScore) 
			{
				lowestScore = score;
			}
		}
		
		System.out.println("\tHighest score: " + highestScore);
		System.out.println("\tLowest score: " + lowestScore);
	}
}