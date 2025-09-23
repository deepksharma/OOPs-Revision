package leetcode;

/**
 * LeetCode 796. Rotate String
 * Problem Link: https://leetcode.com/problems/rotate-string/
 *
 * Problem Description:
 * We are given two strings s and goal.
 * We need to check if we can rotate s any number of times so that it becomes equal to goal.
 *
 * Example:
 *   Input: s = "abcde", goal = "cdeab"
 *   Output: true
 *
 *   Input: s = "abcde", goal = "abced"
 *   Output: false
 *
 * ------------------------------------------------------------
 * 💡 Intuition:
 *  - A brute force way is to rotate the string one character at a time
 *    and check if it matches goal.
 *  - An optimized way is to notice that all possible rotations of s
 *    exist as substrings inside (s + s).
 *
 * ------------------------------------------------------------
 * Brute Force Approach:
 *  - Rotate s one character at a time.
 *  - Compare with goal.
 *  - Time Complexity: O(n^2)
 *
 * Optimized Approach:
 *  - Check if lengths of s and goal are same.
 *  - If yes, check if goal is a substring of (s + s).
 *  - Time Complexity: O(n^2) worst case (substring search), but much faster in practice.
 */

public class LeetCode796_RotateString{

        // ---------------- Brute Force Solution ----------------
        public static boolean rotateStringBruteForce(String s, String goal) {
            if (s.length() != goal.length()) {
                return false;
            }

            String rotated = s;
            for (int i = 0; i < s.length(); i++) {
                // Rotate left by 1
                rotated = rotated.substring(1) + rotated.charAt(0);
                if (rotated.equals(goal)) {
                    return true;
                }
            }
            return false;
        }

        // ---------------- Optimized Solution ----------------
        public static boolean rotateStringOptimized(String s, String goal) {
            if (s.length() != goal.length()) {
                return false;
            }
            return (s + s).contains(goal);
        }

        // ---------------- Main Method for Testing ----------------
        public static void main(String[] args) {
            String s1 = "abcde", goal1 = "cdeab";
            String s2 = "abcde", goal2 = "abced";
            String s3 = "a", goal3 = "a";
            String s4 = "ab", goal4 = "ba";

            System.out.println("Brute Force Approach:");
            System.out.println(s1 + " -> " + goal1 + " : " + rotateStringBruteForce(s1, goal1)); // true
            System.out.println(s2 + " -> " + goal2 + " : " + rotateStringBruteForce(s2, goal2)); // false
            System.out.println(s3 + " -> " + goal3 + " : " + rotateStringBruteForce(s3, goal3)); // true
            System.out.println(s4 + " -> " + goal4 + " : " + rotateStringBruteForce(s4, goal4)); // true

            System.out.println("\nOptimized Approach:");
            System.out.println(s1 + " -> " + goal1 + " : " + rotateStringOptimized(s1, goal1)); // true
            System.out.println(s2 + " -> " + goal2 + " : " + rotateStringOptimized(s2, goal2)); // false
            System.out.println(s3 + " -> " + goal3 + " : " + rotateStringOptimized(s3, goal3)); // true
            System.out.println(s4 + " -> " + goal4 + " : " + rotateStringOptimized(s4, goal4)); // true
        }

}
