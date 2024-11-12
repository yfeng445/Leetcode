/*
 * @lc app=leetcode id=2070 lang=java
 *
 * [2070] Most Beautiful Item for Each Query
 */

// @lc code=start
import java.util.Arrays;
class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));
        int maxBeauty = 0;
        for (int i = 0; i < items.length; i++) {
            maxBeauty = Math.max(maxBeauty, items[i][1]);
            items[i][1] = maxBeauty; 
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int price = queries[i];
            int left = 0, right = items.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (items[mid][0] <= price) {
                    left = mid + 1; 
                } else {
                    right = mid - 1; 
                }
            }
            result[i] = (right >= 0) ? items[right][1] : 0;
        }
        return result;
    }
}

// @lc code=end

