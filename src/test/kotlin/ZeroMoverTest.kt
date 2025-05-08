import org.example.arrays.ZeroMover
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ZeroMoverTest {

    private val solver = ZeroMover()

    /**
     * Test basic input scenario where 0s are interspersed within non-zero numbers.
     */
    @Test
    fun testBasicScenario() {
        val nums = intArrayOf(0, 1, 0, 3, 12)
        solver.moveZeroes(nums)
        assertArrayEquals(intArrayOf(1, 3, 12, 0, 0), nums)
    }

    /**
     * Test scenario where all elements are already zeros.
     */
    @Test
    fun testAllZeros() {
        val nums = intArrayOf(0, 0, 0)
        solver.moveZeroes(nums)
        assertArrayEquals(intArrayOf(0, 0, 0), nums)
    }

    /**
     * Test scenario where there are no zeros in the array.
     */
    @Test
    fun testNoZeros() {
        val nums = intArrayOf(1, 2, 3, 4)
        solver.moveZeroes(nums)
        assertArrayEquals(intArrayOf(1, 2, 3, 4), nums)
    }

    /**
     * Test scenario where array has only one element.
     */
    @Test
    fun testSingleElement() {
        val nums = intArrayOf(0)
        solver.moveZeroes(nums)
        assertArrayEquals(intArrayOf(0), nums)
    }

    /**
     * Test scenario where array has zero at the beginning.
     */
    @Test
    fun testZeroAtStart() {
        val nums = intArrayOf(0, 5, 1, 0, 2)
        solver.moveZeroes(nums)
        assertArrayEquals(intArrayOf(5, 1, 2, 0, 0), nums)
    }

    /**
     * Test scenario where array consists of multiple consecutive zeros in the middle.
     */
    @Test
    fun testConsecutiveZerosMiddle() {
        val nums = intArrayOf(1, 0, 0, 2, 3)
        solver.moveZeroes(nums)
        assertArrayEquals(intArrayOf(1, 2, 3, 0, 0), nums)
    }
}