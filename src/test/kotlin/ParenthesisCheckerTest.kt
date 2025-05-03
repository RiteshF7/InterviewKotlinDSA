import org.example.strings.validateParenthesis
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class ValidateParenthesisTest {

    @Test
    fun testValidateParenthesis() {
        assertTrue(validateParenthesis("[{()}]".toCharArray()))     // Properly nested and matched
        assertTrue(validateParenthesis("[()()]{}".toCharArray()))   // Properly nested and matched
        assertFalse(validateParenthesis("([]".toCharArray()))       // Missing closing bracket
        assertFalse(validateParenthesis("([{]})".toCharArray()))    // Incorrect bracket order
        assertTrue(validateParenthesis("".toCharArray()))           // Edge case: empty input should be valid
        assertFalse(validateParenthesis("[".toCharArray()))         // Single unclosed bracket
        assertFalse(validateParenthesis("}".toCharArray()))         // Single closing bracket without opening
        assertFalse(validateParenthesis("[({})](".toCharArray()))   // Extra unmatched opening bracket
    }
}