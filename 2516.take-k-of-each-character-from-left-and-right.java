/*
 * @lc app=leetcode id=2516 lang=java
 *
 * [2516] Take K of Each Character From Left and Right
 */

// @lc code=start
class Solution {
    public int takeCharacters(String s, int k) {
        System.out.println(s);
        int countA = 0, countB = 0, countC = 0;
        int left = 0, right = 0;
        int minute = 0;
        while((countA<k||countB<k||countC<k)&&right<s.length()){

            if(s.charAt(left) == 'a'){
                countA++; 
                left++;
                minute+=1;
            }else if(s.charAt(left) == 'b'){
                countB++;
                left++;
                minute+=1;
            }else if(s.charAt(left) == 'c'){
                countC++; 
                left++;
                minute+=1;
            }
            if(s.charAt(right) == 'a'){
                countA++; 
                right--;
                minute+=1;
            }else if(s.charAt(right) == 'b'){
                countB++;
                right--;
                minute+=1;
            }else if(s.charAt(right) == 'c'){
                countC++;
                right--;
                minute+=1;
            }  
        }
        if(countA<k||countB<k||countC<k) return -1;
        left --;
        right ++;
        System.out.println("balance: " + minute +"minute" + ", Left: " + left + ", right: " + right);


        while(true){
            int left0 = left, right0 = right;
            if(s.charAt(left) == 'a'&&countA>k){
                left--;
                countA--;
                minute--;
            }else if(s.charAt(left) == 'b'&&countB>k){
                left--;
                countB--;
                minute--;
            }else if(s.charAt(left) == 'c'&&countC>k){
                left--;
                countC--;
                minute--;
            }else if(s.charAt(right) == 'a'&&countA>k){
                right++;
                countA--;
                minute--;
            }else if(s.charAt(right) == 'b'&&countB>k){
                right++;
                countB--;
                minute--;
            }else if(s.charAt(right) == 'c'&&countC>k){
                right++;
                countC--;
                minute--;
            }
            System.out.println("Minute: " + minute+", Left: " + left + ", Right: " + right + "\ncountA=" + countA + ", countB="+countB + ", countC=" + countC);
            if(left0 == left && right0 == right) return minute;
        }
    }
}
// @lc code=end

