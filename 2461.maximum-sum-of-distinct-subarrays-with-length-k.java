/*
 * @lc app=leetcode id=2461 lang=java
 *
 * [2461] Maximum Sum of Distinct Subarrays With Length K
 */

// @lc code=start
import java.util.HashMap;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        long currSum = 0, maxSum = 0;

        for (int i = 0; i < nums.length; i++) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
            currSum += nums[i];

            if (i >= k) {
                int toRemove = nums[i - k];
                freqMap.put(toRemove, freqMap.get(toRemove) - 1);
                if (freqMap.get(toRemove) == 0) {
                    freqMap.remove(toRemove);
                }
                currSum -= toRemove;
            }

            if (freqMap.size() == k) {
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }
}

// @lc code=end

