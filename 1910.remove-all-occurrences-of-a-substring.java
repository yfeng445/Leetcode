/*
 * @lc app=leetcode id=1910 lang=java
 *
 * [1910] Remove All Occurrences of a Substring
 */

// @lc code=start

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String removeOccurrences(String s, String part) {
        int len = part.length();
        if(len == 0) return s;
        List<Character> lst = new ArrayList<Character>();
        for(int i = 0; i<len; i++){
            lst.add(part.charAt(i));
        }

        Stack<Character> stk = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            stk.push(s.charAt(i));
            if(stk.size() >= len){
                List<Character> substk = stk.subList(stk.size()-len, stk.size());
                boolean equal = substk.equals(lst);
                while(equal){
                    for(int j = 0; j<len; j++){
                        stk.pop();
                    }
                    if(stk.size() >=len){
                        equal = stk.subList(stk.size()-len, stk.size()).equals(lst);
                    }
                    else{
                        equal = false;
                    }

                }
            }

            //System.out.println(stk.toString());

        }

        StringBuilder sb = new StringBuilder("");
        for(char c : stk){
            sb.append(c);
        }
        return sb.toString();

    }
}
// @lc code=end

