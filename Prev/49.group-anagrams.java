/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lst = new ArrayList<List<String>>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            char[] tmpCA = strs[i].toCharArray();
            Arrays.sort(tmpCA);
            String tmpS = String.valueOf(tmpCA); 
            if(map.get(tmpS) == null){
                List<String> arr = new ArrayList<String>();
                arr.add(strs[i]);
                map.put(tmpS, arr);
            }
            else{
                List<String> arr = map.get(tmpS);
                arr.add(strs[i]);
                map.put(tmpS, arr);
            }
        }
        for (HashMap.Entry<String, List<String>> en : map.entrySet()) {
            lst.add(en.getValue());
        }

        return lst;
    }
}
// @lc code=end

