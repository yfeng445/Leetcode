/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        String str = s.trim();
        if (str.length() == 0) {
            return 0;
        }
        int startingPos = 0;
        int value = 0;
        boolean isNegative = false;
        if (str.charAt(0) == '-') {
            startingPos = 1;
            isNegative = true;
        } else if (str.charAt(0) == '+') {
            startingPos = 1;
        }
        while (startingPos < str.length()) {
            char currentChar = str.charAt(startingPos);
            if (currentChar < '0' || currentChar > '9') {
                break;
            }
            int digit = currentChar - '0';
            if (value > (Integer.MAX_VALUE - digit) / 10) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            value = value * 10 + digit;
            startingPos++;
        }
        return isNegative ? -value : value;
    }
}

// @lc code=end

