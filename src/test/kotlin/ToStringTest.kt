import org.example.strings.strStr
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StrStrTest {

    @Test
    fun testStrStr() {
        assertEquals(0, strStr("sadbutsad", "sad"))    // First occurrence at index 0
        assertEquals(-1, strStr("leetcode", "leeto"))  // Needle not found
        assertEquals(2, strStr("hello", "ll"))         // Substring found at index 2
        assertEquals(4, strStr("mississippi", "issip")) // Substring found at index 4
        assertEquals(-1, strStr("abcdef", "gh"))       // No match
        assertEquals(0, strStr("needle", "needle"))    // Exact match case
        assertEquals(-1, strStr("", "a"))             // Empty haystack, needle not found
        assertEquals(0, strStr("a", ""))              // Empty needle always matches at index 0
    }
}