package chapter4;

/*
Game Objective: travel the entire game board within 5 rolls.
 */

import java.util.Random;
import java.util.Scanner;


public class RollTheDieGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        short gameBoardSize = 20;
        short numberOfRolls = 5;
        int rollTotal = 0;
        System.out.println("Welcome to our game of chance. Our bot will roll for you.");

        while(rollTotal < gameBoardSize && numberOfRolls > 0) {
            //Roll the die for the user
            int dieRoll = random.nextInt(6) + 1;
            rollTotal += dieRoll;
            numberOfRolls--;
            System.out.println("You rolled a " + dieRoll);
            if (rollTotal < gameBoardSize){
                System.out.println("You landed on space " + rollTotal +
                        ". You need to move " + (gameBoardSize - rollTotal) +
                        " more spaces to win.");
            }
        }
        if(rollTotal == gameBoardSize) {
            System.out.println("You scored a 20. Congratulations! You won!!");
        } else if (rollTotal < gameBoardSize) {
            System.out.println("You're out of rolls! You lost!");
        } else System.out.println("Hey! Where ya goin'?! You've rolled off the board, loser.");
    }
}
