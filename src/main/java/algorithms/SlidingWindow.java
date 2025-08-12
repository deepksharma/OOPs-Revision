package algorithms;

/*
======================================================
            ALGORITHM CHEATSHEET - SLIDING WINDOW
======================================================
📌 CONCEPT:
Sliding Window is a technique for problems involving
contiguous sequences (subarrays/substrings).
We maintain a "window" (range) and slide it through the data.

✅ Two Main Types:
1. Fixed-size window (size k) → O(n) time
   - Used when the window size is given
   - Example: Max sum of subarray of size k
2. Variable-size window (dynamic) → O(n) time
   - Used when the window size depends on conditions
   - Example: Longest substring without repeating characters

Time Complexity: O(n)
Space Complexity: O(1) or O(k) depending on implementation

======================================================
*/

import java.util.*;

public class SlidingWindow {
    public static void main(String[] args) {

        /*
        ========================
        EXAMPLE 1: Fixed-size Window
        Problem: Find max sum of subarray of size k
        ========================
        */
        int[] arr1 = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int windowSum = 0, maxSum = Integer.MIN_VALUE;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += arr1[i];
        }
        maxSum = windowSum;

        // Slide the window
        for (int end = k; end < arr1.length; end++) {
            windowSum += arr1[end] - arr1[end - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("Max sum of subarray of size " + k + ": " + maxSum);
        // Output: 9 (subarray: [5, 1, 3])

        /*
        ========================
        EXAMPLE 2: Variable-size Window
        Problem: Length of longest substring without repeating characters
        ========================
        */
        String s = "abcabcbb";
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // Shrink window until unique
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println("Length of longest substring without repeating: " + maxLength);
        // Output: 3 ("abc")

        /*
        ========================
        EXAMPLE 3: Variable-size Window (Sum Condition)
        Problem: Smallest subarray length with sum ≥ target
        ========================
        */
        int[] arr2 = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int start = 0, currSum = 0, minLen = Integer.MAX_VALUE;

        for (int end = 0; end < arr2.length; end++) {
            currSum += arr2[end];

            // Shrink from start if sum ≥ target
            while (currSum >= target) {
                minLen = Math.min(minLen, end - start + 1);
                currSum -= arr2[start];
                start++;
            }
        }

        System.out.println("Smallest subarray length with sum ≥ " + target + ": " +
                (minLen == Integer.MAX_VALUE ? 0 : minLen));
        // Output: 2 ([4, 3])
    }
}
