package chapter5;

import java.util.Scanner;

/*
VARIABLE SCOPE
Write an instant credit check program that approves anyone
who makes more than $25,000 and has a credit score
of 700 or better. Reject all others.
 */
public class InstantCreditCheck {

    //Initialize what we know
    static int requiredSalary = 25_000;
   static int requiredCreditScore = 700;
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Get what we don't know
int creditScore = getCreditScore();
double salary = getSalary();
        scanner.close();
        //Check if the user is qualified
boolean qualified = isUserQualified(creditScore,salary);
        //Notify the user
        notifyUser(qualified);
    }

    public static double getSalary() {
        System.out.println("Enter your annual salary:");
        double salary = scanner.nextDouble();
        return salary;

    }

    public static int getCreditScore() {

        System.out.println("Enter your credit score.");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int creditScore, double salary) {
        return (creditScore >= requiredCreditScore && salary >= requiredSalary);
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified) {
            System.out.println("Congrats! You've been approved.");
        } else {
            System.out.println("Sorry. We've declined your application.");
        }
    }
}
