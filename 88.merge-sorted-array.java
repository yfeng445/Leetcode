/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int curr = 0;

        int i = 0, j = 0;
        while(i!=m && j!=n){

            if(nums1[i]<=nums2[j]){
                result[curr]= nums1[i];
                //System.out.println(result[curr]);
                curr++;
                i++;
            }
            else{
                result[curr] = nums2[j];
                //System.out.println(result[curr]);
                curr++;
                j++;
            }
            //System.out.println("New Line");

        }
        if(i == m){
            while(j != n){
                result[curr] = nums2[j];
                curr++;
                j++;
            }
        }
        else{
            while(i != m){
                result[curr] = nums1[i];
                curr++;
                i++;
            }
        }


        for(int k = 0; k < m + n; k++){
            nums1[k] = result[k];
        }
    }
}
// @lc code=end

