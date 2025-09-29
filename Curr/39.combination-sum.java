/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> c = new ArrayList<>();
        for (int x : candidates) c.add(x);
        c.sort(Collections.reverseOrder()); 
        return helper(c, target, 0);
    }

    public List<List<Integer>> helper(ArrayList<Integer> c, int target, int pos) {
        if (target == 0) {
            List<List<Integer>> base = new ArrayList<>();
            base.add(new ArrayList<>());
            return base;
        }
        if (pos == c.size() || target < 0) return new ArrayList<>();
        int val = c.get(pos);
        List<List<Integer>> res = new ArrayList<>();

        if (val <= target) {
            List<List<Integer>> take = helper(c, target - val, pos);
            for (List<Integer> lst : take) {
                lst.add(val);          
                res.add(lst);
            }
        }

        res.addAll(helper(c, target, pos + 1));
        return res;
    }

}
// @lc code=end

