package algorithms;

/*
===============================
Binary Search Patterns in Java
===============================

Binary Search is not just about finding an element in a sorted array.
There are multiple **patterns**:
1. Standard Binary Search (Exact match)
2. First Occurrence / Last Occurrence
3. Lower Bound / Upper Bound
4. Search in Rotated Sorted Array
5. Find Peak Element (Binary Search on answer)
6. Binary Search on Answer (optimization problems)

Each pattern below:
- Self-explanatory comments
- Dry run in comments
- Output in comments
- Covers edge cases

------------------------------------
PATTERN 1: STANDARD BINARY SEARCH
------------------------------------
Find index of target if present, else return -1
*/

public class BinarySearch {

    // 1. Standard Binary Search
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // avoid overflow
            if (arr[mid] == target) {
                return mid; // found target
            } else if (arr[mid] < target) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }
        return -1; // not found
    }

    /*
    Example:
    arr = [1, 3, 5, 7, 9], target = 5
    Dry run:
    low=0, high=4, mid=2 -> arr[mid]=5 => found
    Output: 2
    */

    //------------------------------------
    // PATTERN 2: FIRST OCCURRENCE
    //------------------------------------
    public static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid; // store index
                high = mid - 1; // go left to find earlier occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    //------------------------------------
    // PATTERN 3: LAST OCCURRENCE
    //------------------------------------
    public static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1; // go right to find later occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    //------------------------------------
    // PATTERN 4: LOWER BOUND
    //------------------------------------
    // Smallest index where arr[i] >= target
    public static int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid; // possible answer
            }
        }
        return low;
    }

    //------------------------------------
    // PATTERN 5: UPPER BOUND
    //------------------------------------
    // Smallest index where arr[i] > target
    public static int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    //------------------------------------
    // PATTERN 6: SEARCH IN ROTATED SORTED ARRAY
    //------------------------------------
    public static int searchRotated(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;

            // Left part sorted
            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right part sorted
            else {
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    //------------------------------------
    // PATTERN 7: FIND PEAK ELEMENT
    //------------------------------------
    // A peak element is one which is greater than both neighbors
    public static int findPeakElement(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1; // peak is right
            } else {
                high = mid; // peak is left or at mid
            }
        }
        return low; // index of peak
    }

    //------------------------------------
    // MAIN METHOD FOR TESTING ALL PATTERNS
    //------------------------------------
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 5, 7, 9};

        System.out.println("Standard BS (find 5): " + binarySearch(arr, 5)); // 4
        System.out.println("First occurrence of 3: " + firstOccurrence(arr, 3)); // 1
        System.out.println("Last occurrence of 3: " + lastOccurrence(arr, 3)); // 3
        System.out.println("Lower bound of 4: " + lowerBound(arr, 4)); // 4 (index of 5)
        System.out.println("Upper bound of 3: " + upperBound(arr, 3)); // 4
        System.out.println("Search in rotated: " + searchRotated(new int[]{4,5,6,7,0,1,2}, 0)); // 4
        System.out.println("Peak element index: " + findPeakElement(new int[]{1,2,3,1})); // 2
    }
}

