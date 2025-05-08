package org.example.arrays

/**
 * Class responsible for finding missing numbers in an array.
 * Given an array nums of size n where nums[i] is in the range [1, n],
 * return a list of all numbers in the range [1, n] that are missing from nums.
 */
class FindMissingNumber {
    /**
     * Finds missing numbers from the range [1, n] in the given nums array.
     *
     * @param nums Array of integers where nums[i] is in range [1, n].
     * @return List of missing numbers.
     */


    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        for (i in nums.indices) {
            if (nums[Math.abs(nums[i]) - 1] > 0) {
                nums[Math.abs(nums[i]) - 1] *= -1
            }
        }
        val missingNumber = mutableListOf<Int>()
        for (i in nums.indices) {
            if (nums[i] > 0) {
                missingNumber.add(i + 1)
            }
        }
        missingNumber.forEach { println(it) }
        return missingNumber
    }

}