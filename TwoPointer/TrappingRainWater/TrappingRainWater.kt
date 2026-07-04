class Solution {
    fun trap(height: IntArray): Int {
        var l = 0
        var r = height.size-1 
        var leftMax = height[l]
        var rightMax = height[r]
        var result = 0
        while (l<r) {
            if(leftMax < rightMax) {
                l++
                leftMax = max(leftMax, height[l])
                result += leftMax - height[l]
            } else { 
                r--
                rightMax = max(rightMax, height[r])
                result += rightMax - height[r]
            }
        }

        return result
    }
}
