package solutions

class Solution0001TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        if ((nums.size == 2) && (nums[0] == nums[1])) {
            return intArrayOf(0,1)
        }

        for ((index1, value1) in nums.iterator().withIndex()) {
            for ((index2, value2) in nums.iterator().withIndex()) {
                if (index1 == index2) {
                    // Pass
                }

                if ( (value1 != value2) && (value1 + value2 == target) ) {
                    return intArrayOf(index1, index2)
                }
            }
        }
        return intArrayOf()
    }
}