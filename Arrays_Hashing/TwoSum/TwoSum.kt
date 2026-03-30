class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in 0..<nums.size) {
            map[nums[i]] = i
        }

        for(i in 0..<nums.size) {
            val complement = target - nums[i]
            if (map[complement] != null && map[complement] != i) {
                return intArrayOf(i, map[complement]!!)
            }
        }

        return intArrayOf(0,0)
    }
}
