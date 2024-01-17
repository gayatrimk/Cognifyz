import java.util.Random;
import java.util.Scanner;

public class PasswordGen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number of letters, numbers, and special characters
        System.out.print("Enter the number of lowercase letters in the password: ");
        int numlows = scanner.nextInt();

        System.out.print("Enter the number of uppercase letters in the password: ");
        int numups = scanner.nextInt();

        System.out.print("Enter the number of numbers in the password: ");
        int numNumbers = scanner.nextInt();

        System.out.print("Enter the number of special characters in the password: ");
        int numSpecialChars = scanner.nextInt();

        // Generate the password
        String password = generatePassword(numlows,numups, numNumbers, numSpecialChars);

        // Display the generated password
        System.out.println("Generated Password: " + password);

        scanner.close();
    }

    private static String generatePassword(int numlows,int numups, int numNumbers, int numSpecialChars) {
        // Define character sets for letters, numbers, and special characters
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";

        // Create a random object
        Random random = new Random();

        // Initialize the password StringBuilder
        StringBuilder password = new StringBuilder();

        // Generate letters
        for (int i = 0; i < numlows; i++) {
            password.append(lower.charAt(random.nextInt(lower.length())));
        }

        for (int i = 0; i < numups; i++) {
            password.append(upper.charAt(random.nextInt(upper.length())));
        }

        // Generate numbers
        for (int i = 0; i < numNumbers; i++) {
            password.append(numbers.charAt(random.nextInt(numbers.length())));
        }

        // Generate special characters
        for (int i = 0; i < numSpecialChars; i++) {
            password.append(specialChars.charAt(random.nextInt(specialChars.length())));
        }

        // Shuffle the characters in the password to make it more random

        return shuffleString(password.toString());
    }

    private static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        for (int i = characters.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            char temp = characters[i];
            characters[i] = characters[index];
            characters[index] = temp;
        }
        return new String(characters);
    }
}
