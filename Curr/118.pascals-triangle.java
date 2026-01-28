/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri = new ArrayList<>();
        tri.add(List.of(1));
        if(numRows == 1) return tri;
        tri.add(List.of(1, 1));
        for(int i = 1; i<numRows-1; i++){
            List<Integer> prevRow = tri.get(i);
            // System.out.println(prevRow);
            List<Integer> newRow = new ArrayList<>();
            newRow.add(prevRow.get(0));
            for(int j = 1; j<prevRow.size(); j++){
                newRow.add(prevRow.get(j-1)+prevRow.get(j));
            }
            newRow.add(prevRow.get(prevRow.size()-1));
            tri.add(newRow);
        }

        return tri;

    }
}
// @lc code=end

