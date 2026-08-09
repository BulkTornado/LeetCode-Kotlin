import solutions.Solution0002AddTwoNumbers
import leetCodeTypes.ListNode

fun main() {
    val solution = Solution0002AddTwoNumbers()

    // Test 1
    val l11: ListNode? = ListNode.listToLinkedList(intArrayOf(2,4,3))
    val l21: ListNode? = ListNode.listToLinkedList(intArrayOf(5,6,4))
    val result01: ListNode? = solution.addTwoNumbers(l11, l21)
    println(result01)

    // Test 2
    val l12: ListNode? = ListNode.listToLinkedList(intArrayOf(0))
    val l22: ListNode? = ListNode.listToLinkedList(intArrayOf(0))
    val result02: ListNode? = solution.addTwoNumbers(l12, l22)
    println(result02)

    // Test 3
    val l13: ListNode? = ListNode.listToLinkedList(intArrayOf(9,9,9,9,9,9,9))
    val l23: ListNode? = ListNode.listToLinkedList(intArrayOf(9,9,9,9))
    val result03: ListNode? = solution.addTwoNumbers(l13, l23)
    println(result03)
}