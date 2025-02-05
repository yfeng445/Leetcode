/*
 * @lc app=leetcode id=1790 lang=java
 *
 * [1790] Check if One String Swap Can Make Strings Equal
 */

// @lc code=start
import java.util.ArrayList;
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        ArrayList<Character> a1 = new ArrayList<>();
        ArrayList<Character> a2 = new ArrayList<>();
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                a1.add(s1.charAt(i));
                a2.add(s2.charAt(i));
                if(a1.size()>2 || a2.size()>2){
                    return false;
                } 
            }
        }
        if(a1.size() == 0) return true;
        if(a1.size() == 1) return false;
        return a1.get(0) == a2.get(1)&&a1.get(1) == a2.get(0);
        
    }
}
// @lc code=end

