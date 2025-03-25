/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int m = 100003;
        int R = 79999;
        int[][] table = new int[m][];

        for(char c : magazine.toCharArray()){
            int key = (int)c;
            int h1 = key%m;
            if(table[h1] == null){
                table[h1] = new int[]{key, 1};
                // System.out.println("Insert: " + h1 + ": " + table[h1][1]);
            }
            else{
                if(table[h1][0] == key){
                    table[h1][1]++;
                    // System.out.println("Update: " + h1 + ": " + table[h1][1]);
                }
                else{
                    int h2 = (R-key)%R;
                    for(int i = 0; i<m; i++){
                        int newIndex = (int)(h1%m + (long)(i * h2)%m)%m;
                        if(table[newIndex] == null){
                            table[newIndex] = new int[]{key, 1};
                            // System.out.println("Insert: " + newIndex + ": " + key);
                        }
                        if(table[newIndex][0] == key){
                            table[newIndex][1]++;
                            // System.out.println("Update: " + newIndex + ": " + table[newIndex][1]);
                        }
                    }
                }
            }
        }

        for(char c : ransomNote.toCharArray()){
            int key = (int)c;
            int h1 = key%m;
            if(table[h1] == null){
                return false;
            }
            else{
                if(table[h1][0] == key){
                    if(table[h1][1] == 0) return false;
                    else table[h1][1]--;
                }
                else{
                    int h2 = (R-key)%R;
                    for(int i = 0; i<m; i++){
                        int newIndex = (int)(h1%m + (long)(i * h2)%m)%m;
                        if(table[newIndex] == null){
                            return false;
                        }
                        if(table[newIndex][0] == key){
                            if(table[newIndex][1] == 0) return false;
                            else table[newIndex][1]--;
                        }
                    }
                }
            }
        }

        return true;
    }
}
// @lc code=end

