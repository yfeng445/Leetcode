/*
 * @lc app=leetcode id=1497 lang=java
 *
 * [1497] Check If Array Pairs Are Divisible by k
 */

// @lc code=start
class Solution {
    public boolean canArrange(int[] arr, int k) {
        
        if(arr.length%2 != 0){
            System.out.println("NOT EVEN");
            return false;
        }

        for(int i = 0; i<arr.length; i++){
            arr[i] = arr[i]%k >= 0 ? arr[i]%k : arr[i]%k+k;
        }
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        if(!zeroCheck(arr, k)) return false; 
        ArrayList<Integer> al = new ArrayList<>();
        for(int i : arr) if(i!=0) al.add(i);
        if(al.size() == 0) return true;
        int left = 0;
        int right = al.size()-1;
        while(al.get(left) <= al.get(right)){
            // System.out.println("Checking: " + al.get(left) + ", " + al.get(right));
            if((al.get(left)+al.get(right))%k!=0) return false;
            left ++;
            right --;
        }
        return true;
    }

    public boolean zeroCheck(int[] arr, int k){
        int cnt = 0;
        for(int i : arr){
            if(i == 0) cnt++;
        }

        return cnt%2 == 0;
    }
}
// @lc code=end

