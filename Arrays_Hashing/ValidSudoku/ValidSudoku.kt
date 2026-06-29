
class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
       	val rows = Array(9) { HashSet<Int>() }
val cols = Array(9) { HashSet<Int>() }
val squares = Array(3) { Array(3) { HashSet<Int>() } }

                	
         for (r in 0..<9) {
             for (c in 0..<9) {
    			 val cell = board[r][c]
                 if (cell == '.') continue
                 val num = cell.digitToInt()
                 
                 if (rows[r].contains(num)) return false
                 if (cols[c].contains(num)) return false
                 if (squares[r / 3][c / 3].contains(num)) return false

                 rows[r].add(num)
                 cols[c].add(num)
                 squares[r / 3][c / 3].add(num)
                 
             }
         }
        
        
     	
        return true
        
        
    }
}
