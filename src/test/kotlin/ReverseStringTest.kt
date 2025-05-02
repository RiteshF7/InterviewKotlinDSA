import org.example.strings.reverseString
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ReverseStringTest {

    @Test
    fun testReverseString() {
        val s1 = charArrayOf('h', 'e', 'l', 'l', 'o')
        reverseString(s1)
        assertArrayEquals(charArrayOf('o', 'l', 'l', 'e', 'h'), s1)

        val s2 = charArrayOf('H', 'a', 'n', 'n', 'a', 'h')
        reverseString(s2)
        assertArrayEquals(charArrayOf('h', 'a', 'n', 'n', 'a', 'H'), s2)

        val s3 = charArrayOf('a')
        reverseString(s3)
        assertArrayEquals(charArrayOf('a'), s3)

        val s4 = charArrayOf()
        reverseString(s4)
        assertArrayEquals(charArrayOf(), s4)
    }
}