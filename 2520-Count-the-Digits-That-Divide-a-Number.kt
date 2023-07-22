Problem: https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/

Solution:

class Solution {
    fun countDigits(num: Int): Int {
        var counter = 0
        var digits = num
        while(digits > 0){
            val value = digits % 10
            if(num % value == 0)
                ++counter
            
            digits = digits / 10
        }

        return counter 
    }
}
