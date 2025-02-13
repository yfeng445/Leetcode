/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start

import java.util.ArrayList;

class Solution {
    public boolean isHappy(int n) {
        if((remove(n) == 1)){
            return true;
        }
        int result = 0;
        ArrayList<Integer> records = new ArrayList<>();

        while(remove(n) != 1){
            System.out.println(records.toString());
            result = 0;
            while(n/10!=0){
                result += (n%10)*(n%10);
                n = n/10;
            }
            result += (n%10)*(n%10);

            System.out.println(result);
            
            if(records.contains(result)){
                return false;
                
            }
            else{
                records.add(result);
            }
            
            n = result;

        }
        
        return true;
    }

    public int remove(int i){
        if(i==0) return i;
        while(i%10 == 0){
            i = i/10;
        }
        return i;
    }
}
// @lc code=end

