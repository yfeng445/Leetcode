/*
 * @lc app=leetcode id=729 lang=java
 *
 * [729] My Calendar I
 */

// @lc code=start
import java.util.ArrayList;
class MyCalendar {

    ArrayList<int[]> records;
    
    public MyCalendar() {
        records = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        if(start<end) return false;
        if(records.size()==0){
            records.add(new int[]{start, end});
        }
        records.add(new int[]{start, end});
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
// @lc code=end

