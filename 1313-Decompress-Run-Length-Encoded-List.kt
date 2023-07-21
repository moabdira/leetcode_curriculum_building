Problem: https://leetcode.com/problems/decompress-run-length-encoded-list/description/

Solution: 

class Solution {
    fun decompressRLElist(nums: IntArray): IntArray {
        var result = mutableListOf<Int>()
        var i = 0
        while(i < nums.size) {
            repeat(nums[i]){
                if(i+1 < nums.size)
                    result.add(nums[i+1])
            }

            i += 2
        }

        return result.toIntArray()
    }
}
