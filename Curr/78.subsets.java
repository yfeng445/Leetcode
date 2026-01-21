/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        for (int i : nums) {
            List<List<Integer>> tmp = new ArrayList<>(ans);
            for (List<Integer> l : tmp) {             
                List<Integer> t = new ArrayList<>(l);
                t.add(i);
                ans.add(t);
            }
        }
        return ans;
    }
}

// @lc code=end

