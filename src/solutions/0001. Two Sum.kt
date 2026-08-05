package solutions

class Solution0001TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashmap = HashMap<Int, Int>()

        var complement: Int

        for (i in nums.indices) {
            complement = target - nums[i]
            if ((complement in hashmap) && hashmap[complement] != i) {
                return intArrayOf(i, hashmap[complement]!!)
            }
            hashmap[nums[i]] = i
        }

        // If no valid pair is found, return an empty array
        return intArrayOf()
    }
}