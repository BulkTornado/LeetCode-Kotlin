package solutions

import kotlin.test.Test
import kotlin.test.assertContentEquals

class Solution0001TwoSumTest {

    private val solution = Solution0001TwoSum()

    @Test
    fun twoSum1() {
        val nums = intArrayOf(2,7,11,15)

        val result: IntArray = solution.twoSum(nums, 9)

        assertContentEquals(intArrayOf(1,0), result)
    }

    @Test
    fun twoSum2() {
        val nums = intArrayOf(3,2,4)

        val result = solution.twoSum(nums, 6)

        assertContentEquals(intArrayOf(2,1), result)
    }

    @Test
    fun twoSum3() {
        val nums = intArrayOf(3,3)

        val result = solution.twoSum(nums, 6)

        assertContentEquals(intArrayOf(1,0), result)
    }
}