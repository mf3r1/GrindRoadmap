class Solution {
    fun longestConsecutive(nums: IntArray): Int {
    val mySet = HashSet<Int>()

    for (n in nums) {
        mySet.add(n)
    }

    var longest = 0

    for (n in mySet) {
        if ((n - 1) !in mySet) {
          
            var current = n
            var length = 1

            while ((current + 1) in mySet) {
                current += 1
                length += 1
            }

            longest = maxOf(longest, length)
        }
    }

    return longest
}
}
