/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        Deque<String> q = new LinkedList();
        int counter = 0;
        StringBuilder sb = new StringBuilder("");
        for(char c : digits.toCharArray()){
            counter++;
            if(q.isEmpty()){
                switch(c){
                    case '2':
                        q.offer("a");
                        q.offer("b");
                        q.offer("c");
                        break;
                    case '3':
                        q.offer("d");
                        q.offer("e");
                        q.offer("f");
                        break;
                    case '4':
                        q.offer("g");
                        q.offer("h");
                        q.offer("i");
                        break;
                    case '5':
                        q.offer("j");
                        q.offer("k");
                        q.offer("l");
                        break;
                    case '6':
                        q.offer("m");
                        q.offer("n");
                        q.offer("o");
                        break;
                    case '7':
                        q.offer("p");
                        q.offer("q");
                        q.offer("r");
                        q.offer("s");
                        break;
                    case '8':
                        q.offer("t");
                        q.offer("u");
                        q.offer("v");
                        break;
                    case '9':
                        q.offer("w");
                        q.offer("x");
                        q.offer("y");
                        q.offer("z");
                        break;
                }
            }
            while(q.peek().length()<counter){
                String str = q.poll();
                switch(c){
                    case '2':
                        q.offer(str+"a");
                        q.offer(str+"b");
                        q.offer(str+"c");
                        break;
                    case '3':
                        q.offer(str+"d");
                        q.offer(str+"e");
                        q.offer(str+"f");
                        break;
                    case '4':
                        q.offer(str+"g");
                        q.offer(str+"h");
                        q.offer(str+"i");
                        break;
                    case '5':
                        q.offer(str+"j");
                        q.offer(str+"k");
                        q.offer(str+"l");
                        break;
                    case '6':
                        q.offer(str+"m");
                        q.offer(str+"n");
                        q.offer(str+"o");
                        break;
                    case '7':
                        q.offer(str+"p");
                        q.offer(str+"q");
                        q.offer(str+"r");
                        q.offer(str+"s");
                        break;
                    case '8':
                        q.offer(str+"t");
                        q.offer(str+"u");
                        q.offer(str+"v");
                        break;
                    case '9':
                        q.offer(str+"w");
                        q.offer(str+"x");
                        q.offer(str+"y");
                        q.offer(str+"z");
                        break;
                }
            }
        }
        List<String> ls = new ArrayList<>(q);
        return ls;
    }
}
// @lc code=end

