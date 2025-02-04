/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<Integer> vals = new ArrayList<>();
        for(int i : nums){
            vals.add(i);
        }
        //System.out.println(vals.toString());

        List<List<Integer>> rtn = new ArrayList<>();
        int boundary = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] >= 0){
                boundary = i;
                break;
            } 
        }

        // System.out.println(vals.toString() + boundary);

        for(int i = 0; i<boundary; i++){
            for(int j = boundary; j<nums.length; j++){
                for(int k = i + 1; k<j; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[k]);
                        tmp.add(nums[j]);
                        rtn.add(tmp);
                        break;
                    }
                }
            }
        }

        Set<List<Integer>> tmp = new HashSet<>(rtn);
        List<List<Integer>> returnList = new ArrayList<List<Integer>>(tmp);


        return returnList;
    }
}
// @lc code=end

