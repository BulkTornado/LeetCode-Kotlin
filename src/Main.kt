import solutions.Solution0001TwoSum

fun main() {
    val test = Solution0001TwoSum()

    // Test 1
    val nums01 = IntArray(4)
    nums01[0] = 2
    nums01[1] = 7
    nums01[2] = 11
    nums01[3] = 15
    val result01 = test.twoSum(nums01, 9)
    println(result01.contentToString())

    // Test 2
    val nums02 = IntArray(3)
    nums02[0] = 3
    nums02[1] = 2
    nums02[2] = 4
    val result02 = test.twoSum(nums02, 6)
    println(result02.contentToString())

    // Test 3
    val nums03 = IntArray(2)
    nums03[0] = 3
    nums03[1] = 3
    val result03 = test.twoSum(nums03, 6)
    println(result03.contentToString())
}