package coding_practice;

public class PalindromeChecker2 {

    public static void main(String[] args) {

        String str = "abba";
        boolean result = isPalindrome(str);
        System.out.println(result);
    }

    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();
       // return reversed.toString().equals(input);
        return reversed.toString().equals(input);

  }
}
