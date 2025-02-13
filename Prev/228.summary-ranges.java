/*
 * @lc app=leetcode id=228 lang=java
 *
 * [228] Summary Ranges
 */

// @lc code=start
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<Integer> range = new ArrayList<>();
        List<String> lst= new ArrayList<String>();
        if(nums.length == 0){
            return(lst); 
         } 
        for(int i = 0; i<nums.length; i++){
            if(range.isEmpty()){
                range.add(nums[i]);
            } 
            else{
                if(nums[i]-1 == range.get(range.size()-1)){
                    range.add(nums[i]);
                }
                else{
                    lst.add(toString(range));
                    range.clear();
                    range.add(nums[i]);
                }
            }
            System.out.println(range.toString());
        }
        lst.add(toString(range));
        

        return lst;
    }

    public String toString(ArrayList<Integer> a){
        StringBuilder sb = new StringBuilder("");
        if(a.size() == 1){
            return String.valueOf(a.get(0));
        }
        else{
            sb.append(String.valueOf(a.get(0)));
            sb.append("->");
            sb.append(String.valueOf(a.get(a.size()-1)));
        }
        return sb.toString();
    }
}
// @lc code=end

