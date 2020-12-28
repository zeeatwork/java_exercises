package chapter4;
/*
WHILE LOOP
Each store employee makes $15 and hour.  Write a program that allows the employee to enter
the number of hours worked for the week.  Do not allow for overtime.
 */

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Initialize known variables
        int rate = 15;
        int maxHours = 40;

        //Get input for unknown variables
        System.out.println("How many hours did you work this week?");
        double hoursWorked = scanner.nextDouble();

        //validate input
        while(hoursWorked > maxHours && hoursWorked > 0) {
            System.out.println("Invalid entry.  Your hours must be between 1 and 40. Try Again");
            hoursWorked = scanner.nextDouble(); //sentinel
        }

        scanner.close();
        //calculate gross
        double gross = rate * hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
