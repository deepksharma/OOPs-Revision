package leetcode;
/*
Problem Title: Container With Most Water ( directly go for optimised)
Link: https://leetcode.com/problems/container-with-most-water/

Problem Description:
You are given an integer array height of length n. There are n vertical lines drawn
such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the
container contains the most water.

Return the maximum amount of water a container can store.

Intuition:
The amount of water between two lines depends on:
1. The distance between them (width)
2. The shorter line (height)

So, water area = width * min(height[i], height[j]).
We want the maximum possible area.

---

Dry Run (Optimized Example):
height = [1,8,6,2,5,4,8,3,7]

left = 0, right = 8
width = 8, minHeight = 1, area = 8*1 = 8 → maxArea = 8
Move left++ because height[left] < height[right]

left = 1, right = 8
width = 7, minHeight = 7, area = 49 → maxArea = 49
Move right-- because height[left] > height[right]

...continue until left < right.

---

Brute Force Approach:
Time Complexity: O(n^2)
Space Complexity: O(1) (apart from optional list storage)
We try all pairs (i, j) and compute the area.
*/

class SolutionBrute {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int area = (j - i) * Math.min(height[i], height[j]);
                if (area > max) max = area;
            }
        }
        return max;
    }
}

/*
Optimized Approach (Two Pointer):
Time Complexity: O(n)
Space Complexity: O(1)
We use two pointers (left, right) and move the smaller height pointer inward
because moving the taller one won't increase the area (height is limited by the smaller one).
*/

class SolutionOptimized {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int area = width * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}

/*
Main Method for Testing:
*/

public class LeetCode11 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

        SolutionBrute brute = new SolutionBrute();
        System.out.println("Brute Force Result: " + brute.maxArea(height));

        SolutionOptimized opt = new SolutionOptimized();
        System.out.println("Optimized Result: " + opt.maxArea(height));
    }
}
