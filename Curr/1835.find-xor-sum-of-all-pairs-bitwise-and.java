/*
 * @lc app=leetcode id=1835 lang=java
 *
 * [1835] Find XOR Sum of All Pairs Bitwise AND
 */

// @lc code=start
class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> hm1 = getFreq(arr1);
        HashMap<Integer, Integer> hm2 = getFreq(arr2);

        int result1 = 0;
        for(int key : hm1.keySet()) result1 = result1 ^ key;
        int result2 = 0;
        for(int key : hm2.keySet()) result2 = result2 ^ key;

        return result1 & result2;
    }

    public HashMap<Integer, Integer> getFreq(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.get(i) == null) map.put(i, 1);
            else map.remove(i);
        }

        return map;
    }
}
// @lc code=end

