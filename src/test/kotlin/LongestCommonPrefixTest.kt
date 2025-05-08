import org.example.strings.longestCommonPrefix
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestCommonPrefixTest {

    @Test
    fun testLongestCommonPrefix() {
        assertEquals("fl", longestCommonPrefix(arrayOf("flower", "flow", "flight"))) // Common prefix "fl"
        assertEquals("", longestCommonPrefix(arrayOf("dog", "racecar", "car")))      // No common prefix
        assertEquals("ap", longestCommonPrefix(arrayOf("apple", "apricot", "ape")))   // Common prefix "a"
        assertEquals(
            "inter",
            longestCommonPrefix(arrayOf("interview", "internet", "interval"))
        ) // Common prefix "inter"
        assertEquals("hello", longestCommonPrefix(arrayOf("hello")))                 // Single element case
        assertEquals("", longestCommonPrefix(arrayOf("", "hello")))                  // Edge case: empty string in array
        assertEquals("", longestCommonPrefix(arrayOf()))                             // Edge case: empty array
    }
}