/*
 * 📝 LeetCode 290: Word Pattern
 * 🔗 Link: https://leetcode.com/problems/word-pattern/
 *
 * 📌 Problem Statement:
 * Given a pattern and a string s, find if s follows the same pattern.
 *
 * Example:
 * pattern = "abba", s = "dog cat cat dog" → true
 * pattern = "abba", s = "dog cat cat fish" → false
 * pattern = "aaaa", s = "dog cat cat dog" → false
 * pattern = "abba", s = "dog dog dog dog" → false
 *
 * -------------------------------------------------------
 * 🎯 Intuition:
 * - We need to check if each character in pattern maps to a unique word in s.
 * - Similarly, each word must also map back to only one character.
 * - This is a **bijection problem** → One-to-One & Onto mapping.
 *
 * -------------------------------------------------------
 * 🔑 Approach:
 * 1. Split the string `s` into words.
 * 2. If pattern length != number of words → return false.
 * 3. Use two HashMaps:
 *      - Map1: Character → Word
 *      - Map2: Word → Character
 * 4. Iterate over pattern and words:
 *      - If char already mapped to another word → return false.
 *      - If word already mapped to another char → return false.
 *      - Else, put mapping in both maps.
 * 5. If iteration finishes → return true.
 *
 * -------------------------------------------------------
 * 🧠 Dry Run:
 * pattern = "abba"
 * s = "dog cat cat dog"
 *
 * words[] = ["dog", "cat", "cat", "dog"]
 *
 * i=0: c='a', word="dog"
 *   map1: a → dog
 *   map2: dog → a
 *
 * i=1: c='b', word="cat"
 *   map1: b → cat
 *   map2: cat → b
 *
 * i=2: c='b', word="cat"
 *   Already exists, mapping matches → continue
 *
 * i=3: c='a', word="dog"
 *   Already exists, mapping matches → continue
 *
 * ✅ Result = true
 *
 * -------------------------------------------------------
 * ⏱️ Time Complexity:
 * - Splitting string → O(n) where n = length of s
 * - Iterating over pattern → O(m) where m = length of pattern
 * - Overall: O(n + m) ≈ O(n)
 *
 * 🗂️ Space Complexity:
 * - Two HashMaps storing unique mappings
 * - Worst case → O(m)
 *
 * -------------------------------------------------------
 * ✅ Final Java Code
 */

package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode290_WordPattern {
    public static boolean wordPattern(String pattern , String s){
        String[] words = s.split(" ");

        // Check length mismatch first
        if(pattern.length() != words.length) return false;

        Map<Character , String> map1 = new HashMap<>();
        Map<String , Character> map2 = new HashMap<>();

        for(int i = 0 ; i < pattern.length() ; i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if(map1.containsKey(c) && !map1.get(c).equals(word)) return false;
            if(map2.containsKey(word) && !map2.get(word).equals(c)) return false;

            map1.put(c , word);
            map2.put(word , c);
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean ans  = wordPattern(pattern , s);
        System.out.println(ans); // true
    }
}
