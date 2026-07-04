class Solution {
    func trap(_ height: [Int]) -> Int {
        var l = 0
        var r = height.count-1
        var maxLeft = height[l]
        var maxRight = height[r]
        var res = 0
        while(l<r) {
            if (maxLeft < maxRight) {
                l+=1
                maxLeft = max(maxLeft, height[l])
                res += maxLeft - height[l]
            } else {
                r-=1
                maxRight = max(maxRight, height[r])
                res += maxRight - height[r]
            }
        }

        return res
    }
}
