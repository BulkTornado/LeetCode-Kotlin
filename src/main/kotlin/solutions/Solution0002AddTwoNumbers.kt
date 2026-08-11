package solutions

import leetcodeTypes.ListNode

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution0002AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var l1Copy: ListNode? = l1
        var l2Copy: ListNode? = l2

        val result: ListNode? = ListNode(0)
        var cur: ListNode? = result

        var carry: Int = 0

        while (l1Copy != null || l2Copy != null || carry != 0) {
            val v1 = l1Copy?.`val` ?: 0
            val v2 = l2Copy?.`val` ?: 0

            // new digit
            var value: Int = v1 + v2 + carry
            carry = value / 10
            value %= 10
            cur?.next = ListNode(value)

            // update ptw
            cur = cur?.next
            l1Copy = l1Copy?.next
            l2Copy = l2Copy?.next
        }

        return result?.next
    }
}