package chapter14;

import java.util.Scanner;

public class CoinTossGame {

    public static void main(String[] args) {
        Coin coin = new Coin();
        boolean isInvalidEntry = true;
        String flipResult = coin.flip();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to the exciting world of coin tossing!");
        System.out.println("Player one, please enter your name.");
        String name1 = scanner.next();
        Player player1 = new Player(name1);
        System.out.println("Player two, please enter your name.");
        String name2 = scanner.next();
        Player player2 = new Player(name2);

        System.out.println(name1 + ", please choose Heads or Tails.");
          player1.setGuess(scanner.next());
        while (isInvalidEntry) {
            if (player1.getGuess().equalsIgnoreCase("Heads") ||
            player1.getGuess().equalsIgnoreCase("Tails")){
                isInvalidEntry = false;
                if (player1.getGuess().equalsIgnoreCase("Heads")){
                player2.setGuess("Tails");
                } else player2.setGuess("Heads");
                break;
            } else System.out.println("Invalid entry! Please enter the word 'True' or 'False'.");
        }

        scanner.close();
        System.out.println("Let's flip that coin!  Good luck " + name1 + " and " + name2);
        System.out.println("The coin landed " + flipResult + " side up!");
        if (flipResult.equals(player1.getGuess())){
            System.out.println(name1 + ", you win!!");
        } else System.out.println(name2 + ", you win!!");

        System.out.printf("Thanks for playing!");


    }
}
