import org.example.arrays.TwoSumSolver
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TwoSumSolverTest {

    private val solver = TwoSumSolver()

    @Test
    fun testExampleCases() {
        assertArrayEquals(intArrayOf(0, 1), solver.twoSum(intArrayOf(2, 7, 11, 15), 9))
        assertArrayEquals(intArrayOf(1, 2), solver.twoSum(intArrayOf(3, 2, 4), 6))
        assertArrayEquals(intArrayOf(0, 1), solver.twoSum(intArrayOf(3, 3), 6))
    }

    @Test
    fun testNegativeNumbers() {
        assertArrayEquals(intArrayOf(0, 2), solver.twoSum(intArrayOf(-1, -2, -3, -4, -5), -4))
    }


}