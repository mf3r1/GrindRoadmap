class Solution {
    func isAnagram(_ s: String, _ t: String) -> Bool {
        guard s.count == t.count else { return false }

        var dictS: [Character:Int] = [:]
        var dictT: [Character:Int] = [:]
        

        for charS in s {
            if dictS[charS] == nil {
                dictS[charS] = 1
            } else {
                dictS[charS] = dictS[charS]! + 1
            }
        }

        for charT in t {
            if dictT[charT] == nil {
                dictT[charT] = 1
            } else {
                dictT[charT] = dictT[charT]! + 1
            }
        }

        return dictS == dictT
    }
}

/*
Swift problem 1:

Because += is a mutating operator that returns Void, not the new value. So you're effectively writing:
swiftdictS[charS] = Void
Which is a type error. It modifies in place and discards the result by design. The two correct alternatives are:
swift// Option 1: read, add, assign back
dictS[charS] = dictS[charS]! + 1

// Option 2: mutate in place directly (no reassignment needed)
dictS[charS]! += 1

Swift problem 2:

Swift String doesn't conform to RandomAccessCollection with integer indices because of how it handles Unicode. A single "character" can be composed of multiple code points (e.g. é can be e + a combining accent), so the length in memory isn't uniform per character — jumping to index i isn't O(1), so Swift simply doesn't allow it.
Instead, String uses String.Index, an opaque type that advances correctly through the underlying storage:

so don't use for i in 0..<s.count

use for charS in s {}

*/
