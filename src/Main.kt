import solutions.Solution0001TwoSum

fun main() {
    val test = Solution0001TwoSum()

    // Test 1
    val nums01 = intArrayOf(2,7,11,15)
    val result01 = test.twoSum(nums01, 9)
    println(result01.contentToString())

    // Test 2
    val nums02 = intArrayOf(3,2,4)
    val result02 = test.twoSum(nums02, 6)
    println(result02.contentToString())

    // Test 3
    val nums03 = intArrayOf(3,3)
    val result03 = test.twoSum(nums03, 6)
    println(result03.contentToString())
}