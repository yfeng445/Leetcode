/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
import java.util.Arrays;
class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 1;
        Arrays.sort(nums);
        int current = nums[0];
        System.out.println(Arrays.toString(nums));
        for(int i = 1; i<nums.length; i++){
           // System.out.println("Current: "+nums[i]);
            if(nums[i] == current){
                System.out.println("Matched:"+nums[i]);
                count++;
                if(count > nums.length/2){
                    majorityElement = current;
                    break;
                }
            }
            else{
                count = 1; 
                current = nums[i];
            }
        }
        return majorityElement;
    }
}
// @lc code=end

