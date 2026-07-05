class Solution {
    func calPoints(_ operations: [String]) -> Int {
        let operations = Array(operations)
        var stack: [Int] = []
        var sum = 0
        for o in operations {
            if o == "+" {
                let r = stack.popLast()
                let l = stack.last
                let lrSum = r! + l!
                stack.append(r!)
                stack.append(lrSum)
            } else if o == "D" {
                let l = stack.last
                stack.append(l! * 2)
            } else if o == "C" {
                let _ = stack.popLast()
            } else {
                stack.append(Int(o)!)
            }
        }

        for s in stack {
            sum += s
        }

        return sum
    }
}

