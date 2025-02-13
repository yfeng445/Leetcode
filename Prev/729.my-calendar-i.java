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
        records = new ArrayList<int[]>();
    }
    
    public boolean book(int start, int end) {
        if(start<end) return false;
        try{
            for(int i = 0; i<records.size(); i++){
                int[] record = records.get(i);
            }
        }
        catch(Exception e){
            int[] reservation = new;
            records.add()
        }

        
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
// @lc code=end

