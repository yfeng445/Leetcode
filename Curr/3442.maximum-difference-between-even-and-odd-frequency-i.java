import java.util.HashMap;

class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.get(c) == null){
                map.put(c, 1);
            }
            else{
                map.put(c, map.get(c)+1);
            }
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()%2 == 0){
                minEven = Math.min(minEven, entry.getValue());
            }
            else{
                maxOdd = Math.max(maxOdd, entry.getValue());
            }
        }

        return maxOdd - minEven;
    }
}