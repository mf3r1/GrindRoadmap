func longestConsecutive(_ nums: [Int]) -> Int {
    var mySet = Set<Int>()
    
    for i in 0..<nums.count {
        mySet.insert(nums[i])
    }
    
    var longest = 0  
    
    for n in mySet {
        if !mySet.contains(n-1) {
            var current = n
            var length = 1
            while mySet.contains(current + 1) {
                current += 1
                length += 1
            }
            
            longest = max(longest, length)
            
        }
    }
    
    return longest    
}

