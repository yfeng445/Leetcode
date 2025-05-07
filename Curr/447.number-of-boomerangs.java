/*
 * @lc app=leetcode id=447 lang=java
 *
 * [447] Number of Boomerangs
 */

// @lc code=start
class Solution {
    int m = 100003;
    int R = 79999;
    // Each element in table is either null or an int[] of length 2:
    // table[index][0] = distance, table[index][1] = frequency
    int[][] table = new int[m][];

    public int numberOfBoomerangs(int[][] points) {
        if(points.length < 3) return 0;
        int res = 0;

        for(int i = 0; i < points.length; i++){
            // Clear the table for the current i
            for(int k = 0; k < m; k++){
                table[k] = null;
            }

            // Build frequency map of distances from points[i] to every other point
            for(int j = 0; j < points.length; j++){
                if(i == j) continue;
                int dist = getDisatnce(points[i], points[j]);

                // Double hashing:
                int h1 = dist % m;
                if(h1 < 0) h1 += m;
                int h2 = dist % R;
                if(h2 < 0) h2 += R;
                h2 = R - h2;
                if(h2 == 0) h2 = 1;

                int index = h1;
                // Probe for empty or matching slot
                while(table[index] != null && table[index][0] != dist){
                    index = (index + h2) % m;
                }

                // If empty, set distance and freq=1; else increment freq
                if(table[index] == null){
                    table[index] = new int[]{dist, 1};
                } else {
                    table[index][1]++;
                }
            }

            // Count boomerangs contributed by the frequencies of each distance
            for(int k = 0; k < m; k++){
                if(table[k] != null){
                    int freq = table[k][1];
                    // freq*(freq-1) permutations
                    if(freq > 1){
                        res += freq * (freq - 1);
                    }
                }
            }
        }

        return res;
    }

    public int getDisatnce(int[] i, int[] j){
        return (i[0] - j[0]) * (i[0] - j[0]) + (i[1] - j[1]) * (i[1] - j[1]);
    }
}

// @lc code=end

