package coding_practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeVerifierTest {

    @Test
    public void testSimplePalindrome() {
        assertTrue(PalindromeVerifier.isPalindrome("madam"));
    }

    @Test
    public void testNonPalindrome_false() {

        var str = "OpenAI";
        var result = PalindromeVerifier.isPalindrome(str);
        assertFalse(result);
    }

    @Test
    public void simpliyfyStringTest() {
        var str = "1Red rum, sir, is murder1";
        var result = PalindromeVerifier.simplifyString(str);
        assertEquals("1redrumsirismurder1", result);
    }
}
