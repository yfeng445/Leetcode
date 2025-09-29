/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ls;
        if(n == 1){
            ls = new ArrayList<>(Arrays.asList("()"));
        }
        else{
            ls = new ArrayList<>();
            List<String> ls0 = generateParenthesis(n-1);
            for(String str : ls0) ls.add("(" + str +")");
            for(int i = 1; i<=(n+1)/2; i++){
                List<String> ls1 = generateParenthesis(i);
                List<String> ls2 = generateParenthesis(n-i);
                for(String str1 : ls1){
                    for(String str2 : ls2){
                        if(!ls.contains(str1+str2)) ls.add(str1+str2);
                        if(!ls.contains(str2+str1)) ls.add(str2+str1);
                    }
                }
            }
        }
        return ls;
    }
}
// @lc code=end

