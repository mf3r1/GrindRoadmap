class Solution {
    func maxArea(_ height: [Int]) -> Int {
    var l = 0
    var r = height.count-1 
    var water = 0
    while (l<r) {
        water = max(water, (r-l) * min(height[l], height[r]))
        if (height[l] < height[r]) {
            l+=1
        } else if (height[l] > height[r]) {
            r-=1
        } else {
            l+=1
        }
    }
    
    return water
}
}
