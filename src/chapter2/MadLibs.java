package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] arg){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter one of the four seasons:");
        String season = scanner2.next();
        System.out.println("Enter a whole number.");
        short numberOfDrinks = scanner2.nextShort();
        System.out.println("Enter an adjective");
        String userAdjective = scanner2.next();
        scanner2.close();
        System.out.println("On a " + userAdjective + " " + season + " day , I drink a minimum of " + numberOfDrinks + " cups of coffee.");


    }
}
