class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        var dict: [Int: Int] = [:]
        for i in 0..<nums.count {
            dict[nums[i]] = i
        }
        
        for j in 0..<nums.count {
            if let idx = dict[target - nums[j]], idx != j {
                return [dict[target - nums[j]]!, j]
            }
        }
        
         return [-1,-1]
    }
}
