Problem: https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/

Solution:
class Solution {
    fun isPalindrome(word: String): Boolean {
        var start = 0; var end = word.length - 1
        while(start <= end){
            if(word[start] != word[end])
                return false
            
            ++start
            --end
        }

        return true
    }

    fun firstPalindrome(words: Array<String>): String {
        words.forEach{ 
            if(isPalindrome(it)) 
                return it
        }

        return ""
    }
}
