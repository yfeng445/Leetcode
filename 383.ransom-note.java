/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> Magazine = new HashMap<Character, Integer>();
        HashMap<Character, Integer> Note = new HashMap<Character, Integer>();
        for (char c : magazine.toCharArray()){
            if(Magazine.get(c) == null){
                Magazine.put(c, 1);
            }
            else{
                Magazine.put(c, Magazine.get(c)+1);
            }
        }
        for (char c : ransomNote.toCharArray()){
            if(Note.get(c) == null){
                Note.put(c, 1);
            }
            else{
                Note.put(c, Note.get(c)+1);
            }
        }

        for (HashMap.Entry<Character, Integer> en : Note.entrySet()){
            if(Magazine.get(en.getKey()) == null||
            Magazine.get(en.getKey())<en.getValue()){
                return false;
            }
        }

        return true;
        
    }
}
// @lc code=end

