package coding_practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    @Test
    public void testSimplePalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("madam"));
    }

    @Test
    public void testPalindromeWithMixedCase() {
        assertTrue(PalindromeChecker.isPalindrome("RaceCar"));
    }

    @Test
    public void testPalindromeWithSpacesAndPunctuation() {
        String str = "1Red rum, sir, is murder1";
        assertTrue(PalindromeChecker.isPalindrome(str));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("OpenAI"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @Test
    public void testNullInput() {
        assertFalse(PalindromeChecker.isPalindrome(null));
    }

    @Test
    public void testPalindromeWithNumbers() {
        assertTrue(PalindromeChecker.isPalindrome("12321"));
        assertFalse(PalindromeChecker.isPalindrome("12345"));
    }
}
