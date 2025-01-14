/*
 * @lc app=leetcode id=2657 lang=java
 *
 * [2657] Find the Prefix Common Array of Two Arrays
 */

// @lc code=start
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        if(A.length !=B.length) return null;
        int n = A.length;
        int[] C = new int[n];

        for(int i = 0; i<n; i++){
            int count = 0;
            for(int j = 0; j<=i; j++){
                for(int k = 0; k<=i; k++){
                    if(A[j] == B[k]){
                        count ++;
                    }                    
                }
            }
            C[i] = count;
        }


        return C;
    }
}
// @lc code=end

