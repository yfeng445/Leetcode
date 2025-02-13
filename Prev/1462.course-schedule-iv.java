/*
 * @lc app=leetcode id=1462 lang=java
 *
 * [1462] Course Schedule IV
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Stack;
import java.util.List;

class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<Boolean> rtn = new ArrayList<>();
        for(int[] q : queries){
            Stack<Integer> stk = new Stack<>();
            boolean contains = false;
            stk.push(q[1]);
            while(!stk.isEmpty()){
                int index = 0;
                for(int[] pre : prerequisites){
                    if(pre[1] == stk.get(index)){
                        stk.push(pre[0]);
                    }
                }
                if(stk.contains(q[0])){
                    contains = true;
                    break;
                }
            }
            rtn.add(contains);
        }
        
        
        


        return rtn;
        
    }  
}
// @lc code=end

