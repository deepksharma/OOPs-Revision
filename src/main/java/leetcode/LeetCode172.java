package leetcode;

public class LeetCode172 {
    // 🔹 Problem Title: Factorial Trailing Zeroes
// 🔗 Link: https://leetcode.com/problems/factorial-trailing-zeroes/

// 📘 Problem Description:
// Given an integer n, return the number of trailing zeroes in n!.
// Note: n! = n × (n - 1) × (n - 2) × ... × 3 × 2 × 1

    public static class FactorialTrailingZeroes {

        // 💡 Intuition:
        // Trailing zeroes are caused by 10s, and 10 = 2 × 5.
        // Since there are more 2s than 5s in factorial multiplication,
        // we just need to count the number of 5s in all the numbers from 1 to n.
        // Also include higher powers like 25, 125, etc.

        // ✅ Iterative Approach
        public int trailingZeroesIterative(int n) {
            int count = 0;
            while (n >= 5) {
                n = n / 5;
                count += n;
            }
            return count;
        }

        // ✅ Recursive Approach
        public int trailingZeroesRecursive(int n) {
            if (n < 5) return 0;
            return (n / 5) + trailingZeroesRecursive(n / 5);
        }

        // 🧠 Dry Run:
        // n = 100
        // 100 / 5 = 20   (twenty 5s)
        // 100 / 25 = 4   (four 25s, each adds another 5)
        // 100 / 125 = 0
        // Total = 20 + 4 = 24 trailing zeroes

        // 🧪 Test Cases
        public static void main(String[] args) {
            FactorialTrailingZeroes solution = new FactorialTrailingZeroes();

            System.out.println("Iterative Approach:");
            System.out.println(solution.trailingZeroesIterative(5));    // Output: 1
            System.out.println(solution.trailingZeroesIterative(10));   // Output: 2
            System.out.println(solution.trailingZeroesIterative(100));  // Output: 24

            System.out.println("Recursive Approach:");
            System.out.println(solution.trailingZeroesRecursive(5));    // Output: 1
            System.out.println(solution.trailingZeroesRecursive(10));   // Output: 2
            System.out.println(solution.trailingZeroesRecursive(100));  // Output: 24
        }

        // ⏱️ Time Complexity:
        // Iterative: O(log₅n)
        // Recursive: O(log₅n)
        // 🛑 Space Complexity:
        // Iterative: O(1)
        // Recursive: O(log₅n) due to call stack
    }


}
