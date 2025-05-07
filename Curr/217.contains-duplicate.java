/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int m = 100003;
        int R = 79999;
        int[] table = new int[m];
        table[0] = 1;

        for(int key : nums){

            while(key < 0){
                key += m; 
            } 

            if(key == 0){
                if(table[0] == 0) return true;
                else table[0] = 0;
            }
            else{
                int h1 = key % m;
                if(table[h1] == key) return true;
                if(table[h1] == 0){
                    table[h1] = key;
                }
                else{
                    int h2 = R-(key%R);
                    for(int i = 0; i<m; i++){
                        int newIndex = (h1 + (int)(((long)i * h2) % m))%m;

                        if(table[newIndex] == key) return true;
                        if(table[newIndex] == 0){
                            table[newIndex] = key; 
                        }
                    }
                }
            }
        } 

        return false;     
    }

    
}
// @lc code=end

