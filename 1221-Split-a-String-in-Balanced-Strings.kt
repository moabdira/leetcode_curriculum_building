Problem: https://leetcode.com/problems/split-a-string-in-balanced-strings/description/

Solution 1:
class Solution {
    fun balancedStringSplit(s: String): Int {
        var output = 0
        var R = 0; var L = 0
        
        s.forEach{
            if(it == 'R') ++R
            else if(it == 'L') ++L

            if(R > 0 && L > 0 && R == L){
                ++output
                R = 0
                L = 0
            }
        }

        return output
    }
}

Solution 2:
class Solution {
    fun balancedStringSplit(s: String): Int {
        var output = 0
        var balanced = 0 
        s.forEach{
            balanced += if(it == 'L') 1 else -1
            if(balanced == 0) ++output 
        }

        return output
    }
}
