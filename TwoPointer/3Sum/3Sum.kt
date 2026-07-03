class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()                                    // in-place, stays IntArray
        val result = mutableListOf<List<Int>>()
        for(i in 0..<nums.size) {
            if (i > 0 && nums[i] == nums[i - 1]) continue
            twoSum(i, nums, result)
        }
        return result
    }

    fun twoSum(i: Int, input: IntArray, result: MutableList<List<Int>>): List<List<Int>> {
        var l = i+1
        var r = input.size-1 
        while(l<r) {
           val sum = input[i] + input[l] + input[r]
           if (sum < 0) {
            l++
           } else if (sum > 0) {
            r--
           } else {
            result.add(listOf(input[i], input[l], input[r]))
            l++
            r--
            while (l < r && input[l] == input[l - 1]) l++
           }
        }
        return result
    }
}
