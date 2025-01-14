


/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] pArr = pattern.toCharArray();
        String[] sArr = s.split(" ");
        if(pArr.length != sArr.length){
            return false;
        }
        HashMap<Character, ArrayList<Integer>> pHash = new HashMap<Character, ArrayList<Integer>>();
        HashMap<String, ArrayList<Integer>> sHash = new HashMap<String, ArrayList<Integer>>();
        for(int i = 0; i<pArr.length; i++){
            if(pHash.get(pArr[i]) == null){
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(i);
                pHash.put(pArr[i], arr);
            }
            else{
                ArrayList<Integer> arr = pHash.get(pArr[i]);
                arr.add(i);
                pHash.put(pArr[i], arr);
            }
            if(sHash.get(sArr[i]) == null){
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(i);
                sHash.put(sArr[i], arr);
            }
            else{
                ArrayList<Integer> arr = sHash.get(sArr[i]);
                arr.add(i);
                sHash.put(sArr[i], arr);
            }
            if(!pHash.get(pArr[i]).equals(sHash.get(sArr[i]))){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

