package chapter3;

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String[] arg) {
        //initalize what we know
        int quota = 10;

        //get unknown values
        System.out.println("Enter number of sales you made this week.");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //make a decision and output
        if (sales >= quota){
            System.out.println("Congrats! You met your quota!");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("You did not meet your quota.  You were " + salesShort + " sales short of the goal.");
        }
    }
}
