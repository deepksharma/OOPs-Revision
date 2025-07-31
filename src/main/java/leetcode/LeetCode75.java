// 🔗 Problem: https://leetcode.com/problems/sort-colors
// 🧠 Title: LeetCode 75 - Sort Colors

/*
📜 Problem Description:
Given an array nums with n objects colored red, white, or blue (represented by 0, 1, and 2),
sort them in-place so that objects of the same color are adjacent, with the colors in the order red (0), white (1), and blue (2).

You must solve this problem without using the library's sort function.

🧠 Intuition:
Since there are only 3 distinct values (0, 1, 2), we can:
1. Use counting sort (brute-force) - Count how many of each and overwrite.
2. Use Dutch National Flag Algorithm for optimal one-pass solution.

🔍 Dry Run:
Input:  [2,0,2,1,1,0]
Sorted: [0,0,1,1,2,2]

🔨 Brute Force Approach (Counting Sort):
- Count number of 0s, 1s, and 2s.
- Overwrite the array accordingly.

Time Complexity: O(n)
Space Complexity: O(1)

⚡ Optimized Approach (Dutch National Flag Algorithm):
- Maintain three pointers: low, mid, high.
- Swap elements based on mid's value:
    - If nums[mid] == 0 → swap with low, increment both.
    - If nums[mid] == 1 → just increment mid.
    - If nums[mid] == 2 → swap with high, decrement high.

Time Complexity: O(n)
Space Complexity: O(1)
*/

package leetcode;

import java.util.Arrays;

class MediumLeetCode75 {

    public void sortColors(int[] nums) {
        // Brute Force Approach (Counting Sort)
        int zeros = (int) Arrays.stream(nums).filter(n -> n == 0).count();
        int ones = (int) Arrays.stream(nums).filter(n -> n == 1).count();
        int twos = (int) Arrays.stream(nums).filter(n -> n == 2).count();

        int index = 0;
        for (int i = 0; i < zeros; i++) nums[index++] = 0;
        for (int i = 0; i < ones; i++) nums[index++] = 1;
        for (int i = 0; i < twos; i++) nums[index++] = 2;

//      ---------------------------------------------------------------------------

        // Optimized One-Pass Solution (Dutch National Flag Algorithm)
            // [2,0,1] -> swap 2 <-> 1 , mid++ , swap  1 <-> 0

        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if(nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
        }
    }
}

public class LeetCode75 {
    public static void main(String[] args) {
        MediumLeetCode75 obj = new MediumLeetCode75();
        int[] arr = {2, 0, 2, 1, 1, 0};
        obj.sortColors(arr);
        System.out.println("Sorted colors: " + Arrays.toString(arr));
    }
}
