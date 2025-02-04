
import java.util.Arrays;

/*
 * @lc app=leetcode id=1343 lang=java
 *
 * [1343] Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
 */

// @lc code=start
import java.util.Arrays;

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        if(arr.length < k){
            return 0;
        }

        int targetSum = threshold * k;
        int counter = 0;
        int currSum = 0;
        for(int i = 0; i<k; i++){
            currSum += arr[i];
        } 

        if(currSum >= targetSum){
            counter ++;
        }
        
        for(int i = k; i<arr.length; i++){
            currSum = currSum + arr[i] - arr[i-k];
            if(currSum >= targetSum){
                counter ++;
            }
        }

        return counter;
    }
}        
           

// @lc code=end

