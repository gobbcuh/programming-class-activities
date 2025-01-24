package laboratory1;

import java.util.Scanner;

public class Exer4 
{
    public static void main(String[] args) 
    {
        // Make a code that will compute the 13th month of the employee 
        // Note: 5% of month of service

        Scanner s = new Scanner(System.in);
        System.out.println("\n\t        EMPLOYEE'S 13TH MONTH PAY\n\t-------------------------------------------");

        System.out.print("\tEnter ID: ");
        String employeeID = s.nextLine();

        System.out.print("\tEnter Position: ");
        String employeePosition = s.nextLine();

        System.out.print("\tEnter Basic Pay: ");
        double basicPay = s.nextDouble();

        System.out.print("\tEnter Month of Service: ");
        int serviceMonth = s.nextInt();
        
        double monthPay = basicPay * (0.05 * serviceMonth);

        System.out.println("\t-------------------------------------------");
        System.out.println("\tEmployee's ID: " + employeeID);
        System.out.println("\tEmployee's Position: " + employeePosition);
        System.out.println("\tEmployee's Basic Pay: " + basicPay);
        System.out.println("\tEmployee's 5% of Month of Service: " + (0.05 * serviceMonth));
        System.out.println("\t-------------------------------------------");
        System.out.println("\tComputed 13th Month Pay: " + "PHP " + monthPay);
    }
}