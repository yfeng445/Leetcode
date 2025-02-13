/*
 * @lc app=leetcode id=2416 lang=java
 *
 * [2416] Sum of Prefix Scores of Strings
 */

// @lc code=start

class Solution {
    static class TrieNode {
        TrieNode[] children;
        int count; // This will store how many words pass through this node
        TrieNode() {
            children = new TrieNode[26]; // 26 letters in the alphabet
            count = 0;
        }
    }

    static class Trie {
        TrieNode root; 
        Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new TrieNode();
                }
                node = node.children[index];
                node.count++; 
            }
        }

        public int getPrefixScore(String word) {
            TrieNode node = root;
            int score = 0;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (node.children[index] == null) {
                    break;
                }
                node = node.children[index];
                score += node.count; 
            }
            return score;
        }
    }

    public int[] sumPrefixScores(String[] words) {
        Trie trie = new Trie();
        int n = words.length;
        int[] scores = new int[n];

        for (String word : words) {
            trie.insert(word);
        }

        for (int i = 0; i < n; i++) {
            scores[i] = trie.getPrefixScore(words[i]);
        }

        return scores;
    }
}


// @lc code=end

