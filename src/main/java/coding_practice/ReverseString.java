package coding_practice;

public class ReverseString {

    public static void main(String[] args) {
        String inputStr = "Interview Happy";
        String reversedStr = reverseString(inputStr);
        System.out.println("Original String: " + inputStr);
        System.out.println("Reversed String: " + reversedStr);
    }

    private static String reverseString(String inputStr) {
        StringBuilder reversed = new StringBuilder(inputStr);
        reversed.reverse();
        return reversed.toString();
    }
}
