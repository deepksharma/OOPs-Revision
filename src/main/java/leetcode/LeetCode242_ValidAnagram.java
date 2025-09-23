package leetcode;

/*
===============================================
LeetCode 242. Valid Anagram
Link: https://leetcode.com/problems/valid-anagram/
===============================================

📝 Problem Statement:
Given two strings s and t, return true if t is an anagram of s,
and false otherwise.

➡️ An anagram is a word or phrase formed by rearranging the letters
of another, using all the original letters exactly once.

---------------------------------------------------
Examples:
Input: s = "anagram", t = "nagaram"
Output: true

Input: s = "rat", t = "car"
Output: false
---------------------------------------------------

🎯 Intuition:
We need to check if both strings contain exactly the same characters
with the same frequency.

Key Idea:
- If lengths differ → false immediately.
- Then compare character counts in some way.

We will discuss 3 approaches:
1️⃣ Brute Force → Sort & Compare
2️⃣ Better → HashMap frequency count
3️⃣ Optimized → Frequency array (since only lowercase letters a–z)
---------------------------------------------------
*/

import java.util.*;

public class LeetCode242_ValidAnagram {

    /*
    ==========================================================
    1️⃣ Brute Force Approach (Sorting)
    ----------------------------------------------------------
    - Convert both strings into char arrays.
    - Sort both arrays.
    - Compare element by element.
    - If same → true, else false.

    ⏱ Time Complexity: O(n log n) (due to sorting)
    📦 Space Complexity: O(1) (ignoring sort’s internal usage)
    ==========================================================
    */
    public static boolean isAnagramBrute(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    /*
    ==========================================================
    2️⃣ Better Approach (HashMap Counting)
    ----------------------------------------------------------
    - Count frequency of each char in s using a HashMap.
    - Reduce count while iterating t.
    - If mismatch found → false.

    ⏱ Time Complexity: O(n)
    📦 Space Complexity: O(n) (HashMap storage)
    ==========================================================
    */
    public static boolean isAnagramBetter(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }

        return map.isEmpty();
    }

    /*
    ==========================================================
    3️⃣ Optimized Approach (Fixed Frequency Array)
    ----------------------------------------------------------
    - Since only lowercase English letters exist (a–z),
      we use an integer array of size 26.
    - Increment counts for s, decrement for t.
    - If all zero → anagram.

    ⏱ Time Complexity: O(n)
    📦 Space Complexity: O(1) (fixed size array of 26)
    ==========================================================
    */
    public static boolean isAnagramOptimized(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            freq[c - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }

    /*
    ==========================================================
    🔎 Dry Run Example:
    s = "anagram", t = "nagaram"

    freq array after processing s:
    a:3, n:1, g:1, r:1, m:1

    after processing t:
    all counts return to 0 → true
    ==========================================================
    */

    // 🚀 Testing all approaches
    public static void main(String[] args) {
        String s1 = "anagram", t1 = "nagaram";
        String s2 = "rat", t2 = "car";

        System.out.println("Brute Force:");
        System.out.println(isAnagramBrute(s1, t1)); // true
        System.out.println(isAnagramBrute(s2, t2)); // false

        System.out.println("\nBetter (HashMap):");
        System.out.println(isAnagramBetter(s1, t1)); // true
        System.out.println(isAnagramBetter(s2, t2)); // false

        System.out.println("\nOptimized (Frequency Array):");
        System.out.println(isAnagramOptimized(s1, t1)); // true
        System.out.println(isAnagramOptimized(s2, t2)); // false
    }
}

