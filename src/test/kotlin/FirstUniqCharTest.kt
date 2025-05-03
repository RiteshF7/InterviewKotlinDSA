import org.example.strings.firstUniqChar
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FirstUniqueCharacterTest {

    @Test
    fun testFirstUniqChar() {
        assertEquals(0, firstUniqChar("leetcode"))    // 'l' at index 0
        assertEquals(2, firstUniqChar("loveleetcode")) // 'v' at index 2
        assertEquals(-1, firstUniqChar("aabb"))        // No unique character
        assertEquals(0, firstUniqChar("z"))            // Only one character, it's unique
        assertEquals(-1, firstUniqChar(""))            // Empty string should return -1
        assertEquals(4, firstUniqChar("aabbcdd"))            // Empty string should return -1
    }
}