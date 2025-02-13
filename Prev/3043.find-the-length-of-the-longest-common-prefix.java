/*
 * @lc app=leetcode id=3043 lang=java
 *
 * [3043] Find the Length of the Longest Common Prefix
 */

// @lc code=start
import java.util.Arrays;

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        // Convert int arrays to String arrays before the loop
        // it could recude the runtime
        String[] strArr1 = Arrays.stream(arr1).mapToObj(String::valueOf).toArray(String[]::new);
        String[] strArr2 = Arrays.stream(arr2).mapToObj(String::valueOf).toArray(String[]::new);

        // Sort both string arrays
        Arrays.sort(strArr1);
        Arrays.sort(strArr2);
        
        int longestCommonPrefix = 0;
        int i = 0, j = 0;

        // Compare sorted arrays
        while (i < strArr1.length && j < strArr2.length) {
            String a1 = strArr1[i];
            String a2 = strArr2[j];
            int minLen = Math.min(a1.length(), a2.length());
            int prefixLen = 0;

            for (int k = 0; k < minLen; k++) {
                if (a1.charAt(k) == a2.charAt(k)) {
                    prefixLen++;
                } else {
                    break; 
                }
            }

            longestCommonPrefix = Math.max(longestCommonPrefix, prefixLen);

            if (a1.compareTo(a2) < 0) {
                i++; 
            } else {
                j++; 
            }
        }
        
        return longestCommonPrefix;
    }
}


// @lc code=end

