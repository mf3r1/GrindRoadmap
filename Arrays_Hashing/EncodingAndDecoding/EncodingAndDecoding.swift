class Codec {
    func encode(_ strs: [String]) -> String {
        var result = ""
        for s in strs {
            result += "\(s.count)#\(s)"
        }
    
        return result
    }
    
   func decode(_ s: String) -> [String] {
    let chars = Array(s)
    var num = ""
    var word = ""
    var decoded = [String]()
    var i = 0
    
    while i < chars.count {
        // Build the number until we hit '#'
        if chars[i] != "#" {
            num += String(chars[i])
            i += 1
        } else {
            // We hit '#', now extract the word
            i += 1  // Skip the '#'
            
            if let count = Int(num) {
                var j = 0
                while j < count {
                    word += String(chars[i])
                    i += 1
                    j += 1
                }
                decoded.append(word)
            }
            
            // Reset for next word
            num = ""
            word = ""
        }
    }
    
    return decoded
}
}
/**
 * Your Codec object will be instantiated and called as such:
 * let obj = Codec()
 * val s = obj.encode(strs)
 * let ans = obj.decode(s)
*/
