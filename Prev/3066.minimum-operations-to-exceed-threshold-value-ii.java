/*
 * @lc app=leetcode id=3066 lang=java
 *
 * [3066] Minimum Operations to Exceed Threshold Value II
 */

// @lc code=start

import java.util.PriorityQueue;
import java.util.Arrays;

class Solution {
    public int minOperations(int[] nums, int k) {
        if (nums.length < 2) return 0;
        Arrays.sort(nums);
        if (nums[0] >= k) {
            return 0;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val : nums) {
            if (val < k) {
                pq.offer(val);
            } else {
                break;
            }
        }
        int operations = 0;

        while (pq.size() >= 2) {
            //System.out.println(pq.toString());
            if (pq.peek() >= k) {
                break;
            }

            int x = pq.poll();
            int y = pq.poll();

            int combined = (x * 2 + y)>0?(x * 2 + y): Integer.MAX_VALUE;

            if (combined < k) {
                pq.offer(combined);
            }

            operations++;
        }

        return pq.size() == 1?operations+1: operations;
    }
}

// @lc code=end

