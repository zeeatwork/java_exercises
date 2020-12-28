package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short targetChangeValue = 100;
        int totalChangeValue;

        //ask a user to enter quantities for each type of coin
        System.out.println("How many pennies would you like?");
        int pennies = scanner.nextInt();
        System.out.println("How many nickles would you like?");
        int nickles = 5 * scanner.nextInt();
        System.out.println("How many dimes would you like?");
        int dimes = 10 * scanner.nextInt();
        System.out.println("How many quarters would you like?");
        int quarters = 25 * scanner.nextInt();
        //count the total value of coins entered
        totalChangeValue = pennies + nickles + dimes + quarters;
        //the user wins if the amount equals $1
        if (totalChangeValue == targetChangeValue){
            System.out.println("Congratulations! You win!");
            //if the user lost, output over/under amount;
        } else if (totalChangeValue < targetChangeValue) {
            System.out.println("That's not enough change! You were under by $0." + (targetChangeValue - totalChangeValue));
        } else {
            System.out.println("That's too much change! You were over by $" + (double)(totalChangeValue - targetChangeValue)/100);
        }

    }
}
