/*
 * @lc app=leetcode id=916 lang=java
 *
 * [916] Word Subsets
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {

        List<String> returnList = new ArrayList<>();
        HashMap<Character, Integer> dictB = new HashMap<>();

        for(int i = 0; i<words2.length; i++){
            HashMap<Character, Integer> dictStr = new HashMap<>();
            char[] charArr = words2[i].toCharArray();
            // convert String to number of char occurance
            for(char c : charArr){
                if(dictStr.get(c) == null){
                    dictStr.put(c, 1);
                }
                else{
                    dictStr.put(c, dictStr.get(c)+1); 
                }
            }
            // update the overall hashmap
            Iterator<HashMap.Entry<Character, Integer>> iterator = dictStr.entrySet().iterator();
            while (iterator.hasNext()) {
                HashMap.Entry<Character, Integer> entry = iterator.next();
                char key = entry.getKey();
                if(dictB.get(key) == null || dictB.get(key) < dictStr.get(key)){
                    dictB.put(entry.getKey(), entry.getValue());
                }
            }
        }

        System.out.println(dictB.toString());
        
        for(String a : words1){
            HashMap<Character, Integer> dictA = new HashMap<>();
            char[] charArr = a.toCharArray();
            for(char c : charArr){
                if(dictA.get(c) == null){
                    dictA.put(c, 1);
                }
                else{
                    dictA.put(c, dictA.get(c)+1); 
                }
            }
            System.out.println("String: " + a + ", Dict: " + dictA.toString());

            boolean isSub = true;
            Iterator<HashMap.Entry<Character, Integer>> iterator = dictB.entrySet().iterator();
            while (iterator.hasNext()) {
                HashMap.Entry<Character, Integer> entry = iterator.next();
                char key = entry.getKey();
                if(dictA.get(key) == null || dictA.get(key) < entry.getValue()){
                    isSub = false;
                }
            }
            if(isSub){
                System.out.println("Add: " + a);
                returnList.add(a);
            } 
            

        }


        return returnList;
    }
}
// @lc code=end

