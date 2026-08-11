package solutions

class Solution0009PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        var num: Int = x

        if (num < 0) return false

        val numListRev = mutableListOf<Int>()

        while (num > 0) {
            val digit = num % 10
            numListRev.add(digit)

            num /= 10
        }

        return (numListRev == numListRev.reversed())
    }
}