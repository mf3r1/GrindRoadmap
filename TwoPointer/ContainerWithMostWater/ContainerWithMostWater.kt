class Solution {
    fun maxArea(height: IntArray): Int {
        var l = 0
        var r = height.size-1 
        var water = 0
        while (l<r) {
            water = max(water, (r-l) * min(height[l], height[r]))
            if(height[l] < height[r]) {
                l++
            } else if (height[r] < height[l]) { 
                r--
            } else {
                l++
            }
        }

        return water
    }
}
