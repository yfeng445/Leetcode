/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, ArrayList<Integer>> S = new HashMap<>();
        HashMap<Character, ArrayList<Integer>> T = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(int i = 0; i<s.toCharArray().length; i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(!S.containsKey(cs)){
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(i);
                S.put(cs, arr);
            }
            else{
                ArrayList<Integer> arr = S.get(cs);
                arr.add(i);
                S.put(cs, arr);
            }
            if(!T.containsKey(ct)){
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(i);
                T.put(ct, arr);
            }
            else{
                ArrayList<Integer> arr = T.get(ct);
                arr.add(i);
                T.put(ct, arr);
            }
            //System.out.println(S.toString());
            //System.out.println(T.toString());
            if(!S.get(cs).equals(T.get(ct))){
                return false;
            } 
        }
        return true;
    }
   
}
// @lc code=end

