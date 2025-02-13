/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
import java.util.HashMap;
class Solution {
    public int romanToInt(String s) {
        int intValue= 0;
        HashMap<Character, Integer> dic = new HashMap<Character, Integer>();
        dic.put('I', 1);
        dic.put('V', 5);
        dic.put('X', 10);
        dic.put('L', 50);
        dic.put('C', 100);
        dic.put('D', 500);
        dic.put('M', 1000);

        for(int i = 0; i<s.length(); i++){
            if(i<s.length()-1 && dic.get(s.charAt(i))<dic.get(s.charAt(i+1))){
                intValue-=dic.get(s.charAt(i));
            }
            else{
                intValue+=dic.get(s.charAt(i));
            }
            //System.out.println(intValue);
        }
        return intValue;
    }
}
// @lc code=end

