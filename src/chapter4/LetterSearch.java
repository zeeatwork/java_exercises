package chapter4;

import java.util.Scanner;

/*
LOOP BREAK
Search a String to determine in it contains the letter 'A'.
 */

public class LetterSearch {
    public static void main(String[] args) {
        boolean letterFound = false;
        //Get text
        System.out.println("Enter some text.");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        //Search for letter A

        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }
        if (letterFound) {
            System.out.println("This text contains 'A'");
        } else {
            System.out.println("There is no 'A' in this text.");
        }
    }
}
