package leetCodeTypes



class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return ListNode.linkedListToList(this).contentToString()
    }

    fun len(): Int {
        return 0
    }

    companion object {
        fun linkedListToList(node: ListNode?): IntArray {
            var node: ListNode? = node
            val values = mutableListOf<Int>()

            while (node != null) {
                values.add(node.`val`)
                node = node.next
            }

            return values.toIntArray()
        }

        fun listToLinkedList(values: IntArray): ListNode? {
            val dummy = ListNode(0)
            var cur: ListNode? = dummy

            for (value in values) {
                cur?.next = ListNode(value)
                cur = cur?.next
            }

            return dummy.next
        }
    }
}