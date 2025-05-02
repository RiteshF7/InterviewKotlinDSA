import org.example.strings.reverse
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseIntegerTest {

    @Test
    fun testReverse() {
        assertEquals(321, reverse(123))      // Normal case
        assertEquals(-321, reverse(-123))    // Negative number case
        assertEquals(21, reverse(120))       // Trailing zero case
        assertEquals(0, reverse(0))          // Zero case
        assertEquals(0, reverse(1534236469)) // Overflow case
        assertEquals(0, reverse(-2147483648)) // Negative overflow case
    }
}