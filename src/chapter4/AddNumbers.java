package chapter4;

/*
DO WHILE LOOP:
Write a program that allows a user to enter two numbers,
and then sums the two values.  The user should be able to
repeat this action until they indicate that they are done.
 */

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;
        do{
            System.out.println("Enter the first number.");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number.");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum is " + sum);

            System.out.println("Would you like to start over? Enter true or false.");
            again = scanner.nextBoolean();

        } while(again);
    }
}
