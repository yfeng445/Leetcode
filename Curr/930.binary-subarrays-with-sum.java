/*
 * @lc app=leetcode id=930 lang=java
 *
 * [930] Binary Subarrays With Sum
 */

// @lc code=start
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
      if(nums.length == 1) return nums[0] == goal ? 1 : 0;
      int[] prefix = new int[nums.length+1];
      prefix[0] = 0;
      for(int i = 0; i<nums.length; i++) prefix[i+1] = prefix[i] + nums[i];

      int cnt = 0;
      HashMap<Integer, Integer> map = new HashMap<>();

      for(int i : prefix){
        if(map.get(i-goal)!=null) cnt+=map.get(i-goal);
        if(map.get(i) == null) map.put(i, 1);
        else map.put(i, map.get(i)+1);
      }

      return cnt;
    }
}
// @lc code=end

