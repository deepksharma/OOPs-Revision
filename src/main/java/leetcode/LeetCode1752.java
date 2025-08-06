package leetcode;

class SortedAndRotated {
    public boolean check(int[] nums) {
       int n = nums.length;
       int count =0;
       for(int i = 0 ; i < n ; i++){
           if(nums[i] > nums[(i+1)%n]){
               count++;
           }
       }
       if(count > 1){
           return false;
       }
       return true;
    }
}
public class LeetCode1752 {
    public static void main(String[] args) {
        SortedAndRotated solu = new SortedAndRotated();
       // int[] arr = {4 , 5 ,1, 2 , 3};
        int[] arr = {3, 4, 5, 1, 2, 0};
        boolean result = solu.check(arr);
        System.out.println(result);
    }

}
