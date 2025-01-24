package laboratory1;

import java.util.Scanner;

public class Exer3Version2 
{
	public static void main(String[] args) 
	{
		// Create a java code that will enter the info of the user. Identify 3 info, then print
		Scanner s = new Scanner(System.in);
		System.out.println("\t\tPATIENT'S BASIC INFORMATION");
		
		System.out.print("\tEnter Patient's Name: ");
		String patientName = s.nextLine();
		
		System.out.print("\tEnter Patient's Body Temperature in Celcius: ");
		float tempCelcius = s.nextFloat();
		
		float tempFarenheit = (tempCelcius * 9/5) + 32;
		
		System.out.println("\t---------------------------------------------------");
		System.out.println("\tPatient's Name: " + patientName);
		System.out.println("\tPatient's Body Temperature in Celcius: " + tempCelcius);
		System.out.println("\tPatient's Body Temperature in Farenheit: " + tempFarenheit);
	}
}
