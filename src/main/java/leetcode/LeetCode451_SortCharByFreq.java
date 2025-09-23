package leetcode;
  /*
========================================
📌 Problem: Sort Characters By Frequency (LeetCode #451)
🔗 Link: https://leetcode.com/problems/sort-characters-by-frequency/

========================================
📝 Problem Description:
Given a string s, sort it in decreasing order based on the frequency of characters,
and return the sorted string.

========================================
🔎 Example:
Input:  s = "tree"
Output: "eert" or "eetr"

Input:  s = "cccaaa"
Output: "cccaaa" or "aaaccc"

Input:  s = "Aabb"
Output: "bbAa" or "bbaA"

========================================
💡 Intuition:
1. We need to sort characters by how many times they appear (frequency).
2. First count the frequency of each character using a HashMap.
3. Then we need a way to sort characters based on frequency:
   - Brute Force: Sort a list of characters manually using Collections.sort.
   - Optimized: Use a PriorityQueue (Max Heap) to always pick the highest frequency character first.
4. Finally, build the result string by repeating each character as many times as its frequency.

========================================
📊 Dry Run (for "tree"):
s = "tree"
Step 1: Frequency map:
    't' -> 1
    'r' -> 1
    'e' -> 2

Step 2: Sort by frequency:
    'e' (2), 't' (1), 'r' (1)

Step 3: Build string:
    "ee" + "t" + "r" = "eert"

========================================
🛠 Brute Force Approach:
- Count frequencies using HashMap.
- Put keys into a List.
- Sort the list by frequency using Collections.sort.
- Append each character frequency times.
- Time Complexity: O(n log n)
- Space Complexity: O(n)

========================================
⚡ Optimized Approach:
- Count frequencies using HashMap.
- Use a PriorityQueue (Max Heap) that stores characters ordered by frequency.
- Poll characters from PQ and append to result.
- Time Complexity: O(n log k) where k = unique characters.
- Space Complexity: O(n)
========================================
*/


import java.util.*;

public class LeetCode451_SortCharByFreq {
         // ================================
        // Brute Force Approach
        // ================================
        public String frequencySortBruteForce(String s) {
            // Step 1: Count frequency
            Map<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            // Step 2: Store characters in a list
            List<Character> chars = new ArrayList<>(map.keySet());

            // Step 3: Sort by frequency (descending)
            Collections.sort(chars, (a, b) -> map.get(b) - map.get(a));

            // Step 4: Build result
            StringBuilder sb = new StringBuilder();
            for (char c : chars) {
                int count = map.get(c);
                for (int i = 0; i < count; i++) {
                    sb.append(c);
                }
            }
            return sb.toString();
        }

        // ================================
        // Optimized Approach (PriorityQueue)
        // ================================
        public String frequencySortOptimized(String s) {
            // Step 1: Count frequency
            Map<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            // Step 2: Use Max Heap (PriorityQueue)
            PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
            pq.addAll(map.keySet());

            // Step 3: Build result
            StringBuilder sb = new StringBuilder();
            while (!pq.isEmpty()) {
                char c = pq.poll();
                int count = map.get(c);
                for (int i = 0; i < count; i++) {
                    sb.append(c);
                }
            }
            return sb.toString();
        }

        // ================================
        // Main Method for Testing
        // ================================
        public static void main(String[] args) {
            LeetCode451_SortCharByFreq sol = new LeetCode451_SortCharByFreq();

            String input1 = "tree";
            String input2 = "cccaaa";
            String input3 = "Aabb";

            System.out.println("Brute Force:");
            System.out.println(input1 + " -> " + sol.frequencySortBruteForce(input1));
            System.out.println(input2 + " -> " + sol.frequencySortBruteForce(input2));
            System.out.println(input3 + " -> " + sol.frequencySortBruteForce(input3));

            System.out.println("\nOptimized:");
            System.out.println(input1 + " -> " + sol.frequencySortOptimized(input1));
            System.out.println(input2 + " -> " + sol.frequencySortOptimized(input2));
            System.out.println(input3 + " -> " + sol.frequencySortOptimized(input3));
        }

}
