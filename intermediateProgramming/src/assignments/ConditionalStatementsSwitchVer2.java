package assignments;

import java.util.Scanner;

public class ConditionalStatementsSwitchVer2
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.print("\n\tEnter a month number: ");
        int monthNumber = s.nextInt();

        System.out.print("\tEnter a year: ");
        int inputYear = s.nextInt();

        int monthDays = 0;
        String monthName = "";

        switch (monthNumber) 
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                monthDays = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                monthDays = 30;
                break;

            case 2:
                monthName = "February";
                if ((inputYear % 4 == 0 && inputYear % 100 != 0) || (inputYear % 400 == 0)) 
                {
                    monthDays = 29;
                } 
                else 
                {
                    monthDays = 28;
                }
                break;

            default:
                System.out.println("\tInvalid month number.");
                return;
        }

        // Assign month names based on the month number
        switch (monthNumber) 
        {
            case 1:
                monthName = "January";
                break;
            case 3:
                monthName = "March";
                break;
            case 5:
                monthName = "May";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 10:
                monthName = "October";
                break;
            case 12:
                monthName = "December";
                break;
            case 4:
                monthName = "April";
                break;
            case 6:
                monthName = "June";
                break;
            case 9:
                monthName = "September";
                break;
            case 11:
                monthName = "November";
                break;
        }

        System.out.print("\t");
        System.out.println(monthName + " " + inputYear + " has " + monthDays + " days");
    }
}