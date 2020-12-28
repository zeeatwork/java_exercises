package chapter3;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] arg) {
        //initialize what we know
        int requiredSalary = 30_000;
        int requiredYearsEmployed = 2;

        //Get info we dont know
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your current salary.");
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current emplooyer");
        double years = scanner.nextDouble();

        scanner.close();

        //make decision
        if(salary >= requiredSalary) {
            if(years >= requiredYearsEmployed) {
                System.out.println("Congrats! You qualify for a loan.");
            } else {
                System.out.println("Sorry. You must have worked at your current job for "
                + requiredYearsEmployed + " years.");
            }
        }
        else {
            System.out.println("Sorry. You must earn at least $" + requiredSalary +
                    " to qualify for a loan.");
        }
    }
}
