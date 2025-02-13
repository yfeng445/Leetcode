/*
 * @lc app=leetcode id=773 lang=java
 *
 * [773] Sliding Puzzle
 */

// @lc code=start

class Solution {
    public int slidingPuzzle(int[][] board) {
        String str = toString(board).replace("0", "");
        boolean match = false;
        for(int i = 0; i<5; i++){
            String tmp = str.substring(i, 5)+str.subSequence(0, i);
            System.out.println(tmp);
            if(tmp.equals("12354")){
                System.out.println("Match!");
                match = true;
                break;
            }
        }
        if(!match){
            return -1;
        }

        String s = toString(board);
        for(int i = 0; i<6; i++){
            String tmp = s.substring(i, 6)+s.subSequence(0, i);
            if(tmp.equals("123504")) return 1;
            else if(tmp.equals("123540")) return 2;
            else if(tmp.equals("102354")) return 3;
            else if(tmp.equals("120354")) return 4;
            else if(tmp.equals("123054")){
                if(i == 0) return 0;
                else return 5;
            } 
        }

        
        return 0;

    }

    
    public String toString(int[][] board){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<3; i++){
            sb.append(board[0][i]);
        }
        for(int j = 2; j>=0; j--){
            sb.append(board[1][j]);
        }
        return sb.toString();
    }
}
// @lc code=end

