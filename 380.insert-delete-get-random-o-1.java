/*
 * @lc app=leetcode id=380 lang=java
 *
 * [380] Insert Delete GetRandom O(1)
 */

// @lc code=start
class RandomizedSet {

    Object head = null;
    Object next = null;

    public RandomizedSet() {
        RandomizedSet set = new RandomizedSet();
    }
    
    public boolean insert(int val) {
        if(this.head == null){
            this.head = val;
            return true;
        }
        else{
            Object curr = this.head;
            while(curr!=null){
                if((int)curr == val){
                    
                }
            }
        }
    }
    
    public boolean remove(int val) {
        
    }
    
    public int getRandom() {
        
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

