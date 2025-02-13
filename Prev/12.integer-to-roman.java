/*
 * @lc app=leetcode id=12 lang=java
 *
 * [12] Integer to Roman
 */

// @lc code=start
class Solution {
    public String intToRoman(int num) {
        int remain = num;
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<remain/1000; i++){
            sb.append("M");
        }
        remain = remain%1000;

        if(remain >= 900){
            sb.append("CM");
            remain -=900;
        }
        else if(remain <900 && remain >=500){
            sb.append("D");
            remain -=500;
        }
        else if(remain <500 && remain >=400){
            sb.append("CD");
            remain -=400;
        }
        for(int i = 0; i<remain/100; i++){
            sb.append("C");
        }
        remain = remain%100;
        
        if(remain >= 90){
            sb.append("XC");
            remain -=90;
        }
        else if(remain <90 && remain >=50){
            sb.append("L");
            remain -=50;
        }
        else if(remain <50 && remain >=40){
            sb.append("XL");
            remain -=40;
        }
   
        for(int i = 0; i<remain/10; i++){
            sb.append("X");
        }
        remain = remain%10;

        if(remain >= 9){
            sb.append("IX");
            remain -=9;
        }
        else if(remain <9 && remain >=5){
            sb.append("V");
            remain -=5;
        }
        else if(remain <5 && remain >=4){
            sb.append("IV");
            remain -=4;
        }
        for(int i = 0; i<remain/1; i++){
            sb.append("I");
        }

        return sb.toString();
    }
}
// @lc code=end

