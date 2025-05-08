package org.example.arrays

/**
 * Class responsible for moving all zeroes to the end of the array
 * while maintaining relative order of non-zero elements.
 * The operation is performed in-place.
 */
class ZeroMover {
    /**
     * Moves all zeroes in `nums` to the end while maintaining order of non-zero elements.
     * The operation modifies the original array directly.
     *
     * Example 1:
     *
     * Input: nums = [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     * Example 2:
     *
     * Input: nums = [0]
     * Output: [0]
     * @param nums Array of integers containing zero and non-zero values.
     */
    fun moveZeroes(nums: IntArray) {
        var lastIndex = 0
        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[lastIndex] = nums[i]
                lastIndex++
            }
        }
        for (i in lastIndex..<nums.size) {
            nums[i] = 0
        }
    }
}