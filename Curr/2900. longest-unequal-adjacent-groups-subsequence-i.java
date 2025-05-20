
import java.util.ArrayList;
import java.util.List;

class Solution {


    ArrayList<ArrayList<String>> longestSubsequence = new ArrayList<>();
    ArrayList<Integer> mxLen = new ArrayList<>();
    int mxVal = 1;
    int mxIndex = 0;

    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        ArrayList<String> tmp = new ArrayList<>();
        tmp.add(words[0]);
        longestSubsequence.add(tmp);
        mxLen.add(1);

        for(int i = 1; i<words.length; i++){
            
            int unequalIndex = getUnequalIndex(i, groups);
            // System.out.println("curr index: " + i + ", unequalIndex: " + unequalIndex);
            if(unequalIndex == -1){
                mxLen.add(1);
                tmp = new ArrayList<>();
                tmp.add(words[i]);
                longestSubsequence.add(tmp);
            }
            else{
                mxIndex = (mxLen.get(unequalIndex)+1) > mxVal ? i : mxIndex;
                mxVal = Math.max((mxLen.get(unequalIndex)+1), mxVal);
                mxLen.add(mxLen.get(unequalIndex)+1);
                ArrayList<String> cp = new ArrayList<>(longestSubsequence.get(unequalIndex));
                cp.add(words[i]);
                longestSubsequence.add(cp);
            }
            
            // System.out.println(longestSubsequence.toString());
        }

        

        return longestSubsequence.get(mxIndex);
    }

    public int getUnequalIndex(int currPos, int[] groups){
        int currGroup = groups[currPos];
        currPos--;
        while(currPos != -1){
            if(groups[currPos] != currGroup){
                return currPos;
            }
            currPos--;
        }
        return -1;
    }
}