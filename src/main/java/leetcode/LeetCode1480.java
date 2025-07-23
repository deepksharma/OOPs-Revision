package leetcode;

class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + nums[i];
            temp[i] = sum;
        }
        return temp;
    }
}

public class LeetCode1480 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {1,2,3,4,5};
        int[] result = sol.runningSum(arr);
        for(int i : result){
            System.out.print(i+" ");
        }
    }


}
