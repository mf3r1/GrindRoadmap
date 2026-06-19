class Solution {
    func isValidSudoku(_ board: [[Character]]) -> Bool {
        var rows = [[Int: Bool]](repeating: [:], count: 9)
        var cols = [[Int: Bool]](repeating: [:], count: 9)
        var squares = [[[Int: Bool]]](repeating: [[Int: Bool]](repeating: [:], count: 3), count: 3)

        for r in 0..<9 {
            for c in 0..<9 {
                let cell = board[r][c]
                guard cell != "." else { continue }

                let num = Int(String(cell))!

                if rows[r][num] == true { return false }
                if cols[c][num] == true { return false }
                if squares[r/3][c/3][num] == true { return false }

                rows[r][num] = true
                cols[c][num] = true
                squares[r/3][c/3][num] = true
            } 
        }
        return true
    }
}

class Solution {
    func isValidSudoku(_ board: [[Character]]) -> Bool {
        var rows = [Set<Int>](repeating: [], count: 9)
        var cols = [Set<Int>](repeating: [], count: 9)
        var squares = [[Set<Int>]](repeating: [Set<Int>](repeating: [], count: 3), count: 3)

        for r in 0..<9 {
            for c in 0..<9 {
                let cell = board[r][c]
                guard cell != "." else { continue }

                let num = Int(String(cell))!

                if rows[r].contains(num) { return false }
                if cols[c].contains(num) { return false }
                if squares[r/3][c/3].contains(num) { return false }

                rows[r].insert(num)
                cols[c].insert(num)
                squares[r/3][c/3].insert(num)
            }
        }

        return true
    }
}
