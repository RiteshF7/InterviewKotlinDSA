import org.example.arrays.FindMissingNumber
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindMissingNumberTest {

    private val finder = FindMissingNumber()

    /**
     * Test case for standard input scenario.
     */
    @Test
    fun testBasicScenario() {
        val nums = intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)
        assertEquals(listOf(5, 6), finder.findDisappearedNumbers(nums))
    }

    /**
     * Test case where only one number is missing.
     */
    @Test
    fun testSingleMissingNumber() {
        val nums = intArrayOf(1, 1)
        assertEquals(listOf(2), finder.findDisappearedNumbers(nums))
    }

    /**
     * Test case where no numbers are missing.
     */
    @Test
    fun testNoMissingNumbers() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        assertEquals(emptyList<Int>(), finder.findDisappearedNumbers(nums))
    }

    /**
     * Test case where all numbers are missing.
     */
    @Test
    fun testAllNumbersMissing() {
        val nums = intArrayOf(2, 2, 2, 2, 2)
        assertEquals(listOf(1, 3, 4, 5), finder.findDisappearedNumbers(nums))
    }

    /**
     * Test case with larger input sizes.
     */
    @Test
    fun testLargeInput() {
        val nums = (1..100).toList().toIntArray()
        assertEquals(emptyList<Int>(), finder.findDisappearedNumbers(nums))
    }
}