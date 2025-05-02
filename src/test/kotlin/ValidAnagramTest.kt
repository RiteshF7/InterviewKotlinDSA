import org.example.strings.isAnagram
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class AnagramTest {

    @Test
    fun testIsAnagram() {
        assertTrue(isAnagram("anagram", "nagaram"))  // Valid anagram
        assertFalse(isAnagram("rat", "car"))         // Not an anagram
        assertTrue(isAnagram("listen", "silent"))    // Another valid anagram
        assertFalse(isAnagram("hello", "helloo"))    // Different lengths
        assertFalse(isAnagram("abc", "abd"))         // Same length, different characters
        assertTrue(isAnagram("a", "a"))              // Single character case
        assertFalse(isAnagram("a", "b"))             // Single character mismatch
        assertTrue(isAnagram("", ""))                // Edge case: empty strings
    }
}