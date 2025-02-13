/*
 * @lc app=leetcode id=380 lang=java
 *
 * [380] Insert Delete GetRandom O(1)
 */

// @lc code=start
import java.util.ArrayList;

class RandomizedSet {

    ArrayList<Integer> rs= new ArrayList<>();

    public RandomizedSet() {
         
    }
    
    public boolean insert(int val) {
        if(rs.contains(val)){
            return false;
        }
        else{
            rs.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(!rs.contains(val))return false;
        else{
            for(int i = 0; i<rs.size(); i++){
                if(val == rs.get(i)){
                    rs.remove(i);
                    break;
                }
            }
            return true;
        }
    }
    
    public int getRandom() {
        return rs.get((int) (Math.random() * rs.size()));
    }
}


/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
// @lc code=end

