/*
 * @lc app=leetcode id=131 lang=java
 *
 * [131] Palindrome Partitioning
 */

// @lc code=start
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = getPalidrome(s, 0);
        return ans;
    }

    public List<List<String>> getPalidrome(String s, int index){
        List<List<String>> ans = new ArrayList<>();
        if(index == s.length()){
            ans.add(new ArrayList<>());
            return ans;
        } 
        else{
            for(int i = index; i<s.length(); i++){
                if(isPalindrome(s.substring(index, i+1))){
                    for(List<String> l : getPalidrome(s, i+1)){
                        List<String> ls = new ArrayList<>();
                        ls.add(s.substring(index, i + 1));
                        ls.addAll(l);
                        ans.add(ls);
                    }
                }
            }
        }
        // System.out.println(ans.toString());
        return ans;
    }

    public boolean isPalindrome(String s){
        int start = 0; int end = s.length()-1;
        while(start<end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }
}
// @lc code=end

