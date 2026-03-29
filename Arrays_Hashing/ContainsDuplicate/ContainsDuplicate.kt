fun main() {
    val sol = Solution()
    val input = intArrayOf(1,1,1,3,3,4,3,2,4,2)
    sol.containsDuplicate(nums=input)
}

class Solution {
   fun containsDuplicate(nums: IntArray): Boolean { 
   	  val map = HashMap<Int, Boolean>()
      for (i in 0..<nums.size) {
          if(map[nums[i]] == null) {
              map[nums[i]] = true
          } else {
             return true
          }
      }
      return false
   }
}