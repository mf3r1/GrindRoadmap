class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in 0..<nums.size) {
            map[nums[i]]?.let {
                map[nums[i]] = (map[nums[i]] ?: 0) + 1
            } ?: run {
                map[nums[i]] = 0
                map[nums[i]] = (map[nums[i]] ?: 0) + 1
            }
        }

        return map.entries.sortedByDescending { it.value }.take(k).map { it.key }
        .toIntArray()
    }
}
