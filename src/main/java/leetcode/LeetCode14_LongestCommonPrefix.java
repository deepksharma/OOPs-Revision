package leetcode;
/**
 * LeetCode 14. Longest Common Prefix
 * Problem Link: https://leetcode.com/problems/longest-common-prefix/
 *
 * Problem Description:
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *   Input: strs = ["flower","flow","flight"]
 *   Output: "fl"
 *
 * Example 2:
 *   Input: strs = ["dog","racecar","car"]
 *   Output: ""
 *   Explanation: There is no common prefix among the input strings.
 *
 * ------------------------------------------------------------
 * 💡 Intuition:
 * - We need the maximum prefix (starting part of the string) that is common among all strings.
 * - Brute Force → Check character by character for all strings.
 * - Optimized → Use the first string as prefix and keep reducing it until all strings start with it.
 *
 * ------------------------------------------------------------
 * 📝 Dry Run (Example: ["flower","flow","flight"]):
 *  - Start prefix = "flower"
 *  - Check "flow": not starting with "flower" → reduce prefix → "flow"
 *  - Check "flow": ok, still prefix = "flow"
 *  - Check "flight": not starting with "flow" → reduce → "flo" → "fl"
 *  - Final prefix = "fl"
 *
 * ------------------------------------------------------------
 * Brute Force Approach:
 * - Compare character by character across all strings.
 * - Time Complexity: O(n * m)  (n = number of strings, m = length of shortest string)
 *
 * Optimized Approach:
 * - Start with prefix = first string.
 * - For every other string, keep reducing prefix until it matches.
 * - Time Complexity: O(n * m)
 */

import java.util.*;

public class LeetCode14_LongestCommonPrefix {

    // ---------------- Brute Force Solution ----------------
    public static String longestCommonPrefixBruteForce(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    // ---------------- Optimized Solution ----------------
    public static String longestCommonPrefixOptimized(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    // ---------------- Main Method for Testing ----------------
    public static void main(String[] args) {
        String[] input1 = {"flower","flow","flight"};
        String[] input2 = {"dog","racecar","car"};
        String[] input3 = {"interspecies","interstellar","interstate"};
        String[] input4 = {"a"};

        System.out.println("Brute Force Approach:");
        System.out.println(Arrays.toString(input1) + " → " + longestCommonPrefixBruteForce(input1)); // fl
        System.out.println(Arrays.toString(input2) + " → " + longestCommonPrefixBruteForce(input2)); // ""
        System.out.println(Arrays.toString(input3) + " → " + longestCommonPrefixBruteForce(input3)); // "inters"
        System.out.println(Arrays.toString(input4) + " → " + longestCommonPrefixBruteForce(input4)); // "a"

        System.out.println("\nOptimized Approach:");
        System.out.println(Arrays.toString(input1) + " → " + longestCommonPrefixOptimized(input1)); // fl
        System.out.println(Arrays.toString(input2) + " → " + longestCommonPrefixOptimized(input2)); // ""
        System.out.println(Arrays.toString(input3) + " → " + longestCommonPrefixOptimized(input3)); // "inters"
        System.out.println(Arrays.toString(input4) + " → " + longestCommonPrefixOptimized(input4)); // "a"
    }
}
