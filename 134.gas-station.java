/*
 * @lc app=leetcode id=134 lang=java
 *
 * [134] Gas Station
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // check if we could finish the trip
        int canFinish = 0;
        for(int i = 0; i<gas.length; i++){
            canFinish+=gas[i];
            canFinish-=cost[i];
        }
        if (canFinish<0){
           return -1; 
        } 
        else{ // can finish, find the gasStation index
            int index = 0; 
            boolean canComplete = false;
            while(!canComplete){
                int gasRemain = gas[index];
                for(int i = 0; i<gas.length; i++){
                    gasRemain -= cost[i];
                    if(gasRemain<0){ //cannot reach next gas station, go to next try
                        index++;
                        break;
                    }
                    else{
                        gasRemain += gas[i+1];
                    }
                }
            }
        }
    }
}
// @lc code=end

