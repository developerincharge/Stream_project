package coding_practice;

import java.util.Scanner;

public class PalindromeChecker1 {

    public static boolean isPalindrome(String input) {
        if (input == null) return false;

        StringBuilder sanitized = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sanitized.append(Character.toLowerCase(c));
            }
        }

        String cleaned = sanitized.toString();
        String reversed = sanitized.reverse().toString();

        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String userInput = scanner.nextLine();

        boolean result = isPalindrome(userInput);
        if (result) {
            System.out.println("✅ The input is a palindrome.");
        } else {
            System.out.println("❌ The input is not a palindrome.");
        }

        // Example: Automatic test case
        String example = "1Red rum, sir, is murder1";
        System.out.println("\nExample Check:");
        System.out.println("Input: \"" + example + "\"");
        System.out.println("Is palindrome? " + isPalindrome(example));
    }
}
