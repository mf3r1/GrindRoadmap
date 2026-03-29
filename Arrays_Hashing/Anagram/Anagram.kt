// Version 1
class Solution {
      fun isAnagram(s: String, t: String): Boolean {
      	val mapS = HashMap<Char, Int>()
        val mapT = HashMap<Char, Int>()

        if(s.length != t.length) return false 
          
        for (i in 0..<s.length) {
           if(mapS[s[i]] == null) {
               mapS[s[i]] = 1
           } else {
               mapS[s[i]] = mapS[s[i]]!! + 1
           }
        }
        
        for (i in 0..<t.length) {
           if(mapT[t[i]] == null) {
               mapT[t[i]] = 1
           } else {
                mapT[t[i]] = mapT[t[i]]!! + 1
           }
        }
        
        return mapT == mapS
      }
}

// Version 2
class Solution {
      fun isAnagram(s: String, t: String): Boolean {
      	val map = HashMap<Char, Int>()

        if(s.length != t.length) return false 
          
        for (i in 0..<s.length) {
           if(map[s[i]] == null) {
               map[s[i]] = 1
           } else {
               map[s[i]] = map[s[i]]!! + 1
           }
        }
        
        for (i in 0..<t.length) {
           if(map[t[i]] == null) {
               return false
           } else if (map[t[i]]!! <= 0) {
               return false
           } else {
               map[t[i]] = map[t[i]]!! - 1
           }
        }
        
        return true 
      }
}

