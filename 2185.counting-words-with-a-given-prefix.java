/*
 * @lc app=leetcode id=2185 lang=java
 *
 * [2185] Counting Words With a Given Prefix
 */

// @lc code=start
import java.util.Stack;

class Solution {
    public int prefixCount(String[] words, String pref) {
        
        Stack<String> stk = new Stack<String>();
        for(int i = 0; i<words.length; i++){
            stk.push(words[i]);
        }
        Stack<String> tmp = new Stack<String>();
        char[] prefChar = pref.toCharArray();
        for(int i = 0; i<prefChar.length; i++){
            while(!stk.isEmpty()){
                String word = stk.pop();
                System.out.println("Checking: " + word);
                if(word.length()>i){
                    if(word.toCharArray()[i] == prefChar[i]){
                        tmp.push(word);
                    }                    
                }
            }
            while(!tmp.isEmpty()){
                stk.push(tmp.pop());
            }
        }
        return stk.size();

        
    }
}
// @lc code=end

