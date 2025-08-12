package algorithms;

/*
======================================================
            ALGORITHM CHEATSHEET - PREFIX SUM
======================================================
📌 CONCEPT:
Prefix Sum is an array where each element at index i
stores the sum of elements from index 0 to i in the original array.

✅ Use Cases:
1. Fast range sum queries
2. Subarray sum problems
3. Cumulative frequency/count problems
4. 2D grid sum queries

Time Complexity:
- Preprocessing: O(n) or O(n*m) for 2D
- Query: O(1)

======================================================
*/

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {

        /*
        ========================
        EXAMPLE 1: Basic Prefix Sum Construction
        ========================
        */
        int[] arr = {2, 4, 5, 7, 8};
        int n = arr.length;

        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Prefix sum array: " + Arrays.toString(prefix));
        // Output: Prefix sum array: [2, 6, 11, 18, 26]

        /*
        ========================
        EXAMPLE 2: Range Sum Query in O(1)
        Problem: Find sum of elements from index l to r
        ========================
        */
        int l = 1, r = 3; // range from index 1 to 3 (4 + 5 + 7)
        int rangeSum = prefix[r] - (l > 0 ? prefix[l - 1] : 0);
        System.out.println("Sum from index " + l + " to " + r + ": " + rangeSum);
        // Output: 16

        /*
        ========================
        EXAMPLE 3: Subarray Sum equals K
        Problem: Count subarrays with sum = k
        Approach: Prefix sum + HashMap (stores frequencies)
        ========================
        */
        int[] arr2 = {1, 1, 1};
        int k = 2;
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
        map.put(0, 1); // base case for sum exactly k starting at index 0

        int sum = 0, count = 0;
        for (int num : arr2) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Number of subarrays with sum " + k + ": " + count);
        // Output: 2 ([1,1] at positions (0,1) and (1,2))

        /*
        ========================
        EXAMPLE 4: 2D Prefix Sum (Matrix)
        Problem: Query sum of submatrix in O(1) after preprocessing
        ========================
        */
        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };

        int rows = matrix.length, cols = matrix[0].length;
        int[][] prefix2D = new int[rows + 1][cols + 1]; // extra row & col for easier indexing

        // Build prefix sum matrix
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                prefix2D[i][j] = matrix[i - 1][j - 1]
                        + prefix2D[i - 1][j]
                        + prefix2D[i][j - 1]
                        - prefix2D[i - 1][j - 1];
            }
        }

        // Query sum of rectangle from (row1,col1) to (row2,col2) inclusive
        int row1 = 2, col1 = 1, row2 = 4, col2 = 3; // submatrix
        int submatrixSum = prefix2D[row2 + 1][col2 + 1]
                - prefix2D[row1][col2 + 1]
                - prefix2D[row2 + 1][col1]
                + prefix2D[row1][col1];

        System.out.println("Sum of submatrix: " + submatrixSum);
        // Output: 8
    }
}
