import java.util.*;

class Solution {
    HashMap<Integer, ArrayList<Integer>> tree1 = new HashMap<>();
    HashMap<Integer, ArrayList<Integer>> tree2 = new HashMap<>();

    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        tree1 = toMap(edges1);
        tree2 = toMap(edges2);
        HashMap<Integer, Integer> tree2Val = new HashMap<>();
        tree2Val = toNodes(tree2, k);

        int nodes = Collections.max(tree2Val.values());

        int[] result = new int[tree1.size()];
        for(int node1 : tree1.keySet()){
            if(k != 0) result[node1] += 1;
            result[node1] += getNodes(tree1, node1, k, new ArrayList<Integer>());
            // System.out.println("node: " + node1 + ", tree 1: " + result[node1]);
            result[node1] += (nodes+1);
        }

        return result;
    }

    public HashMap<Integer, Integer> toNodes(HashMap<Integer, ArrayList<Integer>> map, int k){
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int key : map.keySet()){
            mp.put(key, getNodes(map, key, k-1, new ArrayList<Integer>()));
        }
        return mp;
    }

    public HashMap<Integer, ArrayList<Integer>> toMap(int[][] edges){
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int[] edge : edges){
            if(map.get(edge[0]) == null && map.get(edge[1]) == null){ // both node does not exist
                ArrayList<Integer> tmp = new ArrayList<>();
                tmp.add(edge[1]);
                map.put(edge[0], tmp);
                tmp = new ArrayList<>();
                tmp.add(edge[0]);
                map.put(edge[1], tmp);
            }
            else if(map.get(edge[0]) == null && map.get(edge[1]) != null){
                ArrayList<Integer> tmp = new ArrayList<>();
                tmp.add(edge[1]);
                map.put(edge[0], tmp);
                tmp = map.get(edge[1]);
                tmp.add(edge[0]);
                map.put(edge[1], tmp);
            }
            else if(map.get(edge[1]) == null && map.get(edge[0]) != null){
                ArrayList<Integer> tmp = new ArrayList<>();
                tmp.add(edge[0]);
                map.put(edge[1], tmp);
                tmp = map.get(edge[0]);
                tmp.add(edge[1]);
                map.put(edge[0], tmp);
            }
            else{
                ArrayList<Integer> tmp = map.get(edge[0]);
                tmp.add(edge[1]);
                map.put(edge[0], tmp);
                tmp = map.get(edge[1]);
                tmp.add(edge[0]);
                map.put(edge[1], tmp);
            }
        }
        return map;
    }

    public int getNodes(HashMap<Integer, ArrayList<Integer>> map, int currNode, int k, ArrayList<Integer> visited){
        visited.add(currNode);
        if(k == 1){
            int result = 0;
            for(int node : map.get(currNode)){
                if(!visited.contains(node)){
                    result ++;
                    visited.add(node);
                } 
            }
            return result;
        }
        if(k <= 0) return 0;
        else{
            int result = 0;
            for(int node : map.get(currNode)){
                if(!visited.contains(node)){
                    result ++;
                    visited.add(node);
                    result += getNodes(map, node, k-1, visited);
                }
            }
            return result;
        }
    }
}