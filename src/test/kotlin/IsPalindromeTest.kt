import org.example.strings.isPalindrome
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class PalindromeTest {

    @Test
    fun testIsPalindrome() {
        assertTrue(isPalindrome("A man, a plan, a canal: Panama")) // Valid palindrome after cleaning
        assertFalse(isPalindrome("race a car"))                    // Not a palindrome
        assertTrue(isPalindrome(" "))                              // Empty string should return true
        assertTrue(isPalindrome("madam"))                          // Simple palindrome
        assertFalse(isPalindrome("hello"))                         // Not a palindrome
        assertTrue(isPalindrome("12321"))                          // Numeric palindrome
        assertFalse(isPalindrome("12345"))                         // Not a numeric palindrome
    }
}