/*
 * @lc app=leetcode id=2787 lang=java
 *
 * [2787] Ways to Express an Integer as Sum of Powers
 */

// @lc code=start
import java.util.ArrayList;

class Solution {
    private static final int MOD = 1_000_000_007;
    public int numberOfWays(int n, int x){
        ArrayList<Integer> powers = new ArrayList<>();
        for (int i = 1; ; i++) {
            long p = powLeqN(i, x, n);
            if (p > n) break;
            powers.add((int)p);
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int p : powers) {
            for (int s = n; s >= p; s--) {
                dp[s] += dp[s - p];
                if (dp[s] >= MOD) dp[s] -= MOD;
            }
        }
        return dp[n];
    }

    private long powLeqN(long base, int exp, int n) {
        long res = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                res *= base;
                if (res > n) return n + 1L;
            }
            exp >>= 1;
            if (exp > 0) {
                base *= base;
                if (base > n) return n + 1L;
            }
        }
        return res;
    }
}

// @lc code=end

