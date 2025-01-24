package assignments;

import java.util.Scanner;

public class ConditionalStatements 
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

        if (monthNumber == 1) 
        {
            monthDays = 31;
            monthName = "January";
        } 
        else if (monthNumber == 2) 
        {
            monthName = "February";
            if ((inputYear % 4 == 0 && inputYear % 100 != 0) || (inputYear % 400 == 0)) 
            {
                monthDays = 29;
            } 
            else {
                monthDays = 28;
            }
        } 
        else if (monthNumber == 3) 
        {
            monthDays = 31;
            monthName = "March";
        } 
        else if (monthNumber == 4) 
        {
            monthDays = 30;
            monthName = "April";
        } 
        else if (monthNumber == 5) 
        {
            monthDays = 31;
            monthName = "May";
        } 
        else if (monthNumber == 6) 
        {
            monthDays = 30;
            monthName = "June";
        } 
        else if (monthNumber == 7) 
        {
            monthDays = 31;
            monthName = "July";
        } 
        else if (monthNumber == 8) 
        {
            monthDays = 31;
            monthName = "August";
        } 
        else if (monthNumber == 9) 
        {
            monthDays = 30;
            monthName = "September";
        } 
        else if (monthNumber == 10) 
        {
            monthDays = 31;
            monthName = "October";
        } 
        else if (monthNumber == 11) 
        {
            monthDays = 30;
            monthName = "November";
        } 
        else if (monthNumber == 12) 
        {
            monthDays = 31;
            monthName = "December";
        } 
        else 
        {
            System.out.println("\tInvalid month number.");
            return;
        }
        
        System.out.print("\t");
        System.out.println(monthName + " " + inputYear + " has " + monthDays + " days");
    }
}