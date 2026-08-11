package solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class Solution0009PalindromeNumberTest {

    private val solution = Solution0009PalindromeNumber()

    @Test
    fun isPalindrome1() {
        val x = 121

        val output = solution.isPalindrome(x)

        assertEquals(true, output)
    }

    @Test
    fun isPalindrome2() {
        val x = -121

        val output = solution.isPalindrome(x)

        assertEquals(false, output)
    }

    @Test
    fun isPalindrome3() {
        val x = 10

        val output = solution.isPalindrome(x)

        assertEquals(false, output)
    }
}