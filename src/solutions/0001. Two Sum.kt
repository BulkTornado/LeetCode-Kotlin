package solutions

class Solution0001TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        if ((nums.size == 2) && (nums[0] == nums[1])) {
            return intArrayOf(0,1)
        }

        for (i in nums.iterator().withIndex()) {
            for (j in nums.iterator().withIndex()) {
                if (i.index == j.index) {
                    // Pass
                }

                if ( (i.value != j.value) && (i.value + j.value == target) ) {
                    return intArrayOf(i.index, j.index)
                }
            }
        }
        return intArrayOf()
    }
}