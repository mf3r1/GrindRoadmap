class Codec {
    fun encode(strs: List<String>): String {
        val sb = StringBuilder()
        for (s in strs) {
            sb.append(s.length).append('#').append(s)
        }
        return sb.toString()
    }
   
    fun decode(s: String): List<String> {
        val result = mutableListOf<String>()
        var i = 0

        while (i < s.length) {
            var j = i
            while (s[j] != '#') j++

            val len = s.substring(i, j).toInt()
            val str = s.substring(j + 1, j + 1 + len)

            result.add(str)
            i = j + 1 + len
        }

        return result
    }
}

/**
 * Your Codec object will be instantiated and called as such:
 * var obj = Codec()
 * val s = obj.encode(strs)
 * val ans = obj.decode(s)
 */
