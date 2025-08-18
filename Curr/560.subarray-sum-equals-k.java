/*
 * @lc app=leetcode id=560 lang=java
 *
 * [560] Subarray Sum Equals K
 */

// @lc code=start
class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] prefix = new int[nums.length+1];
        prefix[0] = 0;
        for(int i = 0; i<nums.length; i++) prefix[i+1] = prefix[i] + nums[i];

        int cnt = 0;

        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i : prefix){
          if(freq.get(i-k)!=null) cnt+=freq.get(i-k);
          if(freq.get(i) == null) freq.put(i, 1);
          else freq.put(i, freq.get(i)+1);
        }

        return cnt;
    }
}
// @lc code=end

