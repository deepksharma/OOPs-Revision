package leetcode;
import java.util.*;

/**
 * LeetCode 205. Isomorphic Strings
 * Problem Link: https://leetcode.com/problems/isomorphic-strings/
 *
 * Problem Description:
 * Two strings s and t are isomorphic if the characters in s can be replaced
 * to get t.
 *
 * Rules:
 *  - Each character in s must map to one character in t.
 *  - No two characters may map to the same character.
 *  - A character must map to itself consistently.
 *
 * Example 1:
 *   Input: s = "egg", t = "add"
 *   Output: true
 *
 * Example 2:
 *   Input: s = "foo", t = "bar"
 *   Output: false
 *
 * Example 3:
 *   Input: s = "paper", t = "title"
 *   Output: true
 *
 * ------------------------------------------------------------
 * 💡 Intuition:
 *  - The relationship between characters must be one-to-one and consistent.
 *  - We can use a mapping (HashMap) to check if each character in s
 *    always maps to the same character in t.
 *  - Also, we need to ensure no two characters from s map to the same character in t.
 *
 * ------------------------------------------------------------
 * Brute Force Approach:
 *  - For each character, check its mapping manually using nested loops.
 *  - Time Complexity: O(n^2)
 *
 * Optimized Approach:
 *  - Use two HashMaps (or arrays) to track mappings s→t and t→s.
 *  - If inconsistency found, return false.
 *  - Time Complexity: O(n)
 */

public class LeetCode205_IsomorphicStrings {

        // ---------------- Brute Force Solution ----------------
        public static boolean isIsomorphicBruteForce(String s, String t) {
            if (s.length() != t.length()) return false;

            for (int i = 0; i < s.length(); i++) {
                char c1 = s.charAt(i);
                char c2 = t.charAt(i);

                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == c1 && t.charAt(j) != c2) {
                        return false;
                    }
                    if (t.charAt(j) == c2 && s.charAt(j) != c1) {
                        return false;
                    }
                }
            }
            return true;
        }

        // ---------------- Optimized Solution ----------------
        public static boolean isIsomorphicOptimized(String s, String t) {
            if (s.length() != t.length()) return false;

            Map<Character, Character> mapST = new HashMap<>();
            Map<Character, Character> mapTS = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char c1 = s.charAt(i);
                char c2 = t.charAt(i);

                if (mapST.containsKey(c1) && mapST.get(c1) != c2) return false;
                if (mapTS.containsKey(c2) && mapTS.get(c2) != c1) return false;

                mapST.put(c1, c2);
                mapTS.put(c2, c1);
            }
            return true;
        }

        // ---------------- Main Method for Testing ----------------
        public static void main(String[] args) {
            String s1 = "egg", t1 = "add";
            String s2 = "foo", t2 = "bar";
            String s3 = "paper", t3 = "title";
            String s4 = "ab", t4 = "aa";

            System.out.println("Brute Force Approach:");
            System.out.println(s1 + " -> " + t1 + " : " + isIsomorphicBruteForce(s1, t1)); // true
            System.out.println(s2 + " -> " + t2 + " : " + isIsomorphicBruteForce(s2, t2)); // false
            System.out.println(s3 + " -> " + t3 + " : " + isIsomorphicBruteForce(s3, t3)); // true
            System.out.println(s4 + " -> " + t4 + " : " + isIsomorphicBruteForce(s4, t4)); // false

            System.out.println("\nOptimized Approach:");
            System.out.println(s1 + " -> " + t1 + " : " + isIsomorphicOptimized(s1, t1)); // true
            System.out.println(s2 + " -> " + t2 + " : " + isIsomorphicOptimized(s2, t2)); // false
            System.out.println(s3 + " -> " + t3 + " : " + isIsomorphicOptimized(s3, t3)); // true
            System.out.println(s4 + " -> " + t4 + " : " + isIsomorphicOptimized(s4, t4)); // false
        }
}
