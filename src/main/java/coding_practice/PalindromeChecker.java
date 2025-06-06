package coding_practice;

public class PalindromeChecker {

    public static void main(String[] args) {
        String str = "1Red rum, sir, is murder1";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {

        if (str == null) return false;

        StringBuilder sanitized = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sanitized.append(Character.toLowerCase(c));
            }
        }

        String cleaned = sanitized.toString();
        String reversed = sanitized.reverse().toString();

        return cleaned.equals(reversed);
    }
}
