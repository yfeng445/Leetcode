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
        int left = 0, right = s.length()-1;
        int minute = 0;

        if(k == 0) return 0;
        
        while((left<=right)&&(countA<k||countB<k||countC<k)){
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
        if((left>=right)||(countA<k||countB<k||countC<k)) return -1;

        left --;
        right ++;
        System.out.println("balance: " + minute +" minute" + ", Left: " + left + ", right: " + right);

        while(true){
            int left0 = left, right0 = right;
            if(s.charAt(left) == 'a'&&countA>k){
                left--;
                countA--;
            }else if(s.charAt(left) == 'b'&&countB>k){
                left--;
                countB--;
            }else if(s.charAt(left) == 'c'&&countC>k){
                left--;
                countC--;
            }else if(s.charAt(right) == 'a'&&countA>k){
                right++;
                countA--;
            }else if(s.charAt(right) == 'b'&&countB>k){
                right++;
                countB--;
            }else if(s.charAt(right) == 'c'&&countC>k){
                right++;
                countC--;
            }
            
            if(left0 == left && right0 == right){
                System.out.println("Minute: " + minute+", Left: " + left + ", Right: " + right + "\ncountA=" + countA + ", countB="+countB + ", countC=" + countC);
                return minute;
            }else{
                minute--; 
                System.out.println("Minute: " + minute+", Left: " + left + ", Right: " + right + "\ncountA=" + countA + ", countB="+countB + ", countC=" + countC);
               
            }

            
        }
    }
}
// @lc code=end

