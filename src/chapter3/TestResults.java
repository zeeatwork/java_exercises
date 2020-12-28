package chapter3;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        //get test score
        System.out.println("Enter your test score.");
        double score = scanner.nextDouble();

        //Determine letter grade
        char grade;

        if(score < 60) {
            grade = 'F';
        } else if(score < 70) {
            grade = 'D';
        } else if(score < 80) {
            grade = 'C';
        } else if(score < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        System.out.println("Your score is " + grade);
    }
}
