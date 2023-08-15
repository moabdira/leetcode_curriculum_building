Problem: https://leetcode.com/problems/smallest-even-multiple/description/

Solution:
class Solution {
    fun smallestEvenMultiple(n: Int): Int = if(n%2 == 0) n else n*2
}
