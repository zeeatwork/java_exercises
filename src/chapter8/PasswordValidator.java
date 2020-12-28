package chapter8;


import java.util.Scanner;

/*
Validate the complexity of a proposed password by assuring it meets these rules:
*At least 8 characters long
*Contains an uppercase letter
*Contains a lowercase letter
*Doesn't contain the username
*not the same as the old password
 */
public class PasswordValidator {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        String userName = getUsername();
        String currentPassword = getCurrentPassword();
        validatePasswordUpdate(userName, currentPassword);
    }

    public static String getUsername(){
        System.out.println("It's time for a password update.  Please enter your username.");
        String username = input.next();
        return username;
    }

    public static String getCurrentPassword(){
        System.out.println("Please enter your current password.");
        String currentPassword = input.next();
        return currentPassword;
    }

    public static void validatePasswordUpdate(String username, String currentPassword){
    boolean newPasswordInvalid = true;
        while (newPasswordInvalid) {
    System.out.println("Please enter a new password. Passwords must: \n - Be at least 8 characters long " +
            "\n -Contain at least one uppercase and one lowercase letter" +
            "\n -Be different from your last password" +
            "\n -NOT contain your username.");
    String newPassword = input.next();
    if(isAtLeastEightCharacters(newPassword)
            && containsUppercaseCharacter(newPassword)
            && containsLowercaseCharacter(newPassword)
            && !isSamePassword(newPassword, currentPassword)
            && !containsUsername(username,newPassword)){
        newPasswordInvalid = false;
    } else {
        System.out.println("Your new password doesn't meet the outlined criteria. Please try again.");
    }
}
        input.close();
        System.out.println("New Password Confirmed.");
    }

    public static boolean isAtLeastEightCharacters(String newPassword){
        return (newPassword.length() >= 8);
    }

    public static boolean containsUppercaseCharacter(String newPassword){
        short uppercaseCharacterCount = 0;
        for (int i = 0; i <= newPassword.length(); i++){
            if (Character.isUpperCase(newPassword.charAt(i))){
                uppercaseCharacterCount++;
            }
        }
        return(uppercaseCharacterCount > 0);
    }

    public static boolean containsLowercaseCharacter(String newPassword){
        short lowercaseCharacterCount = 0;
        for (int i = 0; i <= newPassword.length(); i++){
            if (Character.isLowerCase(newPassword.charAt(i))){
                lowercaseCharacterCount++;
            }
        }
        return(lowercaseCharacterCount > 0);
    }

    public static boolean isSamePassword(String newPassword, String currentPassword){
        return (newPassword.equals(currentPassword));
    }

    public static boolean containsUsername(String username, String newPassword){
        return (newPassword.contains(username));
    }
}
