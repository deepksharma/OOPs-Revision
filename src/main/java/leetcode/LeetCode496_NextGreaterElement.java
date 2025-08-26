/*
===========================================
📝 Problem: Next Greater Element I
🔗 Link: https://leetcode.com/problems/next-greater-element-i/

===========================================
📌 Problem Statement:
The "next greater element" of some element x in an array is the first greater element that is
to the right of x in the same array.

You are given two distinct integer arrays `nums1` and `nums2`, where `nums1` is a subset of `nums2`.

For each element in `nums1`, find the next greater element in `nums2`.
If it does not exist, return -1 for that element.

Return an array `res` where:
- res[i] is the next greater element of nums1[i] in nums2,
- or -1 if no such greater element exists.

===========================================
💡 Intuition:
- We need to find the "next greater element" for each element of `nums1` **based on nums2’s order**.
- Brute force idea → For each element in `nums1`, locate it in `nums2`, then scan to the right to find the first greater number.
- Optimized idea → Use a **monotonic stack** to pre-compute next greater elements for all elements in `nums2` and then map results for `nums1`.

===========================================
🛠️ Approach (Brute Force, implemented here):
1. Iterate through each element of `nums1`.
2. Find its index in `nums2`.
3. From that index onward, scan to the right until:
   - you find a greater element → assign as result.
   - you reach the end → assign -1.
4. Store results in an array and return.

This is straightforward but not optimal (nested loops).

===========================================
📊 Time Complexity:
- Outer loop: O(m) where m = nums1.length
- Inner loops: O(n) where n = nums2.length
- Worst case: O(m * n)

📦 Space Complexity:
- O(m) for result array.
- No extra data structures → O(1) auxiliary space.

===========================================
🔄 Dry Run:
nums1 = [4, 1, 2]
nums2 = [1, 3, 4, 2]

Step 1: Take 4 from nums1.
- Find 4 in nums2 → index 2
- Look right → [2], no greater → result = -1

Step 2: Take 1 from nums1.
- Find 1 in nums2 → index 0
- Look right → 3 > 1 → result = 3

Step 3: Take 2 from nums1.
- Find 2 in nums2 → index 3
- No elements to the right → result = -1

Final Result: [-1, 3, -1]

===========================================
✅ Code Implementation:
*/

package leetcode;

import java.util.Arrays;

public class LeetCode496_NextGreaterElement {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            int pos = -1;

            // Find index of num in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == num) {
                    pos = j;
                    break;
                }
            }

            res[i] = -1; // Default: no greater element
            // Look right in nums2
            for (int k = pos + 1; k < nums2.length; k++) {
                if (nums2[k] > num) {
                    res[i] = nums2[k];
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] ans = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(ans)); // Output: [-1, 3, -1]
    }
}
