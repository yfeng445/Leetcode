/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(int x) {
        if(x == Integer.MAX_VALUE || x == Integer.MAX_VALUE + 1) return false;
        if(x < 0) return false;
        if(x == 0) return true;
        if(x % 10 == 0) return false;

        ArrayList<Integer> arr = new ArrayList<>();

        while(x != 0){
            arr.add(x%10);
            x = x/10;
        }
        
        int left = 0;
        int right = arr.size() - 1;
        
        while(left <= right){
            if(arr.get(left)!=arr.get(right)) return false;
            left ++;
            right --;
        }

        return true;
    }
}
// @lc code=end

