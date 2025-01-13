/*
 * @lc app=leetcode id=3223 lang=java
 *
 * [3223] Minimum Length of String After Operations
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int minimumLength(String s) {
        if(s.length()<=2){
            return s.length();
        }

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        int returnVal = 0;
        int localCount = 1;
        char c = arr[0];
        

        for(int i = 1; i<arr.length; i++){
            if(arr[i] == c){
                localCount ++;
                if(localCount>=3){
                    localCount-=2;
                }
            }
            else{

                returnVal +=localCount;
                localCount = 1;
                c = arr[i];
            }

        }
        returnVal += localCount;
        return returnVal;
    }

}
// @lc code=end

