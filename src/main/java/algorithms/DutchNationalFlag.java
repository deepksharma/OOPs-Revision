package algorithms;

/*
======================================================
            Dutch National Flag Algorithm
======================================================

Concept:
--------
The Dutch National Flag problem is used to sort an array
containing only three distinct elements (commonly 0, 1, 2)
in linear time and constant space.

It was proposed by Edsger Dijkstra.

Rules:
------
We use three pointers:
1. low  - boundary for elements less than the mid value (0's zone).
2. mid  - current element under examination.
3. high - boundary for elements greater than the mid value (2's zone).

The idea:
---------
- If arr[mid] == 0 → swap arr[low] and arr[mid], increment both low & mid.
- If arr[mid] == 1 → correct place, just increment mid.
- If arr[mid] == 2 → swap arr[mid] and arr[high], decrement high (mid not incremented here because swapped value needs checking).

When to use:
------------
- Sorting arrays with only 3 distinct values (like RGB, 0-1-2).
- Partitioning problems where you need to group items into 3 categories.
- Preprocessing step for certain algorithms like counting sort variations.

Time Complexity:
----------------
O(n) - single pass through the array.

Space Complexity:
-----------------
O(1) - in-place sorting.
*/

import java.util.Arrays;

public class DutchNationalFlag {

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sortColors(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        // Output: [0, 0, 1, 1, 2, 2]
    }

    private static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        // Loop until mid pointer crosses high pointer
        while (mid <= high) {
            if (nums[mid] == 0) {
                // Put 0 in the low section
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // Leave 1 in the middle section
                mid++;
            } else { // nums[mid] == 2
                // Put 2 in the high section
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

