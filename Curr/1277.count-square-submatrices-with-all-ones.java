/*
 * @lc app=leetcode id=1277 lang=java
 *
 * [1277] Count Square Submatrices with All Ones
 */

// @lc code=start
class Solution {
    public int countSquares(int[][] matrix) {
        int cnt = 0;
        ArrayList<int[]> square = new ArrayList<>();
        for(int i = 0; i<matrix.length; i++) for(int j = 0; j<matrix[0].length; j++) if(matrix[i][j] == 1) square.add(new int[]{i, j});
        int newAdd = square.size(); 
        cnt+=newAdd;
        int size = 1;
        while(newAdd!=0){
            ArrayList<int[]> tmp = new ArrayList<>();
            newAdd = 0;
            size++;
            for(int[] p : square){
                boolean valid = true;
                for(int i = 0; i<size; i++){
                    if(!valid) break;
                    for(int j = 0; j<size; j++){
                        if(!valid) break;
                        if(((p[0]+i)<matrix.length)&&((p[1]+j)<matrix[0].length)){
                            if(matrix[p[0]+i][p[1]+j] == 0){
                                valid = false;
                                break;
                            }
                        }
                        else{
                            valid = false;
                            break;
                        } 
                    }
                }
                if(valid){
                    tmp.add(p);
                }
            }
            newAdd = tmp.size();
            cnt+=newAdd;
            square = tmp;
            // System.out.println("newAdd: " + newAdd + ", size: " + size);
        }
        return cnt;
    }
}
// @lc code=end

