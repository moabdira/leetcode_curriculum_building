Problem: https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/

Solution: 
class Solution {
    fun firstPalindrome(words: Array<String>): String {
        words.forEachIndexed{index, word -> 
            if(word == word.reversed())
                return word
        }

        return ""
    }
}
