/*
 * @lc app=leetcode id=1726 lang=java
 *
 * [1726] Tuple with Same Product
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int tupleSameProduct(int[] nums) {
        if(nums.length < 4){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(map.get(nums[i]*nums[j]) == null){
                    map.put(nums[i]*nums[j], 1);
                }
                else{
                    map.put(nums[i]*nums[j], map.get(nums[i]*nums[j])+1);
                }
            }
        }
        int count = 0;
        for(HashMap.Entry<Integer, Integer> en : map.entrySet()){
            if(en.getValue()>1){
                count +=get(en.getValue());
            }
        }

        return count*8;
    }

    public int get(int i){
        i--;
        int rtn = 1;
        while(i != 1){
            rtn += i;
            i--;
        }
        return rtn;
    }
}
// @lc code=end

