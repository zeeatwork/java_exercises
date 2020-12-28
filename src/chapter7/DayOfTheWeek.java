package chapter7;

/*
Make an array that holds the textual values of the days of the week.
Have the user input a number corresponding to the day of the week.
Assume the week starts on Monday.
Your program should output the String that represents the day of the week.
 */

import java.util.Scanner;

public class DayOfTheWeek {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){
        int dayNumber = getUserDayNumber();
        scanner.close();
        printUserDay(dayNumber);

    }

    public static int getUserDayNumber(){
        System.out.println("Please a number for your day of the week (from 1 -7)");
        int dayNumber = scanner.nextInt();
        return dayNumber;
    }

    public static void printUserDay(int dayNumber){
        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Your day of the week is " + daysOfTheWeek[dayNumber - 1]);
    }
}
