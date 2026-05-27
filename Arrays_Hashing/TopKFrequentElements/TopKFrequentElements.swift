class Solution {
    func topKFrequent(_ nums: [Int], _ k: Int) -> [Int] {
        var dict: [Int: Int] = [:]
        
        for n in nums {
            if dict[n] == nil {
                dict[n] = 1
            } else {
                dict[n]! += 1
            }
        }

        return dict.sorted { $0.value > $1.value }
           .prefix(k)
           .map { $0.key }
    }
}

/*
dict[n]! += 1
// is sugar for
dict[n]! = dict[n]! + 1

*/
