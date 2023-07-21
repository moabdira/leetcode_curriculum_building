Problem: https://leetcode.com/problems/decompress-run-length-encoded-list/description/

Solution: 

class Solution {
    fun decompressRLElist(nums: IntArray): IntArray {
        var size = 0
        for(i in nums.indices step 2)
            size += nums[i]
        
        val output = IntArray(size)

        var i = 0; var j = 0
        while(i < nums.size) {
            repeat(nums[i]){
                if(i+1 < nums.size){
                    output[j] = nums[i+1]
                    ++j
                }
            }

            i += 2
        }

        return output
    }
}
