package leetcode;

/*
Problem: 448. Find All Numbers Disappeared in an Array
Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

Description:
Given an array nums of n integers where nums[i] is in the range [1, n],
return an array of all the integers in the range [1, n] that do not appear in nums.
You must write an algorithm that runs in O(n) time and uses only constant extra space.
*/

import java.util.*;

public class LeetCode448_DisappearedNumber {

    /*
    Intuition:
    - We need to find which numbers from 1..n are missing in the given nums array.
    - Since nums[i] is in range [1, n], it hints at index-based marking (O(1) extra space).
    - Different approaches exist: brute force, HashSet, sorting, and optimized O(1) space.
    */

    // Dry Run Example:
    // Input: nums = [4,3,2,7,8,2,3,1]
    // n = 8
    // Missing: [5, 6]


    /*
    Approach 1: Brute Force (O(n^2))
    For each number from 1..n, check if it exists in nums.
    */
    public List<Integer> findDisappearedNumbersBruteForce(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) result.add(i);
        }
        return result;
    }


    /*
    Approach 2: Using HashSet (O(n) time, O(n) space)
    Store all elements in a set, then check for missing numbers in range 1..n.
    */
    public List<Integer> findDisappearedNumbersHashSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }


    /*
    Approach 3: Sorting + Linear Scan (O(n log n))
    Sort the array and check missing numbers while iterating.
    */
    public List<Integer> findDisappearedNumbersSorting(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int expected = 1;
        for (int num : nums) {
            while (expected < num) {
                result.add(expected);
                expected++;
            }
            if (expected == num) {
                expected++;
            }
        }
        while (expected <= n) {
            result.add(expected++);
        }
        return result;
    }


    /*
    Approach 4: Optimized (O(n) time, O(1) extra space)
    Use index marking by negating the number at nums[val-1].
    Then, the positive indices correspond to missing numbers.
    */
    public List<Integer> findDisappearedNumbersOptimized(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }


    // Main method for testing
    public static void main(String[] args) {
        LeetCode448_DisappearedNumber sol = new LeetCode448_DisappearedNumber();

        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println("Brute Force: " + sol.findDisappearedNumbersBruteForce(nums.clone()));
        System.out.println("HashSet: " + sol.findDisappearedNumbersHashSet(nums.clone()));
        System.out.println("Sorting: " + sol.findDisappearedNumbersSorting(nums.clone()));
        System.out.println("Optimized Negation: " + sol.findDisappearedNumbersOptimized(nums.clone()));
    }
}

