package leetcode;

import java.util.Arrays;

// Brute force

class Sol {
    public int[] searchRange(int[] nums, int target) {

        int[] arr = {-1,-1};
        for(int i =0 ; i<nums.length ; i++){
            if(nums[i] == target){
                arr[0] = i;
                break;
            }
        }
        if(arr[0]== -1){
            return new int[]{-1,-1};
        }

        for(int j = nums.length-1 ; j>=0 ; j--){
            if(nums[j] == target){
                arr[1] = j;
                break;
            }
        }
        return arr;
    }
}



// Optimised
class Solu{
    public int[] searchRange(int[] nums , int target){
        int first = searchFirst(nums , target);
        int last = searchLast(nums , target);
        return new int[]{first,last};
    }
    public int searchFirst(int[] nums ,int target){
        int res = -1;
        int start = 0;
        int end = nums.length-1;

        while (start <=  end){

            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                res = mid;
                end = mid -1; // to search for 1st occurrence in searchFirst
            } else if (nums[mid] > target) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }
    public int searchLast(int[] nums , int target){
        int res = -1;
        int start = 0;
        int end = nums.length -1;

        while (start <= end){

            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                res = mid;
                start = mid + 1;  // to search for last occurrence in searchLast
            } else if (nums[mid] > target) {
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return res;
    }
}


public class LeetCode34 {
    public static void main(String[] args) {
        Solu solu = new Solu();
        int[] arr = {5,7,7,8,8,10};
        int tagret = 8;

        int[] result = solu.searchRange(arr , tagret);
        System.out.println("Start Index : "+ result[0]);
        System.out.println("Last Index : "+ result[1]);

    }
}
