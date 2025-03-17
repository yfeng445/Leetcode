/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */

// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int m = 100003;
        int R = 79999;
        int[][] table = new int[m][];
        
        // table[0] = new int[]{-1, -1};

        for(int i = 0; i<nums.length; i++){
            int key = nums[i];
            while(key < 0){
                key += m;
            }

            int h1 = key%m;
            if(table[h1] == null){
                table[h1] = new int[]{key, i};
             }
            else{
                if(table[h1][0] == key){
                    if(i-table[h1][1]<=k){
                        System.out.println("1st hashing found: " +key);
                        return true;
                    } 
                    else table[h1][1] = i;
                }
                else{
                    int h2 = (R-key)%R;
                    for(int j = 0; i<m; i++){
                        int newIndex = (h1%m + (int)((long)j*h2)%m)%m;
                        if(table[newIndex][0] == 0){
                            table[newIndex][0] = key;
                            table[newIndex][1] = i;
                        }
                        else{
                            if(table[newIndex][0] == key){
                                if(i-table[newIndex][1]<=k){
                                    System.out.println("double hasing found: " + key);
                                    return true;
                                } 
                                else table[newIndex][1] = i;
                            }
                        }
                    }
                }
            }     
        }

        return false;
    }
}
// @lc code=end

