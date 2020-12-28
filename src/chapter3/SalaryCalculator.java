package chapter3;

import java.util.Scanner;

/*
*
* if statement
* All salespeople earn $1000 per week
* If a salesperson exceeds 10 sales, they receive a $250 bonus.*/
public class SalaryCalculator {
    public static void main(String[] arg){
        //initialize known values
        short weeklySalary = 1000;
        short salesBonus = 250;
        short salesQuota = 10;

        //get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int numberOfSales = scanner.nextInt();
        scanner.close();
        //quick detour for the bonus earners
        if(numberOfSales > salesQuota) {
            weeklySalary += salesBonus;
        }
        //Output
        System.out.println("The employee's weekly earnings is: " + weeklySalary);
    }
}
