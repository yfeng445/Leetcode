/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lst = new ArrayList<>();

        // edge case 1: list has less than 3 int
        if(nums.length<3) return lst;
        // edge case 2: minSum>0 || maxSum<0
        if(((nums[0]+nums[1]+nums[2])>0)||((nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3])<0)) return lst;

        int boundary = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>0){
                boundary = i;
                break;
            } 
        }

        int n = 0;
        int p = nums.length-1;
        System.out.println(printArr(nums));
        while(n<=boundary && p>=boundary){
            System.out.println(
                "Boundary = "+boundary+
                ", n = "+n+
                ", p = "+p);
            
            for(int i = n+1; i<p; i++){
                if(nums[n]+nums[i]+nums[p] == 0){
                    System.out.println("Found: "+"n="+n+", i="+i+", p="+p);
                    ArrayList<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[n]);
                    tmp.add(nums[i]);
                    tmp.add(nums[p]);
                    lst.add(tmp);
                    break;
                }
            }

            if(nums[n]+nums[p]<0){
                n++;
            }
            else{
                p--;
            }
        }

        for(int i = 0; i<lst.size()-1; i++){
            if(lst.get(i).equals(lst.get(i+1))){
                lst.remove(i);
            }
        }

        return lst;
    }

    public String printArr(int[] input){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<input.length; i++){
            sb.append(String.valueOf(input[i]));
            sb.append(", ");
        }
        return sb.toString();
    }

}
// @lc code=end

