package laboratory1;

import java.util.Scanner;

public class Exer3
{
	public static void main(String[] args) 
	{
		// Create a java code that will enter the info of the user. Identify 3 info, then print
		Scanner s = new Scanner(System.in);
		System.out.println("\n\t\t  PATIENT'S BASIC INFORMATION");
		System.out.println("\t-------------------------------------------------");
		
		System.out.print("\tPatient's Name: ");
		String patientName = s.nextLine();
		
		System.out.print("\tPatient's Body Temperature in Celcius: ");
		float tempCelcius = s.nextFloat();
		
		float tempFarenheit = (tempCelcius * 9/5) + 32;
		System.out.println("\tPatient's Body Temperature in Farenheit: " + tempFarenheit);
	}
}
