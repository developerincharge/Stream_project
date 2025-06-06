package coding_practice;

public class PalindromeVerifier {
    public static void main(String[] args) {
        String str = "1Red rum, sir, is murder1";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        var simplified = simplifyString(str);
        var reversedSimplified = new StringBuilder(simplified).reverse().toString();
        return simplified.equals(reversedSimplified);
    }

    static String simplifyString(String str) {
        return str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
    }
}
