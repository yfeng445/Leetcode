/*
 * @lc app=leetcode id=79 lang=java
 *
 * [79] Word Search
 */

// @lc code=start
class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        char[] w = word.toCharArray();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == w[0] && dfs(board, w, 0, i, j)) return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, char[] w, int k, int i, int j) {
        if (board[i][j] != w[k]) return false;
        if (k == w.length - 1) return true;

        char saved = board[i][j];
        board[i][j] = '#'; // mark visited (in-place)

        // explore 4 neighbors
        if (i > 0 && board[i - 1][j] != '#' && dfs(board, w, k + 1, i - 1, j)) return true;
        if (i + 1 < board.length && board[i + 1][j] != '#' && dfs(board, w, k + 1, i + 1, j)) return true;
        if (j > 0 && board[i][j - 1] != '#' && dfs(board, w, k + 1, i, j - 1)) return true;
        if (j + 1 < board[0].length && board[i][j + 1] != '#' && dfs(board, w, k + 1, i, j + 1)) return true;

        board[i][j] = saved; // unmark (backtrack)
        return false;
    }
}

// @lc code=end

