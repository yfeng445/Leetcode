/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permute(int[] a) {
        List<Integer> nums = new ArrayList<>();
        for (int x : a) nums.add(x);
        return helper(nums);
    }

    private List<List<Integer>> helper(List<Integer> nums) {
        if (nums.isEmpty()) {
            List<List<Integer>> base = new ArrayList<>();
            base.add(new ArrayList<>());  
            return base;
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            int pick = nums.get(i);
            List<Integer> rest = new ArrayList<>(nums);
            rest.remove(i);              
            for (List<Integer> p : helper(rest)) {
                List<Integer> q = new ArrayList<>(p);
                q.add(pick);                          
                res.add(q);
            }
        }
        return res;
    }
}

// @lc code=end

