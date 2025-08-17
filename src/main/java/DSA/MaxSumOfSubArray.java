package DSA;/*
============================================================
    📌 Sliding Window – Universal BODI Template
============================================================

📝 Problem Statement:
    Given an array of integers and a number k, find the maximum
    sum of any contiguous subarray of size k.

    Example:
    arr = [2, 1, 5, 1, 3, 2], k = 3
    Output: 9  (subarray [5,1,3])

============================================================
    1️⃣ B – Brute Force Approach
============================================================
    Idea:
        - Iterate over every possible starting index
        - For each start, sum up the next k elements
        - Keep track of the maximum sum found

    Time Complexity: O(n * k)
    Space Complexity: O(1)
*/

public class MaxSumOfSubArray {

    // ---------- B: Brute Force ----------
    public static int maxSumBrute(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start <= arr.length - k; start++) {
            int sum = 0;
            for (int j = start; j < start + k; j++) {
                sum += arr[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    /*
    ============================================================
        2️⃣ O – Optimized Approach (Sliding Window)
    ============================================================
        Idea:
            - Find sum of first window of size k
            - Slide the window by adding the incoming element and
              removing the outgoing element
            - Keep updating max sum

        Time Complexity: O(n)
        Space Complexity: O(1)
    */

    public static int maxSumOptimized(int[] arr, int k) {
        int windowSum = 0;
        int maxSum;

        // Step 1: Sum of first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Step 2: Slide the window
        for (int end = k; end < arr.length; end++) {
            windowSum = windowSum + arr[end] - arr[end - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    /*
    ============================================================
        3️⃣ D – Dry Run Example
    ============================================================

    arr = [2, 1, 5, 1, 3, 2], k = 3

    Initial Window (0-2): sum = 2+1+5 = 8 → max = 8

    end=3 → add 1, remove 2: sum = 8 + 1 - 2 = 7 → max = 8
    end=4 → add 3, remove 1: sum = 7 + 3 - 1 = 9 → max = 9
    end=5 → add 2, remove 5: sum = 9 + 2 - 5 = 6 → max = 9

    Final Answer: 9
    */

    /*
    ============================================================
        4️⃣ I – Important Notes & Rules
    ============================================================

    📌 Rules / Ideas for Sliding Window:
        1. Works when data is contiguous (subarrays or substrings).
        2. For fixed size:
            - Use sum += arr[end] - arr[end - k]
        3. For variable size:
            - Use two pointers and adjust window based on condition.
        4. Always initialize with first window before sliding.

    📌 When to Use Sliding Window:
        - Problems involving contiguous elements.
        - When repetitive computation can be avoided.
        - Finding sum, max, min, average in ranges.

    📌 Time Complexity:
        Brute Force: O(n * k)
        Optimized:   O(n)
        Space:       O(1)
    */

    // ---------- Main method for quick testing ----------
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println("Brute Force Result: " + maxSumBrute(arr, k));
        System.out.println("Optimized Result: " + maxSumOptimized(arr, k));
    }
}
