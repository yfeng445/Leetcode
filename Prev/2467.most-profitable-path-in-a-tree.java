/*
 * @lc app=leetcode id=2467 lang=java
 *
 * [2467] Most Profitable Path in a Tree
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        int[] Alice = new int[2];
        Alice[0] = 0;
        Alice[1] = amount[0];
        int[] Bob = new int[2];
        Bob[0] = bob;
        Bob[1] = amount[bob];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int[] e : edges){
            if(map.get(e[0]) == null){
                ArrayList<Integer> tmp = new ArrayList<>();
                tmp.add(e[1]);
                map.put(e[0], tmp);
            }
            else{
                ArrayList<Integer> tmp = map.get(e[0]);
                tmp.add(e[1]);
                map.put(e[0], tmp);
            }
            if(map.get(e[1]) == null){
                ArrayList<Integer> tmp = new ArrayList<>();
                tmp.add(e[0]);
                map.put(e[1], tmp);
            }
            else{
                ArrayList<Integer> tmp = map.get(e[1]);
                tmp.add(e[0]);
                map.put(e[1], tmp);
            }
        }
        System.out.println(map.toString());
        ArrayList<Integer> bobPath = bobPath(bob, map);
        System.out.println(bobPath.toString());
        
        /*
        while(map.get(Alice[0])!=null && Bob[0]!=0){

        }

        if(map.get(Alice[0])==null) return Alice[0];
        
        // Bob == 0
        while(map.get(Alice[0])!=null){

        }
        */


        return 0;
        
    }    

    public ArrayList<Integer> bobPath(int bob, HashMap<Integer, ArrayList<Integer>> map){
        Stack<Integer> path = new Stack<>();
        ArrayList<Integer> rtn = new ArrayList<>();
        ArrayList<Integer> visited = new ArrayList<>();
        path.push(bob);
        rtn.add(bob);
        while(!path.isEmpty()){
            int node = path.pop();
            rtn.add(node);
            if (!visited.contains(node)) { 
                // rtn.add(node);
                visited.add(node);
                ArrayList<Integer> neighbors = map.get(node);
                for (int neighbor : neighbors) {
                    if (!visited.contains(neighbor)) {
                        path.push(neighbor);
                    }
                }
            }
        }
        return rtn;
    }
}
// @lc code=end

