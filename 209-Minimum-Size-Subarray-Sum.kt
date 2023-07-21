Problem: https://leetcode.com/problems/minimum-size-subarray-sum/description/

Solution: Sliding Window with O(N) time complexity and O(1) space complexity

class Solution {
    fun printSubArray(arr: IntArray, start: Int, end: Int){
        var i = start
        print("[")
        while(i <= end){
            print("${arr[i]},")
            ++i
        }
        print("]")
    }

    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var minLength = Int.MAX_VALUE

        var pt1 = 0; var pt2 = 0
        var sum = nums[pt1]
        while(pt2 < nums.size){
            //printSubArray(nums, pt1, pt2)
            //println(" sum=$sum minLength=$minLength")
            if(sum >= target){
                if((pt2 - pt1) < minLength)
                    minLength = pt2 - pt1
                
                sum -= nums[pt1]
                ++pt1

                continue
            } 

            ++pt2
            if(pt2 < nums.size)
                sum += nums[pt2]
        }

        return if(minLength == Int.MAX_VALUE) 0 else minLength + 1
    }
}
