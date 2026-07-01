class Solution {
    func isPalindrome(_ s: String) -> Bool {
        let cleaned = Array(s.filter { $0.isLetter || $0.isNumber }.lowercased())
        var left = 0
        var right = cleaned.count-1
        while (left < right) {
            if cleaned[left] != cleaned[right] { return false } 
            left+=1
            right-=1
        }
        return true
    }
}
