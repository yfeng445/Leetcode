/*
 * @lc app=leetcode id=684 lang=java
 *
 * [684] Redundant Connection
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Stack;

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        Node tmp1 = new Node(edges[0]);
        Node tmp2 = new Node(edges[1]);
    }

    static class Node {
        int value;
        ArrayList<Node> next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }

        ArrayList<Node> getNext(){
            return next;
        }

        void addNext(Node n){
            this.next.add(n);
        }

        Node DFS(Node n){
            if(n.next.isEmpty()) return null;
            else{
                for(Node nd : n.next){
                    DFS(nd);
                }
            } 
        }
    }
}


// @lc code=end

