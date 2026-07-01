class Solution {
    fun isPalindrome(s: String): Boolean {
        val cleaned = s.filter { it.isLetterOrDigit() }.lowercase()
        var left = 0
        var right = cleaned.length -1 
        while (left < right) {
            if (cleaned[left] != cleaned[right]) return false
            left++
            right--
        }
        return true
    }
}
