import org.example.strings.myAtoi
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MyAtoiTest {

    @Test
    fun testMyAtoi() {
        assertEquals(42, myAtoi("42"))              // Simple case
        assertEquals(-42, myAtoi("   -042"))        // Leading spaces & negative sign
        assertEquals(1337, myAtoi("1337c0d3"))      // Stops at first non-digit
        assertEquals(0, myAtoi("0-1"))              // Stops at first non-digit
        assertEquals(0, myAtoi("words and 987"))    // No leading digits → returns 0
        assertEquals(-2147483648, myAtoi("-91283472332")) // Lower bound handling
        assertEquals(2147483647, myAtoi("91283472332"))   // Upper bound handling
        assertEquals(0, myAtoi(" "))               // Empty string → returns 0
        assertEquals(0, myAtoi("+"))               // Only sign, no digits → returns 0
    }
}