/*
 * @lc app=leetcode id=134 lang=java
 *
 * [134] Gas Station
 */

// @lc code=start
import java.util.Arrays;

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) {
            return -1;
        }

        int currentRemain = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            int remain = gas[i] - cost[i];
            currentRemain += remain;

            if (currentRemain < 0) {
                start = i + 1;
                currentRemain = 0;
            }
        }

        return start;
    }
}

// @lc code=end

