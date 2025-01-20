/*
 * @lc app=leetcode id=2661 lang=java
 *
 * [2661] First Completely Painted Row or Column
 */

// @lc code=start
import java.util.HashMap;

class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer, Integer> row = new HashMap<>();
        HashMap<Integer, Integer> col = new HashMap<>();
        HashMap<Integer, int[]> map = new HashMap<>();

        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                int[] tmp = new int[2];
                tmp[0] = i;
                tmp[1] = j;
                map.put(mat[i][j], tmp);
            }
        }

        for(int a = 0; a<arr.length; a++){
            int ar = arr[a];
            int[] tmp = map.get(ar);
            int i = tmp[0];
            int j = tmp[1];
            if(ar == mat[i][j]){
                if(row.get(i) == null) row.put(i, 1);
                else row.put(i, row.get(i)+1);
                if(col.get(j) == null) col.put(j, 1);
                else col.put(j, col.get(j)+1);
                if(row.get(i) == mat[0].length || col.get(j) == mat.length) return a;
            }
        }
        return 0;
    }
}
// @lc code=end

