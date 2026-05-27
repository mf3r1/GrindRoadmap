class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val length = nums.size
        val left = IntArray(length) 
        val right = IntArray(length)  
        val answer = IntArray(length)

        left[0] = 1
        for (i in 1..<length) {
            left[i] = nums[i-1] * left[i-1]
        } 

        right[length-1] = 1
        for(i in length-2 downTo 0) {
            right[i] = nums[i+1] * right[i+1]
        }

        for(i in 0..<length) {
            answer[i] = left[i] * right[i]
        }

        return answer
    }
}

