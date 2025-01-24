package assignments;

import java.util.Scanner;

public class ConditionalStatementsSwitch 
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
                monthDays = 31;
                monthName = "January";
                break;

            case 2:
                monthName = "February";
                // Leap year calculation
                if ((inputYear % 4 == 0 && inputYear % 100 != 0) || (inputYear % 400 == 0)) 
                {
                    monthDays = 29;
                } 
                else 
                {
                    monthDays = 28;
                }
                break;

            case 3:
                monthDays = 31;
                monthName = "March";
                break;

            case 4:
                monthDays = 30;
                monthName = "April";
                break;

            case 5:
                monthDays = 31;
                monthName = "May";
                break;

            case 6:
                monthDays = 30;
                monthName = "June";
                break;

            case 7:
                monthDays = 31;
                monthName = "July";
                break;

            case 8:
                monthDays = 31;
                monthName = "August";
                break;

            case 9:
                monthDays = 30;
                monthName = "September";
                break;

            case 10:
                monthDays = 31;
                monthName = "October";
                break;

            case 11:
                monthDays = 30;
                monthName = "November";
                break;

            case 12:
                monthDays = 31;
                monthName = "December";
                break;

            default:
                System.out.println("\tInvalid month number.");
                return;
        }

        System.out.print("\t");
        System.out.println(monthName + " " + inputYear + " has " + monthDays + " days");
    }
}

