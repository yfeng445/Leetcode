/*
 * @lc app=leetcode id=71 lang=java
 *
 * [71] Simplify Path
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        String[] a = path.split("/");
        //System.out.println(Arrays.toString(a));
        if(a.length == 0) return "/";

        Stack<String> stk = new Stack<>();
        for(String str : a){
            if(str.isBlank()){
                continue;
            }

            if(str.equals("..")){
                if(!stk.isEmpty()){
                    stk.pop();  
                }
             
            }  
            else if(str.equals(".")){

            }  
            else{
                stk.push(str);
            }         
            System.out.println(stk.toString());
        }
        StringBuilder sb = new StringBuilder("");
        for(String str : stk){
            sb.append("/");
            sb.append(str);
        }
        if(sb.toString().isBlank()){
            sb.append("/");
        }

        return sb.toString();
    }
}
// @lc code=end

