/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
/* 
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for(int i = 0; i<numbers.length-1; i++){
            for(int j = i+1; j<numbers.length; j++){
                if((numbers[i]+numbers[j]) == target){
                    result[0] = i+1;
                    result[1] = j+1;
                    return result;
                }
            }
        }
        return result;
    }
}
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0, right = numbers.length-1;
        while((numbers[left]+numbers[right])!=target){
            if((numbers[left]+numbers[right])>target) right--;
            else left++;
        }
        result[0] = left+1;
        result[1] = right+1;
        return result;
    }
}

// @lc code=end

