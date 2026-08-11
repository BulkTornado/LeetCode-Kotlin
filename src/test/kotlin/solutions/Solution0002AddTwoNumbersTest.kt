package solutions

import leetcodeTypes.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class Solution0002AddTwoNumbersTest {

    private val solution = Solution0002AddTwoNumbers()

    @Test
    fun addTwoNumbers1() {
        val l1 = ListNode.listToLinkedList(intArrayOf(2, 4, 3))
        val l2 = ListNode.listToLinkedList(intArrayOf(5, 6, 4))

        val result = solution.addTwoNumbers(l1, l2)

        assertContentEquals(
            intArrayOf(7, 0, 8),
            ListNode.linkedListToList(result)
        )
    }

    @Test
    fun addTwoNumbers2() {
        val l1 = ListNode.listToLinkedList(intArrayOf(0))
        val l2 = ListNode.listToLinkedList(intArrayOf(0))

        val result = solution.addTwoNumbers(l1, l2)

        assertContentEquals(
            intArrayOf(0),
            ListNode.linkedListToList(result)
        )
    }

    @Test
    fun addTwoNumbers3() {
        val l1 = ListNode.listToLinkedList(
            intArrayOf(9, 9, 9, 9, 9, 9, 9)
        )
        val l2 = ListNode.listToLinkedList(
            intArrayOf(9, 9, 9, 9)
        )

        val result = solution.addTwoNumbers(l1, l2)

        assertContentEquals(
            intArrayOf(8, 9, 9, 9, 0, 0, 0, 1),
            ListNode.linkedListToList(result)
        )
    }
}