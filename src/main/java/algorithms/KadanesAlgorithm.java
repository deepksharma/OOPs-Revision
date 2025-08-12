package algorithms;

/*
==========================================
          KADANE'S ALGORITHM CHEAT SHEET
==========================================

📌 Problem:
Find the **maximum subarray sum** in a given array (contiguous elements only).

📌 Key Idea:
We iterate through the array and at each position, decide:
- Either extend the current subarray
- Or start a new subarray from current element

📌 Time Complexity: O(n)
📌 Space Complexity: O(1)

💡 Works for:
- Positive numbers
- Negative numbers
- Mixed numbers
*/

import java.util.*;

public class KadanesAlgorithm {

    public static void main(String[] args) {
        example1BasicKadane();
        example2KadaneWithIndices();
        example3AllNegativeNumbers();
    }

    // ==========================================
    // 1️⃣ Basic Kadane's Algorithm
    // ==========================================
    private static void example1BasicKadane() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSoFar = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either take current element alone or extend the current sum
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maxSoFar if needed
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        System.out.println("Example 1 - Max Subarray Sum: " + maxSoFar);
        // Output: 6  (subarray [4, -1, 2, 1])
    }

    // ==========================================
    // 2️⃣ Kadane's with Subarray Indices
    // ==========================================
    private static void example2KadaneWithIndices() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSoFar = nums[0];
        int currentSum = nums[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Example 2 - Max Subarray Sum: " + maxSoFar +
                " (Subarray: " + Arrays.toString(Arrays.copyOfRange(nums, start, end + 1)) + ")");
        // Output: 6 (Subarray: [4, -1, 2, 1])
    }

    // ==========================================
    // 3️⃣ Kadane's Handling All Negative Numbers
    // ==========================================
    private static void example3AllNegativeNumbers() {
        int[] nums = {-8, -3, -6, -2, -5, -4};

        int maxSoFar = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        System.out.println("Example 3 - Max Subarray Sum (All Negatives): " + maxSoFar);
        // Output: -2 (Subarray: [-2])
    }
}

