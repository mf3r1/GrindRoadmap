class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val solution: MutableList<MutableList<String>> = mutableListOf()
        val map = mutableMapOf<String, MutableList<String>>()

        for(i in 0..<strs.size) {
           	val key = String(strs[i].toCharArray().sortedArray())
            map[key]?.let {
                it.add(strs[i])
            }?:run {
                map[key] = mutableListOf()
                map[key]?.add(strs[i])
            }
        }
        
        map.forEach { m ->
            solution.add(m.value)
        }
        
        return solution
}
}
