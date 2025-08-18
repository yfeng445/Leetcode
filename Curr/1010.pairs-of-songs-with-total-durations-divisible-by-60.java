/*
 * @lc app=leetcode id=1010 lang=java
 *
 * [1010] Pairs of Songs With Total Durations Divisible by 60
 */

// @lc code=start
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        Arrays.sort(time);
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i : time){
            if(freq.get(i%60) == null) freq.put(i%60, 1);
            else freq.put(i%60, freq.get(i%60)+1);
        }

        // System.out.println(freq.toString());
        double cnt = 0;

        for(int key : freq.keySet()){
            if(key == 0 || key == 30) cnt+=(double)freq.get(key)*(double)(freq.get(key)-1)/2;
            else{
                if(freq.get(60-key) != null) cnt+=(double)freq.get(60-key)*(double)freq.get(key)/2;
            }
            // System.out.println("key:" + key + ", cnt: " + cnt);
        }

        return (int)cnt;
    }
}
// @lc code=end

