package algorithms;

/*
======================================================
            ALGORITHM CHEATSHEET - TWO POINTER
======================================================
📌 CONCEPT:
Two pointers technique involves using two indices to iterate
over a data structure (array, string, linked list) to achieve
efficient solutions without extra space.

✅ Common Use Cases:
1. Searching in sorted arrays
2. Finding pairs with given sum
3. Removing duplicates in-place
4. Palindrome checking
5. Reversing arrays/strings in-place

Time Complexity: Usually O(n)
Space Complexity: O(1)

======================================================
*/

import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {

        /*
        ========================
        EXAMPLE 1: Check if Pair Exists with Given Sum (Sorted Array)
        ========================
        */
        int[] arr1 = {1, 2, 3, 4, 6, 8, 9};
        int target = 10;

        int left = 0, right = arr1.length - 1;
        boolean found = false;

        while (left < right) {
            int sum = arr1[left] + arr1[right];
            if (sum == target) {
                System.out.println("Pair found: " + arr1[left] + ", " + arr1[right]); // 2, 8
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        if (!found) System.out.println("No pair found");

        /*
        ========================
        EXAMPLE 2: Remove Duplicates from Sorted Array (In-place)
        ========================
        */
        int[] arr2 = {1, 1, 2, 2, 3, 4, 4, 5};
        int uniqueIndex = 0;

        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] != arr2[uniqueIndex]) {
                uniqueIndex++;
                arr2[uniqueIndex] = arr2[i];
            }
        }
        System.out.println("Array after removing duplicates: " +
                Arrays.toString(Arrays.copyOfRange(arr2, 0, uniqueIndex + 1)));
        // Output: [1, 2, 3, 4, 5]

        /*
        ========================
        EXAMPLE 3: Palindrome Check (String)
        ========================
        */
        String str = "racecar";
        int l = 0, r = str.length() - 1;
        boolean isPalindrome = true;

        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                isPalindrome = false;
                break;
            }
            l++;
            r--;
        }
        System.out.println("Is \"" + str + "\" palindrome? " + isPalindrome); // true

        /*
        ========================
        EXAMPLE 4: Reverse Array In-place
        ========================
        */
        int[] arr3 = {10, 20, 30, 40, 50};
        int start = 0, end = arr3.length - 1;

        while (start < end) {
            int temp = arr3[start];
            arr3[start] = arr3[end];
            arr3[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr3));
        // Output: [50, 40, 30, 20, 10]
    }
}

