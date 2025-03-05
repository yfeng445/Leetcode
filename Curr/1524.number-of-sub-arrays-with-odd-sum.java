

/*
 * @lc app=leetcode id=1524 lang=java
 *
 * [1524] Number of Sub-arrays With Odd Sum
 */

// @lc code=start

class Solution {
    public int numOfSubarrays(int[] arr) {
        boolean[] isOddArr = new boolean[arr.length];
        int count = 0;
        int oddCount = 0;
        int evenCount = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2 == 1){
                isOddArr[i] = true;
                oddCount++;
            } 
            else{
                isOddArr[i] = false;
                evenCount++;
            } 
        } 
        //System.out.println(Arrays.toString(isOddArr));

        int windowSize = 1;
        while(windowSize <= arr.length){
            boolean init = isOddArr[0];
            for(int i = 1; i<windowSize; i++){
                init = init ^ isOddArr[i-1];
            }
            if(init){
                System.out.println(windowSize + ": 0");
                count++; 
             } 
            for(int i = windowSize; i<arr.length; i++){
                init = init ^ isOddArr[i-windowSize] ^ isOddArr[i];
                if(init){
                   count++; 
                   System.out.println(windowSize + ": " + (i-windowSize+1));
                } 
                
            }

            windowSize++;
        }



        return count;
    }
}
// @lc code=end

