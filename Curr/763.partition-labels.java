/*
 * @lc app=leetcode id=763 lang=java
 *
 * [763] Partition Labels
 */

// @lc code=start
class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, List<Integer>> indices = new HashMap<>();
        List<List<Integer>> ranges = new ArrayList<>();
        List<List<Integer>> union = new ArrayList<>();

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            List<Integer> l = indices.getOrDefault(c, new ArrayList<Integer>());
            l.add(i);
            indices.put(c, l);
        }

        // System.out.println(indices);

        for(List<Integer> l : indices.values()){
            if(l.size() == 1) ranges.add(new ArrayList<Integer>(List.of(l.get(0), l.get(0))));
            else ranges.add(new ArrayList<Integer>(List.of(l.get(0), l.get(l.size()-1))));
        }

        // System.out.println(ranges);

        ranges.sort((a, b) -> {
            int aL = a.get(0);
            int bL = b.get(0);
            if (aL != bL) return Integer.compare(aL, bL);

            int aR = (a.size() == 1) ? a.get(0) : a.get(1);
            int bR = (b.size() == 1) ? b.get(0) : b.get(1);
            return Integer.compare(aR, bR);
        });

        int curL = ranges.get(0).get(0);
        int curR = ranges.get(0).size() == 1 ? ranges.get(0).get(0) : ranges.get(0).get(1);
        for(int i = 0; i < ranges.size(); i++){
            int l = ranges.get(i).get(0);
            int r = ranges.get(i).size() == 1 ? ranges.get(i).get(0) : ranges.get(i).get(1);

            if (l <= curR) {               
                curR = Math.max(curR, r);
            } 
            else {              
                union.add(new ArrayList<>(List.of(curL, curR)));
                curL = l;
                curR = r;
            }
        }
        
        union.add(new ArrayList<>(List.of(curL, curR))); 
        // System.out.println(union); 
        
        List<Integer> ans = new ArrayList<Integer>();

        for(List<Integer> l : union) ans.add(l.get(1)-l.get(0)+1);
    
        return ans;
    }
}
// @lc code=end

