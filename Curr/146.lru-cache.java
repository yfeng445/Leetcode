/*
 * @lc app=leetcode id=146 lang=java
 *
 * [146] LRU Cache
 */

// @lc code=start

import java.util.ArrayList;

class LRUCache {
    
    ArrayList<int[]> cache; 
    int capacity;

    public LRUCache(int capacity) {
        this.cache = new ArrayList<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        for (int i = 0; i < cache.size(); i++) {
            int[] rec = cache.get(i);
            if (rec[0] == key) {
                cache.remove(i);
                cache.add(rec);
                return rec[1];
            }
        }
        return -1;
    }

    public void put(int key, int value) {
        for (int i = 0; i < cache.size(); i++) {
            int[] rec = cache.get(i);
            if (rec[0] == key) {
                rec[1] = value;
                cache.remove(i);
                cache.add(rec);
                return;
            }
        }
        if (cache.size() == capacity) {
            cache.remove(0);
        }
        cache.add(new int[]{key, value});
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// @lc code=end

