let sol = Solution()
let input = [1,1,1,3,3,4,3,2,4,2]
print(sol.containsDuplicate(input))

class Solution {
    func containsDuplicate(_ nums: [Int]) -> Bool {
        var dict: [Int: Bool] = [:]
        for i in 0..<nums.count {
            if dict[nums[i]] == nil {
                dict[nums[i]] = true 
            } else {
                return true
            }
        }
        return false
    }
}
